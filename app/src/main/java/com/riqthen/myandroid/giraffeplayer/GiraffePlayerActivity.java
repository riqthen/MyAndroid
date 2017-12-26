package com.riqthen.myandroid.giraffeplayer;

import android.Manifest;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import com.riqthen.myandroid.R;
import com.riqthen.myandroid.utils.TUtil;

import java.util.List;

import pub.devrel.easypermissions.EasyPermissions;

public class GiraffePlayerActivity extends AppCompatActivity implements EasyPermissions.PermissionCallbacks {
    private String perms[] = {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE};
    public static final String path1 = Environment.getExternalStorageDirectory().getPath() + "/DCIM/demo.avi";
    public static final String path2 = Environment.getExternalStorageDirectory().getPath() + "/DCIM/demo2.avi";
    public static final String path_image = Environment.getExternalStorageDirectory().getPath() + "/DCIM/ui.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giraffe_player);
        if (!EasyPermissions.hasPermissions(this, perms)) {
            EasyPermissions.requestPermissions(this, "请求权限", 0x1, perms);
        } else {
            todo();
        }
    }

    private void todo() {
        VideoDetailInfo info = MockUtils.mockData(VideoDetailInfo.class);
        VideoDetailActivity.start(this, info);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }

    @Override
    public void onPermissionsGranted(int requestCode, @NonNull List<String> perms) {
        todo();
    }

    @Override
    public void onPermissionsDenied(int requestCode, @NonNull List<String> perms) {
        TUtil.show("没有权限");
    }
}
