package com.riqthen.myandroid.address.view;

import com.riqthen.myandroid.address.AddressEntity;

import java.util.List;

/**
 * Created by H on 2017/11/20 17:17
 */

public interface IAddressView {
    void showDialog();

    void dismissDialog();

    void showAddressList(List<AddressEntity.AddressDataBean.AddressesBean> addressesBeans);

    void showEmpty();
}
