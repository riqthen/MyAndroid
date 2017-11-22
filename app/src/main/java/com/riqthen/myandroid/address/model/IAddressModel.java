package com.riqthen.myandroid.address.model;

import com.riqthen.myandroid.address.AddressEntity;

import java.util.List;

/**
 * Created by H on 2017/11/20 17:19
 */

public interface IAddressModel {
    List<AddressEntity.AddressDataBean.AddressesBean> getData();

    void setData(List<AddressEntity.AddressDataBean.AddressesBean> addressesBeans);
}
