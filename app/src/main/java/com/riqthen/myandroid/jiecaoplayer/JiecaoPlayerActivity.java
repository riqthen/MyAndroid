package com.riqthen.myandroid.jiecaoplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.riqthen.myandroid.R;

public class JiecaoPlayerActivity extends AppCompatActivity/* implements EasyPermissions.PermissionCallbacks*/ {
//    public static String path = Environment.getExternalStorageDirectory().getPath() + "/DCIM/demo.avi";
//
//    @BindView(R.id.player)
//    JZVideoPlayerStandard mPlayer;
//
//    private String[] permissions = new String[]{Manifest.permission.READ_EXTERNAL_STORAGE};
//
//    private boolean ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Lcat.e("权限", EasyPermissions.hasPermissions(this, permissions));
//        if (!EasyPermissions.hasPermissions(this, permissions)) {
//            EasyPermissions.requestPermissions(this, "请求电话权限", 0x1, permissions);
//            ok = true;
//        }
        setContentView(R.layout.activity_jiecao_player);
//        ButterKnife.bind(this);

//        if (ok)
//            init();
    }

//    private void init() {
//        final List<MovieDownloadedEntity> movieDownloadedEntities = new ArrayList<>();
//        List<File> files = FileUtils.listFilesInDir(Environment.getExternalStorageDirectory().getPath() + "/DCIM");
//        Lcat.e("files", files);
//        for (int i = 0; i < files.size(); i++) {
//            File file = files.get(i);
//            if (!file.isDirectory()) {
//                if (file.getName().endsWith(".avi") || file.getName().endsWith(".mp4") || file.getName().endsWith(".3gp")) {
//                    MovieDownloadedEntity movieDownloadedEntity = new MovieDownloadedEntity(file.getName()
//                            , file.getPath(), FileUtils.getFileSize(new File(file.getPath())));
//                    movieDownloadedEntities.add(movieDownloadedEntity);
//                }
//            }
//        }
//        Lcat.e("movieDownloadedEntities1", movieDownloadedEntities);
////        MovieDownloadedEntity movieDownloadedEntity = (MovieDownloadedEntity) getIntent().getSerializableExtra("movieDownloadedEntity");
//        mPlayer.setUp(movieDownloadedEntities.get(0).getMoviePathDownloaded(), JZVideoPlayerStandard.SCREEN_WINDOW_NORMAL, movieDownloadedEntities.get(0).getMovieNameDownloaded());
//        mPlayer.setOnEntityListener(new JZVideoPlayerStandard.OnEntityItemClickListener() {
//            @Override
//            public void onEntityItemClick(MovieDownloadedEntity movieDownloadedEntity) {
//                movieDownloadedEntity.setClicked(true);
//                JZVideoPlayer.releaseAllVideos();
//                mPlayer.setUp(movieDownloadedEntity.getMoviePathDownloaded(), JZVideoPlayerStandard.SCREEN_WINDOW_NORMAL, movieDownloadedEntity.getMovieNameDownloaded());
//                mPlayer.play();
//                Lcat.e("movieDownloadedEntities3", movieDownloadedEntities);
//                mPlayer.notifyDataSetChanged();
//            }
//        });
////        Lcat.e("movieDownloadedEntities", movieDownloadedEntities.size() + " " + movieDownloadedEntities);
//
////        mPlayer.thumbImageView.setImageResource(R.mipmap.ic_launcher_round);
//
//
//    }

    //成功
//    @Override
//    public void onPermissionsGranted(int requestCode, List<String> list) {
//        init();
//    }
//
//    //失败
//    @Override
//    public void onPermissionsDenied(int requestCode, List<String> list) {
//        TUtil.show("没有权限");
//    }

//    @Override
//    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
//    }

//    @Override
//    public void onBackPressed() {
//        if (JZVideoPlayer.backPress()) {
//            return;
//        }
//        super.onBackPressed();
//    }

//    @Override
//    protected void onPause() {
//        super.onPause();
//        JZVideoPlayer.releaseAllVideos();
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        JZVideoPlayer.releaseAllVideos();
//    }
}
