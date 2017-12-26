package com.riqthen.myandroid;

import android.Manifest;
import android.os.Environment;

/**
 * Created by H on 2017/11/21 14:26
 */

public class Config {
    public static final String URL = "http://120.24.77.131:8090/dcxt/address_list.do";


    public static final String URL_BASE = "http://120.24.77.131:8090/dcxt/";


    public static final String URL_ADDRESS = "address_list.do";


    public static String perms[] = {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE};
    public static final String path1 = Environment.getExternalStorageDirectory().getPath() + "/DCIM/demo.avi";
    public static final String path2 = Environment.getExternalStorageDirectory().getPath() + "/DCIM/demo2.avi";
    public static final String path_image = Environment.getExternalStorageDirectory().getPath() + "/DCIM/ui.png";


}
