package com.riqthen.myandroid.retrofit;

import com.riqthen.myandroid.Config;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by H on 2017/11/22 09:42
 */

public class RetrofitHttp {
    private static volatile RetrofitHttp instance;
    private Api api;

    public static RetrofitHttp getInstance() {
        if (instance == null) {
            synchronized (RetrofitHttp.class) {
                if (instance == null) {
                    instance = new RetrofitHttp();
                }
            }
        }
        return instance;
    }

    public Api getApi() {
        if (api == null) {
            synchronized (RetrofitHttp.class) {
                if (api == null) {
                    Retrofit retrofit = new Retrofit.Builder()
                            .baseUrl(Config.URL_BASE)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                    api = retrofit.create(Api.class);
                }
            }
        }
        return api;
    }
}
