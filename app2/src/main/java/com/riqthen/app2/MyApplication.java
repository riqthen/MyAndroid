package com.riqthen.app2;

import android.app.Application;

import com.riqthen.mylibrary.utils.TUtil;

/**
 * @author H
 * @date 2018/2/1 17:20
 * @description
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        TUtil.init(this);
    }

}