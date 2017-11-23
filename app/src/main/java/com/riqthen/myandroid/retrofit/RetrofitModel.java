package com.riqthen.myandroid.retrofit;


import android.support.annotation.NonNull;

import com.riqthen.myandroid.address.AddressEntity;

import org.json.JSONException;
import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by H on 2017/11/22 09:48
 */

public class RetrofitModel {
    public static void getAddress(final RetrofitCallback<AddressEntity> retrofitCallback) {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("userId", "15555555555");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Api api = RetrofitHttp.getInstance().getApi();
        Call<AddressEntity> call = api.getAddress(jsonObject.toString());
        call.enqueue(new Callback<AddressEntity>() {
            @Override
            public void onResponse(@NonNull Call<AddressEntity> call, @NonNull Response<AddressEntity> response) {
                retrofitCallback.onResponse(call, response);
            }

            @Override
            public void onFailure(@NonNull Call<AddressEntity> call, @NonNull Throwable t) {
                retrofitCallback.onFailure(call, t);
            }
        });
    }
}
