package com.riqthen.myandroid.address.presenter;

import com.alibaba.fastjson.JSON;
import com.riqthen.myandroid.Config;
import com.riqthen.myandroid.address.AddressEntity;
import com.riqthen.myandroid.address.model.IAddressModel;
import com.riqthen.myandroid.address.model.IAddressModelImpl;
import com.riqthen.myandroid.address.view.IAddressView;
import com.riqthen.myandroid.utils.TUtil;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import cn.finalteam.okhttpfinal.HttpRequest;
import cn.finalteam.okhttpfinal.RequestParams;
import cn.finalteam.okhttpfinal.StringHttpRequestCallback;

/**
 * Created by H on 2017/11/20 17:21
 */

public class AddressPresenter {
    private IAddressModel iAddressModel;
    private IAddressView iAddressView;

    public AddressPresenter(IAddressView iAddressView) {
        this.iAddressView = iAddressView;
        iAddressModel = new IAddressModelImpl();
    }

    private void showDialog() {
        if (iAddressView != null) {
            iAddressView.showDialog();
        }
    }

    private void dismissDialog() {
        if (iAddressView != null) {
            iAddressView.dismissDialog();
        }
    }

    private void showAddressList(List<AddressEntity.AddressDataBean.AddressesBean> addressesBeans) {
        if (iAddressView != null) {
            iAddressView.showAddressList(addressesBeans);
        }
    }

    private void showEmpty() {
        if (iAddressView != null) {
            iAddressView.showEmpty();
        }
    }

    private void setData(List<AddressEntity.AddressDataBean.AddressesBean> addressesBeans) {
        iAddressModel.setData(addressesBeans);
    }

    private List<AddressEntity.AddressDataBean.AddressesBean> getData() {
        return iAddressModel.getData();
    }

    public void getDataFromNet() {
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
                showDialog();
            }

            @Override
            protected void onSuccess(String s) {
//                AddressEntity addressEntity = new Gson().fromJson(s, AddressEntity.class);
                AddressEntity addressEntity = JSON.parseObject(s, AddressEntity.class);
                List<AddressEntity.AddressDataBean.AddressesBean> addresses = addressEntity.getAddressData().getAddresses() != null
                        ? addressEntity.getAddressData().getAddresses() : new ArrayList<AddressEntity.AddressDataBean.AddressesBean>();
                setData(addresses);
                List<AddressEntity.AddressDataBean.AddressesBean> data = getData();
                showAddressList(data);
                if (data.size() <= 0) {
                    showEmpty();
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
}
