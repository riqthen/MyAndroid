package com.riqthen.myandroid.address;

import android.app.ProgressDialog;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemSwipeListener;
import com.riqthen.myandroid.R;
import com.riqthen.myandroid.address.presenter.AddressPresenter;
import com.riqthen.myandroid.address.view.IAddressView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AddressActivity extends AppCompatActivity implements IAddressView {

    @BindView(R.id.rv)
    RecyclerView rv;

    private ProgressDialog dialog;
    private AddressPresenter addressPresenter;
    private AddressAdapter addressAdapter;
    private List<AddressEntity.AddressDataBean.AddressesBean> addressesBeans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        ButterKnife.bind(this);
        addressPresenter = new AddressPresenter(this);
        addressesBeans = new ArrayList<>();
        addressAdapter = new AddressAdapter(addressesBeans);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(addressAdapter);
        addressAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                addressesBeans.remove(position);
                adapter.notifyDataSetChanged();
            }
        });
        addressAdapter.setOnItemSwipeListener(new OnItemSwipeListener() {
            @Override
            public void onItemSwipeStart(RecyclerView.ViewHolder viewHolder, int pos) {
            }

            @Override
            public void clearView(RecyclerView.ViewHolder viewHolder, int pos) {
            }

            @Override
            public void onItemSwiped(RecyclerView.ViewHolder viewHolder, int pos) {
                addressesBeans.remove(pos);
                addressAdapter.notifyDataSetChanged();
            }

            @Override
            public void onItemSwipeMoving(Canvas canvas, RecyclerView.ViewHolder viewHolder, float dX, float dY, boolean isCurrentlyActive) {

            }
        });
    }

    @Override
    public void showDialog() {
        dialog = ProgressDialog.show(this, "", "加载中...");
    }

    @Override
    public void dismissDialog() {
        if (dialog != null) {
            if (dialog.isShowing()) {
                dialog.dismiss();
            }
        }
    }

    @Override
    public void showAddressList(List<AddressEntity.AddressDataBean.AddressesBean> addressesBeans) {
        this.addressesBeans.clear();
        this.addressesBeans.addAll(addressesBeans);
        addressAdapter.notifyDataSetChanged();
    }

    @Override
    public void showEmpty() {
        View view = LayoutInflater.from(this).inflate(R.layout.activity_weather, null);
        addressAdapter.setEmptyView(view);
    }

    @OnClick(R.id.btn)
    public void onViewClicked() {
        addressPresenter.getDataFromNet();
    }
}
