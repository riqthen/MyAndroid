package com.riqthen.app2;

import android.os.Bundle;
import android.support.annotation.CheckResult;
import android.support.annotation.IntRange;
import android.support.annotation.Size;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.riqthen.mylibrary.utils.TUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv)
    TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn)
    public void onViewClicked() {
        TUtil.show(setRange1(new int[]{12220, 1}) + "");

    }

    public boolean setRange(@IntRange(from = 10, to = 100) int range) {
        return range > 50;
    }

    @CheckResult(suggest = "#enforcePermission(String,int,int,boolean)")
    public boolean setRange1(@Size(max = 2) int[] range) {
        return range.length > 2;
    }

}
