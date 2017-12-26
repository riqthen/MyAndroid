package com.riqthen.myandroid;

import android.app.Application;

import com.flowerfat.volleyutil.main.VolleyUtils;
import com.riqthen.myandroid.utils.TUtil;

import cn.finalteam.okhttpfinal.OkHttpFinal;
import cn.finalteam.okhttpfinal.OkHttpFinalConfiguration;

/**
 * Created by H on 2017/11/20 15:51
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        OkHttpFinal.getInstance().init(new OkHttpFinalConfiguration.Builder().build());
        VolleyUtils.getInstance().init(this);
        TUtil.init(this);
    }
}
