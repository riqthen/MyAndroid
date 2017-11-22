package com.riqthen.myandroid.address;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseItemDraggableAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.riqthen.myandroid.R;

import java.util.List;

/**
 * Created by H on 2017/11/20 17:53
 */

public class AddressAdapter extends BaseItemDraggableAdapter<AddressEntity.AddressDataBean.AddressesBean, BaseViewHolder> {
    public AddressAdapter(@Nullable List<AddressEntity.AddressDataBean.AddressesBean> data) {
        super(R.layout.item_address, data);
    }

    @Override
    protected void convert(BaseViewHolder holder, AddressEntity.AddressDataBean.AddressesBean addressesBean) {
        int position = holder.getLayoutPosition();
        holder.setText(R.id.tv_item_address, position + "．" + addressesBean.getProvince() + addressesBean.getCity() + addressesBean.getTownAndStreet() + addressesBean.getAddressDetail());
    }
}
