package com.riqthen.myandroid.retrofit;


import android.support.annotation.NonNull;

import com.riqthen.myandroid.address.AddressEntity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by H on 2017/11/22 09:48
 */

public class RetrofitModel {
//    private static volatile RetrofitModel instance;
//
//    public static RetrofitModel getInstance() {
//        if (instance == null) {
//            synchronized (RetrofitHttp.class) {
//                if (instance == null) {
//                    instance = new RetrofitModel();
//                }
//            }
//        }
//        return instance;
//    }


    public static void getAddress(String adJson) {
        Api api = RetrofitHttp.getInstance().getApi();
        Call<AddressEntity> call = api.getAddress(adJson);
        call.enqueue(new Callback<AddressEntity>() {
            @Override
            public void onResponse(@NonNull Call<AddressEntity> call, @NonNull Response<AddressEntity> response) {
            }

            @Override
            public void onFailure(@NonNull Call<AddressEntity> call, @NonNull Throwable t) {
            }
        });
    }
}
