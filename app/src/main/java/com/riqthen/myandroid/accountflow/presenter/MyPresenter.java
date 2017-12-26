package com.riqthen.myandroid.accountflow.presenter;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.riqthen.myandroid.accountflow.config.Url;
import com.riqthen.myandroid.accountflow.contract.MyContract;
import com.riqthen.myandroid.accountflow.entity.AccountFlowEntity;
import com.riqthen.myandroid.accountflow.entity.OrderLoadEntity;
import com.riqthen.myandroid.accountflow.model.MyModel;
import com.riqthen.myandroid.utils.Lcat;
import com.riqthen.myandroid.utils.TUtil;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

import cn.finalteam.okhttpfinal.HttpRequest;
import cn.finalteam.okhttpfinal.RequestParams;
import cn.finalteam.okhttpfinal.StringHttpRequestCallback;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * @author H
 * @date 2017/11/29 14:40
 * @description
 */
public class MyPresenter implements MyContract.Presenter {
    private MyContract.View mView;
    private MyContract.Model mModel;

    public MyPresenter(MyContract.View view) {
        mView = view;
        mModel = new MyModel();
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
    public void showAccountList(List<AccountFlowEntity.AccountDataBean.AccountsBean> accountsBeans) {
        mView.showAccountList(accountsBeans);
    }

    @Override
    public void setAccountList(List<AccountFlowEntity.AccountDataBean.AccountsBean> accountsBeans) {
        mModel.setAccountList(accountsBeans);
    }

    @Override
    public List<AccountFlowEntity.AccountDataBean.AccountsBean> getAccountList() {
        return mModel.getAccountList();
    }

    public void getAccountFlow(int page) {
        JSONObject params = new JSONObject();
        try {
            params.put("relateAccount", "15555555555");
            params.put("accountType", "USER");
            params.put("currentPage", page);
            params.put("pageSize", 10);
            params.put("consumptionType", "");
            params.put("serverNumber", "dc100002");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        RequestParams requestParams = new RequestParams();
        requestParams.addFormDataPart("adJson", params.toString());
        HttpRequest.post(Url.URL_ACCOUNT_FLOW, requestParams, 10000, new StringHttpRequestCallback() {
            @Override
            public void onStart() {
                super.onStart();
                showDialog();
            }

            @Override
            public void onResponse(String response, Headers headers) {
                AccountFlowEntity accountFlowEntity = JSON.parseObject(response, AccountFlowEntity.class);
                try {
                    setAccountList(accountFlowEntity.getAccountData().getAccounts());
                    showAccountList(getAccountList());
                } catch (Exception e) {
                    e.printStackTrace();
                    Lcat.e("e", e.getMessage());
                }
            }

            @Override
            public void onFailure(int errorCode, String msg) {
                TUtil.show(errorCode + msg);
            }

            @Override
            public void onFinish() {
                dismissDialog();
            }
        });

    }

    //-------------------

    @Override
    public void showDetailDialog(OrderLoadEntity orderLoadEntity) {
        mView.showDetailDialog(orderLoadEntity);
    }

    @Override
    public void setOrderDetail(OrderLoadEntity orderLoadEntity) {
        mModel.setOrderDetail(orderLoadEntity);
    }

    @Override
    public OrderLoadEntity getOrderDetail() {
        return mModel.getOrderDetail();
    }

    public void getOrderLoad(String orderId) {
        JSONObject params = new JSONObject();
        try {
            params.put("orderId", orderId);
            params.put("storeSrvNumber", "dc100000");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        RequestBody body = new FormBody.Builder()
                .add("adJson", params.toString())
                .build();
        Request request = new Request.Builder()
                .url(Url.URL_ORDER_LOAD)
                .post(body)
                .build();
        new OkHttpClient().newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                TUtil.show("网络错误" + e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                OrderLoadEntity orderLoadEntity = new Gson().fromJson(response.body().string(), OrderLoadEntity.class);
                showDetailDialog(orderLoadEntity);
                setOrderDetail(orderLoadEntity);
                showDetailDialog(getOrderDetail());
            }
        });
    }
}
