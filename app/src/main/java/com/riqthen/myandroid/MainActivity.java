package com.riqthen.myandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.riqthen.myandroid.accountflow.AccountFlowActivity;
import com.riqthen.myandroid.address.AddressActivity;
import com.riqthen.myandroid.giraffeplayer.GiraffePlayerActivity;
import com.riqthen.myandroid.jiecaoplayer.JiecaoPlayerActivity;
import com.riqthen.myandroid.okhttpmvp.OkhttpMvpActivity;
import com.riqthen.myandroid.player.PlayerActivity;
import com.riqthen.myandroid.regular.RegularActivity;
import com.riqthen.myandroid.retrofit.RetrofitActivity;
import com.riqthen.myandroid.texttobitmap.TextToBitmapActivity;
import com.riqthen.myandroid.weather.WeatherActivity;
import com.riqthen.myandroid.weixinpay.WeixinPayActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_to_weather, R.id.btn_to_address, R.id.btn_to_retrofit, R.id.btn_to_logging_interceptor,
            R.id.btn_to_weixin_pay, R.id.btn_to_okhttp_mvp, R.id.btn_to_account_flow, R.id.btn_to_text_to_bitmap
            , R.id.btn_to_player, R.id.btn_to_jiecao_player,R.id.btn_to_giraffe_player,R.id.btn_to_regular})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_to_weather:
                startActivity(new Intent(this, WeatherActivity.class));
                break;
            case R.id.btn_to_address:
                startActivity(new Intent(this, AddressActivity.class));
                break;
            case R.id.btn_to_retrofit:
                startActivity(new Intent(this, RetrofitActivity.class));
                break;
            case R.id.btn_to_logging_interceptor:
                startActivity(new Intent(this, RetrofitActivity.class));
                break;
            case R.id.btn_to_weixin_pay:
                startActivity(new Intent(this, WeixinPayActivity.class));
                break;
            case R.id.btn_to_okhttp_mvp:
                startActivity(new Intent(this, OkhttpMvpActivity.class));
                break;
            case R.id.btn_to_account_flow:
                startActivity(new Intent(this, AccountFlowActivity.class));
                break;
            case R.id.btn_to_text_to_bitmap:
                startActivity(new Intent(this, TextToBitmapActivity.class));
                break;
            case R.id.btn_to_player:
                startActivity(new Intent(this, PlayerActivity.class));
                break;
            case R.id.btn_to_jiecao_player:
                startActivity(new Intent(this, JiecaoPlayerActivity.class));
                break;
            case R.id.btn_to_giraffe_player:
                startActivity(new Intent(this, GiraffePlayerActivity.class));
                 break;
            case R.id.btn_to_regular:
                startActivity(new Intent(this, RegularActivity.class));
                 break;
            default:
                break;
        }
    }

}
