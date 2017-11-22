package com.riqthen.myandroid.retrofit;

import com.riqthen.myandroid.address.AddressEntity;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by H on 2017/11/22 09:41
 */

public interface Api {
    @POST("address_list.do")
    Call<AddressEntity> getAddress(@Query("adJson") String adJson);
}
