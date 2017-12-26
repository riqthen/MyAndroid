package com.example.videotest;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.videotest.utils.Lcat;
import com.example.videotest.utils.TUtil;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;
import pub.devrel.easypermissions.EasyPermissions;

public class MainActivity extends AppCompatActivity implements EasyPermissions.PermissionCallbacks {

    private String[] perms = {Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE};
    private boolean hasPermissions = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        if (EasyPermissions.hasPermissions(this, perms)) {
            hasPermissions = true;
        } else {
            EasyPermissions.requestPermissions(this, "请求内存卡权限", 0x489, perms);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }

    @Override
    public void onPermissionsGranted(int requestCode, @NonNull List<String> perms) {
        hasPermissions = true;
    }

    @Override
    public void onPermissionsDenied(int requestCode, @NonNull List<String> perms) {
        hasPermissions = false;
    }

    @OnClick({R.id.btn_video_view, R.id.btn_player})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_video_view:
                if (hasPermissions) {
                    startActivity(new Intent(this, VideoViewActivity.class));
                } else {
                    TUtil.show("没有权限");
                    Lcat.e("没有权限", perms);
                }
                break;
            case R.id.btn_player:
                startActivity(new Intent(this,PlayerActivity.class));
                break;
        }
    }
}
