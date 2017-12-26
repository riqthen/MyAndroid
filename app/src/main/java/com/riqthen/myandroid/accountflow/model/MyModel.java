package com.riqthen.myandroid.accountflow.model;

import com.riqthen.myandroid.accountflow.contract.MyContract;
import com.riqthen.myandroid.accountflow.entity.AccountFlowEntity;
import com.riqthen.myandroid.accountflow.entity.OrderLoadEntity;

import java.util.List;

/**
 * @author H
 * @date 2017/11/29 14:40
 * @description
 */
public class MyModel implements MyContract.Model {
    private List<AccountFlowEntity.AccountDataBean.AccountsBean> mAccountsBeans;

    @Override
    public void setAccountList(List<AccountFlowEntity.AccountDataBean.AccountsBean> accountsBeans) {
        mAccountsBeans = accountsBeans;
    }

    @Override
    public List<AccountFlowEntity.AccountDataBean.AccountsBean> getAccountList() {
        return mAccountsBeans;
    }

    //--------------------

    private OrderLoadEntity mOrderLoadEntity;

    @Override
    public void setOrderDetail(OrderLoadEntity orderLoadEntity) {
        mOrderLoadEntity = orderLoadEntity;
    }

    @Override
    public OrderLoadEntity getOrderDetail() {
        return mOrderLoadEntity;
    }
}
