package com.riqthen.myandroid.accountflow.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.riqthen.myandroid.R;
import com.riqthen.myandroid.accountflow.entity.AccountFlowEntity;

import java.util.List;

/**
 * @author H
 * @date 2017/11/29 15:08
 * @description
 */
public class AccountFlowAdapter extends BaseQuickAdapter<AccountFlowEntity.AccountDataBean.AccountsBean, BaseViewHolder> {
    public AccountFlowAdapter(@Nullable List<AccountFlowEntity.AccountDataBean.AccountsBean> accountsBeans) {
        super(R.layout.item_account_flow, accountsBeans);
    }

    @Override
    protected void convert(BaseViewHolder holder, AccountFlowEntity.AccountDataBean.AccountsBean accountsBean) {
        holder.setText(R.id.tv_item_time, accountsBean.getBeginTime());
    }
}
