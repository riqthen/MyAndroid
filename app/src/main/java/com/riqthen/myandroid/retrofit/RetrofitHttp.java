package com.riqthen.myandroid.retrofit;

import com.riqthen.myandroid.Config;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author H
 * @date 2017/11/22 09:42
 * @description 获取api对象
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
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    OkHttpClient client = builder
                            .readTimeout(1000, TimeUnit.MILLISECONDS)
                            .writeTimeout(1000, TimeUnit.MILLISECONDS)
                            .connectTimeout(1000,TimeUnit.MILLISECONDS)
                            .build();
                    Retrofit retrofit = new Retrofit.Builder()
                            .baseUrl(Config.URL_BASE)
                            .addConverterFactory(GsonConverterFactory.create())
                            .client(client)
                            .build();
                    api = retrofit.create(Api.class);
                }
            }
        }
        return api;
    }
}
