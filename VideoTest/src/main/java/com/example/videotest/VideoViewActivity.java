package com.example.videotest;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.videotest.utils.Lcat;
import com.example.videotest.utils.TUtil;

import java.io.File;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class VideoViewActivity extends AppCompatActivity {

    @BindView(R.id.vv)
    VideoView mVv;
    @BindView(R.id.btn_play)
    Button mBtnPlay;
    private MediaController mController;
    private File mFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_video_view);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
//        mVv.setVideoPath(Config.path3);
//        mVv.setVideoURI(Uri.parse(Config.path3));
        mController = new MediaController(this);
        mVv.setMediaController(mController);
//        mController.setMediaPlayer(mVv);

        mFile = new File(Environment.getExternalStorageDirectory() + "/DCIM/", "demo3.mp4");
        Lcat.e("路径", mFile.getAbsolutePath());

        if (mFile.exists()) {
            mVv.setVideoPath(mFile.getAbsolutePath());
        } else {
            TUtil.show("文件不存在");
            Lcat.e("", "文件不存在");
        }
    }

    @OnClick({R.id.btn_play})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_play:
                if (mVv.isPlaying()) {
                    mVv.pause();
                    mBtnPlay.setText("播放");
                } else {
                    mVv.start();
                    mBtnPlay.setText("暂停");
                }
                break;

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (null != mVv) {
            mVv.suspend();
        }
    }
}
