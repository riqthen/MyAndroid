package com.riqthen.app3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.riqthen.mylibrary.utils.Lcat;
import com.riqthen.mylibrary.utils.TUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn)
    Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        TUtil.show(getIntent().getStringExtra("qqq"));
        Lcat.e("111", getIntent().getStringExtra("qqq"));

    }

    @OnClick(R.id.btn)
    public void onViewClicked() {
        Intent intent = new Intent();
        intent.putExtra("123", "111");
        setResult(0x3, intent);
        finish();
    }
}
