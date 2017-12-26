package com.riqthen.myandroid.accountflow;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.riqthen.myandroid.R;
import com.riqthen.myandroid.accountflow.adapter.AccountFlowAdapter;
import com.riqthen.myandroid.accountflow.contract.MyContract;
import com.riqthen.myandroid.accountflow.entity.AccountFlowEntity;
import com.riqthen.myandroid.accountflow.entity.OrderLoadEntity;
import com.riqthen.myandroid.accountflow.presenter.MyPresenter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AccountFlowActivity extends AppCompatActivity implements MyContract.View {

    @BindView(R.id.rv_account_flow)
    RecyclerView mRvAccountFlow;
    @BindView(R.id.srl_account_flow)
    SmartRefreshLayout mSrlAccountFlow;

    private ProgressDialog mProgressDialog;
    private MyPresenter mPresenter;
    private List<AccountFlowEntity.AccountDataBean.AccountsBean> accountsBeans;
    private AccountFlowAdapter mAccountFlowAdapter;
    private int page = 1;
    private TextView mTvDialog;
    private Dialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hongbao);
        ButterKnife.bind(this);
        initView();
        initDialog();
    }

    private void initView() {
        accountsBeans = new ArrayList<>();
        mAccountFlowAdapter = new AccountFlowAdapter(accountsBeans);
        mRvAccountFlow.setLayoutManager(new LinearLayoutManager(this));
        mRvAccountFlow.setAdapter(mAccountFlowAdapter);
        mPresenter = new MyPresenter(this);
        mPresenter.getAccountFlow(1);
        mSrlAccountFlow.setRefreshHeader(new ClassicsHeader(this));
        mSrlAccountFlow.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                accountsBeans.clear();
                mPresenter.getAccountFlow(1);
                mAccountFlowAdapter.notifyDataSetChanged();
                refreshlayout.finishRefresh(500);
            }
        }).setOnLoadmoreListener(new OnLoadmoreListener() {
            @Override
            public void onLoadmore(RefreshLayout refreshlayout) {
                mPresenter.getAccountFlow(page++);
                mAccountFlowAdapter.notifyDataSetChanged();
                refreshlayout.finishLoadmore(500);
            }
        });
        mAccountFlowAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                mPresenter.getOrderLoad(accountsBeans.get(position).getOrderId());
            }
        });
    }

    private void initDialog() {
        mDialog = new Dialog(this);
        View view = LayoutInflater.from(this).inflate(R.layout.item_account_flow, null);
        mDialog.setContentView(view);
        mTvDialog = view.findViewById(R.id.tv_item_time);
    }

    @Override
    public void showDialog() {
        if (mProgressDialog != null) {
            if (mProgressDialog.isShowing()) {
                mProgressDialog.dismiss();
                mProgressDialog = null;
            }
        }
        mProgressDialog = ProgressDialog.show(this, "", "加载中");
    }

    @Override
    public void dismissDialog() {
        if (mProgressDialog != null) {
            if (mProgressDialog.isShowing()) {
                mProgressDialog.dismiss();
            }
        }
    }

    @Override
    public void showAccountList(List<AccountFlowEntity.AccountDataBean.AccountsBean> accountsBeans) {
        this.accountsBeans.addAll(accountsBeans);
        mAccountFlowAdapter.notifyDataSetChanged();
    }

    @Override
    public void showDetailDialog(final OrderLoadEntity orderLoadEntity) {
        mTvDialog.setText(orderLoadEntity.getOrderData().getMessage());
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mDialog.show();
            }
        });
    }

}
