package com.example.videotest;

import android.app.Application;

import com.example.videotest.utils.TUtil;

/**
 * @author H
 * @date 2017/12/21 09:22
 * @description
 */
public class VideoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        TUtil.init(this);
    }
}
