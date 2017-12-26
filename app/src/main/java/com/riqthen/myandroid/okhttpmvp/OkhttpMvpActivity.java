package com.riqthen.myandroid.okhttpmvp;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.riqthen.myandroid.R;
import com.riqthen.myandroid.okhttpmvp.contract.OkhttpMvpContract;
import com.riqthen.myandroid.okhttpmvp.presenter.OkhttpMvpPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OkhttpMvpActivity extends AppCompatActivity implements OkhttpMvpContract.View {

    @BindView(R.id.tv_okhttp_mvp)
    TextView mTvOkhttpMvp;

    private ProgressDialog mProgressDialog;
    OkhttpMvpPresenter mOkhttpMvpPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okhttp_mvp);
        ButterKnife.bind(this);
        mOkhttpMvpPresenter = new OkhttpMvpPresenter(this);
    }

    @Override
    public void showDialog() {
        mProgressDialog = ProgressDialog.show(this, "", "加载中...");
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
    public void showText(final String text) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mTvOkhttpMvp.setText(text);
            }
        });
    }

    @Override
    public void clearText() {
        mTvOkhttpMvp.setText("");
    }

    @OnClick({R.id.btn_okhttp_mvp, R.id.tv_okhttp_mvp})
    public void onViewClicked() {
        mOkhttpMvpPresenter.getMessageData();
    }
}
