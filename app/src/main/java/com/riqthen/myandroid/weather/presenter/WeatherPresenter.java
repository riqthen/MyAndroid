package com.riqthen.myandroid.weather.presenter;

import com.riqthen.myandroid.Config;
import com.riqthen.myandroid.utils.Lcat;
import com.riqthen.myandroid.weather.model.IWeatherImpl;
import com.riqthen.myandroid.weather.model.IWeatherModel;
import com.riqthen.myandroid.weather.view.IWeatherView;

import org.json.JSONException;
import org.json.JSONObject;

import cn.finalteam.okhttpfinal.HttpRequest;
import cn.finalteam.okhttpfinal.RequestParams;
import cn.finalteam.okhttpfinal.StringHttpRequestCallback;
import okhttp3.Headers;

/**
 * Created by H on 2017/11/20 15:44
 */

public class WeatherPresenter {
    private IWeatherModel mModel;
    private IWeatherView mView;

    public WeatherPresenter(IWeatherView mView) {
        this.mView = mView;
        mModel = new IWeatherImpl();
    }

    private void showWaitingDialog() {
        if (mView != null) {
            mView.showWaitingDialog();
        }
    }

    private void updateWeatherInfo(String info) {
        if (mView != null) {
            mView.onInfoUpdate(info);
        }
    }

    private void dismissWaitingDialog() {
        if (mView != null) {
            mView.dismissWaitingDialog();
        }
    }

    private void saveInfo(String info) {
        mModel.setInfo(info);
    }

    private String getInfo() {
        return mModel.getInfo();
    }

    /**
     * onStart->onProgress->onResponse->onSuccess/onFailure->onFinish
     * public void onStart() {} //请求开始执行
     * public void onResponse(String response, Headers headers) {}  //请求响应
     * protected void onSuccess(Headers headers, T t) {}    //请求成功-带响应Header信息
     * protected void onSuccess(T t) {} //请求成功
     * public void onProgress(int progress, long networkSpeed, boolean done){}  //写入流进度
     * public void onFailure(int errorCode, String msg) {}  //请求失败
     * public void onFinish() {}    //请求完成
     * public Headers getHeaders() {}   //获取响应Header
     * <p>
     * BaseHttpRequestCallback<T>
     * StringHttpRequestCallback
     * JsonArrayHttpRequestCallback
     * JsonHttpRequestCallback
     */
    public void requestWeatherInfo() {
        RequestParams params = new RequestParams();
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("userId", "15555555555");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        params.addFormDataPart("adJson", jsonObject.toString());
        HttpRequest.post(Config.URL, params, 30000, new StringHttpRequestCallback() {
            @Override
            public void onStart() {
                Lcat.e("开始请求", "onStart");
                showWaitingDialog();
            }

            @Override
            public void onResponse(String response, Headers headers) {
                super.onResponse(response, headers);
                Lcat.e("已响应", response);
            }

            @Override
            protected void onSuccess(String s) {
                Lcat.e("请求成功", s);
                String msg = null;
                try {
                    JSONObject object = new JSONObject(s);
                    msg = object.getJSONObject("addressData").getString("message");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                saveInfo(msg);
                String info = getInfo();
                updateWeatherInfo(info);
            }

            @Override
            public void onProgress(int progress, long networkSpeed, boolean done) {
                Lcat.e("请求中", progress + " " + networkSpeed + " " + done);
            }

            @Override
            public void onFailure(int errorCode, String msg) {
                Lcat.e("请求错误", errorCode + " " + msg);
            }

            @Override
            public void onFinish() {
                Lcat.e("请求结束", "onFinish");
                dismissWaitingDialog();
            }
        });
    }

}
