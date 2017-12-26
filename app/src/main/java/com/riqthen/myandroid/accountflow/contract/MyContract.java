package com.riqthen.myandroid.accountflow.contract;

import com.riqthen.myandroid.accountflow.entity.AccountFlowEntity;
import com.riqthen.myandroid.accountflow.entity.OrderLoadEntity;

import java.util.List;

/**
 * @author H
 * @date 2017/11/29 14:40
 * @description
 */
public interface MyContract {
    interface Model {
        void setAccountList(List<AccountFlowEntity.AccountDataBean.AccountsBean> accountsBeans);

        List<AccountFlowEntity.AccountDataBean.AccountsBean> getAccountList();

        //---------------------

        void setOrderDetail(OrderLoadEntity orderLoadEntity);

        OrderLoadEntity getOrderDetail();
    }

    interface View {
        void showDialog();

        void dismissDialog();

        void showAccountList(List<AccountFlowEntity.AccountDataBean.AccountsBean> accountsBeans);

        //---------------------

        void showDetailDialog(OrderLoadEntity orderLoadEntity);
    }

    interface Presenter {
        void showDialog();

        void dismissDialog();

        void showAccountList(List<AccountFlowEntity.AccountDataBean.AccountsBean> accountsBeans);

        void setAccountList(List<AccountFlowEntity.AccountDataBean.AccountsBean> accountsBeans);

        List<AccountFlowEntity.AccountDataBean.AccountsBean> getAccountList();

        //---------------------

        void setOrderDetail(OrderLoadEntity orderLoadEntity);

        OrderLoadEntity getOrderDetail();

        void showDetailDialog(OrderLoadEntity orderLoadEntity);
    }
}
