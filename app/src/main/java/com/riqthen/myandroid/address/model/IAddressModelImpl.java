package com.riqthen.myandroid.address.model;

import com.riqthen.myandroid.address.AddressEntity;

import java.util.List;

/**
 * Created by H on 2017/11/20 17:22
 */

public class IAddressModelImpl implements IAddressModel {
    private List<AddressEntity.AddressDataBean.AddressesBean> addressesBeans;

    @Override
    public List<AddressEntity.AddressDataBean.AddressesBean> getData() {
        return addressesBeans;
    }

    @Override
    public void setData(List<AddressEntity.AddressDataBean.AddressesBean> addressesBeans) {
        this.addressesBeans = addressesBeans;

    }

}
