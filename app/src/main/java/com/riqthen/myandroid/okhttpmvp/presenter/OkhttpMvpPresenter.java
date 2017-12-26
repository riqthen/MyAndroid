package com.riqthen.myandroid.okhttpmvp.presenter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.riqthen.myandroid.Config;
import com.riqthen.myandroid.address.AddressEntity;
import com.riqthen.myandroid.okhttpmvp.contract.OkhttpMvpContract;
import com.riqthen.myandroid.okhttpmvp.model.OkhttpMvpModel;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * @author H
 * @date 2017/11/29 11:05
 * @description
 */
public class OkhttpMvpPresenter implements OkhttpMvpContract.Presenter {
    private OkhttpMvpContract.Model mModel;
    private OkhttpMvpContract.View mView;

    public OkhttpMvpPresenter(OkhttpMvpContract.View view) {
        mModel = new OkhttpMvpModel();
        mView = view;
    }

    @Override
    public void showDialog() {
        mView.showDialog();
    }

    @Override
    public void dismissDialog() {
        mView.dismissDialog();
    }

    @Override
    public void showText(String text) {
        mView.showText(text);
    }

    @Override
    public void clearText() {
        mView.clearText();
    }


    @Override
    public void setText(String text) {
        mModel.setText(text);
    }

    @Override
    public String getText() {
        return mModel.getText();
    }

    public void getMessageData() {
        showDialog();
        clearText();
        JSONObject params = new JSONObject();
        params.put("userId", "15555555555");

        OkHttpClient okHttpClient = new OkHttpClient();
        RequestBody body = new FormBody.Builder()
                .add("adJson", params.toString())
                .build();
        Request request = new Request.Builder()
                .url(Config.URL)
                .post(body)
                .build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                dismissDialog();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                AddressEntity addressEntity = JSON.parseObject(string, AddressEntity.class);
                setText(addressEntity.getAddressData().getMessage());
                String text = getText();
                showText(text);
                dismissDialog();
            }
        });
    }
}
