package com.example.videotest;

import android.Manifest;
import android.os.Environment;

/**
 * Created by H on 2017/11/21 14:26
 */

public class Config {
    public static String perms[] = {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE};
    public static final String path1 = Environment.getExternalStorageDirectory().getPath() + "/DCIM/demo.avi";
    public static final String path2 = Environment.getExternalStorageDirectory().getPath() + "/DCIM/demo2.avi";
    public static final String path3 = Environment.getExternalStorageDirectory().getPath() + "/DCIM/demo3.mp4";
    public static final String path4 = "http://120.25.246.21/vrMobile/travelVideo/zhejiang_xuanchuanpian.mp4";
    public static final String path_image = Environment.getExternalStorageDirectory().getPath() + "/DCIM/ui.png";


}
