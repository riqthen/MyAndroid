package com.riqthen.myandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.riqthen.myandroid.address.AddressActivity;
import com.riqthen.myandroid.retrofit.RetrofitActivity;
import com.riqthen.myandroid.weather.WeatherActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_weather, R.id.btn_address, R.id.btn_retrofit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_weather:
                startActivity(new Intent(this, WeatherActivity.class));
                break;
            case R.id.btn_address:
                startActivity(new Intent(this, AddressActivity.class));
                break;
            case R.id.btn_retrofit:
                startActivity(new Intent(this, RetrofitActivity.class));
                break;
        }
    }
}
