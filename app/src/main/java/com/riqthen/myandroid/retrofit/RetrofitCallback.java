package com.riqthen.myandroid.retrofit;

import android.support.annotation.NonNull;

import retrofit2.Call;
import retrofit2.Response;

/**
 * @author H
 * @date 2017/11/23 09:27
 * @description 接口在Activity中调用
 */
public interface RetrofitCallback<T> {
    void onResponse(@NonNull Call<T> call, @NonNull Response<T> response);

    void onFailure(@NonNull Call<T> call, @NonNull Throwable t);
}
