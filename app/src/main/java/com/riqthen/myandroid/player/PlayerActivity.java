package com.riqthen.myandroid.player;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;

import com.riqthen.myandroid.R;
import com.riqthen.myandroid.utils.MyUtils;

import java.util.List;

import butterknife.ButterKnife;
import pub.devrel.easypermissions.EasyPermissions;

import static android.view.View.VISIBLE;

public class PlayerActivity extends AppCompatActivity implements MediaPlayer.OnPreparedListener, SeekBar.OnSeekBarChangeListener, EasyPermissions.PermissionCallbacks {
    public static final String path = Environment.getExternalStorageDirectory().getPath() + "/DCIM/demo.avi";
    public static final String path1 = Environment.getExternalStorageDirectory().getPath() + "/.Android/movies/demo测试1.avi";

    private MediaPlayer mediaPlayer;
    private SurfaceView sv_video;
    private RelativeLayout rl_top;
    private Button bt_start_or_pause;// 播放或暂停按钮
    private SeekBar sb_progress;// 视频进度条
    ImageView mChangeSceen;
    ImageView mCenterPause;
    LinearLayout mllmenu;
    LinearLayout mlltitle;
    private SeekBar sb_vol;// 音量进度条
    private AudioManager am;
    private int currentPosition;// 记录当前进度值
    private boolean ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        ButterKnife.bind(this);
        MyUtils.DeviceUtils.hideNavigationBarAndStatusBar(this);
        initView();
        checkPermissions();
        if (ok) {
            initData();
        }
    }

    private String[] perms = {Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE};

    private void checkPermissions() {
        if (EasyPermissions.hasPermissions(this, perms)) {
            ok = true;
        } else {
            EasyPermissions.requestPermissions(this, "拍照需要摄像头权限", 0x1, perms);
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }

    //成功
    @Override
    public void onPermissionsGranted(int requestCode, List<String> list) {
        ok = true;
    }

    //失败
    @Override
    public void onPermissionsDenied(int requestCode, List<String> list) {
        ok = false;
    }

    private void initView() {
        MyUtils.DeviceUtils.setNavigationBar(this, VISIBLE);
        sv_video = (SurfaceView) findViewById(R.id.sv_video);
        bt_start_or_pause = (Button) findViewById(R.id.bt_start_or_pause);
        rl_top = (RelativeLayout) findViewById(R.id.rl_top);
        sb_progress = (SeekBar) findViewById(R.id.sb_progress);
        sb_vol = (SeekBar) findViewById(R.id.sb_vol);
        mChangeSceen = (ImageView) findViewById(R.id.bt_change);
        mCenterPause = (ImageView) findViewById(R.id.video_center_pause);
        mllmenu = (LinearLayout) findViewById(R.id.video_menu);
        mlltitle = (LinearLayout) findViewById(R.id.video_menu_title);
        // sv_video.getHolder().setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);//
        // 兼容2.3及以下版本，否则只有声音没有画面
        sv_video.getHolder().addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                // 当页面可见时候
                playVideo();
            }

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {
                // 当页面不可见时候
                stopVideo();
            }

            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

            }
        });
    }

    private void initData() {
        registerReceiver(volReceiver, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        am = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        // 保持屏幕常亮
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        sb_vol.setMax(am.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
        sb_vol.setProgress(am.getStreamVolume(AudioManager.STREAM_MUSIC));
        sb_progress.setOnSeekBarChangeListener(this);
        sb_vol.setOnSeekBarChangeListener(this);
    }

    private void playVideo() {
        mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource(this, Uri.parse(path));
            mediaPlayer.setLooping(true);
            mediaPlayer.setOnPreparedListener(this);
            mediaPlayer.setDisplay(sv_video.getHolder());
            mediaPlayer.prepareAsync();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void stopVideo() {
        canProgress = false;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            try {
                currentPosition = mediaPlayer.getCurrentPosition();
                mediaPlayer.pause();
                mediaPlayer.stop();
                mediaPlayer.release();
                mediaPlayer = null;
            } catch (Exception e) {
            }
        }
    }

    @Override
    public void onPrepared(MediaPlayer mp) {
        // 说明mediaPlayer准备好了
        try {
            sb_progress.setMax(mp.getDuration());
            setParam(mp, isLand());
            mp.start();
            if (currentPosition > 0) {
                mp.seekTo(currentPosition);
                currentPosition = 0;
            }
            startProgress();
        } catch (Exception e) {
        }
    }

    /**
     * 判断当前是否横屏
     *
     * @return
     */
    private boolean isLand() {
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            return false;
        } else {
            return true;
        }
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Log.e("pid", "竖屏了");
            setParam(mediaPlayer, false);
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Log.e("pid", "横屏了");
            // 去除状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
            setParam(mediaPlayer, true);
        }
    }

    /**
     * 设置视频尺寸，达到不被拉伸的效果
     *
     * @param mp
     * @param isLand
     */
    private void setParam(MediaPlayer mp, boolean isLand) {
        float screenWidth = getWindowManager().getDefaultDisplay().getWidth();
        float screenHeight = screenWidth / 16f * 9f;
        if (isLand) {
            screenHeight = getWindowManager().getDefaultDisplay().getHeight();
        }
        float videoWdith = mp.getVideoWidth();
        float videoHeight = mp.getVideoHeight();

        float screenPor = screenWidth / screenHeight;// 16:9
        float videoPor = videoWdith / videoHeight;// 9:16

        ViewGroup.LayoutParams pa = sv_video.getLayoutParams();
        if (videoPor <= screenPor) {
            pa.height = (int) screenHeight;
            pa.width = (int) (screenHeight * videoPor);
        } else {
            pa.width = (int) screenWidth;
            pa.height = (int) (screenWidth / videoPor);
        }
        ViewGroup.LayoutParams rl_pa = rl_top.getLayoutParams();
        rl_pa.width = pa.width;
        rl_pa.height = pa.height;
        rl_top.setLayoutParams(rl_pa);
        sv_video.setLayoutParams(pa);
    }

    private boolean canProgress = true;

    private void startProgress() {
        canProgress = true;
        new Thread() {
            public void run() {
                while (canProgress) {
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    sb_progress.setProgress(mediaPlayer.getCurrentPosition());
                }
            }

            ;
        }.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(volReceiver);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if (!fromUser)
            return;
        switch (seekBar.getId()) {
            case R.id.sb_progress:
                try {
                    if (mediaPlayer != null) {
                        mediaPlayer.seekTo(progress);
                    }
                } catch (Exception e) {
                }
                break;
            case R.id.sb_vol:
                am.setStreamVolume(AudioManager.STREAM_MUSIC, progress,
                        AudioManager.FLAG_SHOW_UI);
                break;
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    /**
     * 系统音量改变时的广播接收者
     */
    private BroadcastReceiver volReceiver = new BroadcastReceiver() {

        @Override
        public void onReceive(Context context, Intent intent) {
            sb_vol.setProgress(am.getStreamVolume(AudioManager.STREAM_MUSIC));
        }
    };

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_start_or_pause:
                try {
                    if (bt_start_or_pause.getText().equals("播放")) {
                        // 当前是播放，那么暂停
                        mediaPlayer.pause();
                        // canProgress = false;
                        bt_start_or_pause.setText("暂停");
                        mCenterPause.setVisibility(VISIBLE);
                    } else if (bt_start_or_pause.getText().equals("暂停")) {
                        // 当前是暂停，那么播放
                        mediaPlayer.start();
                        // canProgress = true;
                        bt_start_or_pause.setText("播放");
                        mCenterPause.setVisibility(View.GONE);
                    }
                } catch (Exception e) {
                }
                break;
            case R.id.bt_change:
                // 点击了横竖屏切换，拿到当前屏幕方向
                if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                    // 当前是竖屏，切换成横屏
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
                } else {
                    // 当前是横屏，切换成竖屏
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

                }
                break;
            case R.id.video_center_pause:
                try {
                    if (bt_start_or_pause.getText().equals("播放")) {
                        // 当前是播放，那么暂停
                        mediaPlayer.pause();
                        // canProgress = false;
                        bt_start_or_pause.setText("暂停");
                    } else if (bt_start_or_pause.getText().equals("暂停")) {
                        // 当前是暂停，那么播放
                        mediaPlayer.start();
                        // canProgress = true;
                        bt_start_or_pause.setText("播放");
                    }
                } catch (Exception e) {
                }
                mCenterPause.setVisibility(View.GONE);
                break;
        }
    }

    /**
     * 定时隐藏
     */
    private Handler mDismissHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            mllmenu.setVisibility(View.GONE);
            mlltitle.setVisibility(View.GONE);  //标题栏的自动隐藏
        }
    };

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            mllmenu.setVisibility(VISIBLE);
            mlltitle.setVisibility(VISIBLE);  //标题栏的显示
        }
        mDismissHandler.sendEmptyMessageDelayed(0, 3000);
        return super.onTouchEvent(event);
    }
}
