package com.riqthen.myandroid.weather;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.riqthen.myandroid.utils.Lcat;
import com.riqthen.myandroid.R;
import com.riqthen.myandroid.weather.presenter.WeatherPresenter;
import com.riqthen.myandroid.weather.view.IWeatherView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WeatherActivity extends AppCompatActivity implements IWeatherView {

    @BindView(R.id.tv_weather)
    TextView tvWeather;

    private WeatherPresenter mPresenter;
    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ButterKnife.bind(this);
        mPresenter = new WeatherPresenter(this);
    }

    @OnClick(R.id.btn_current_weather)
    public void onViewClicked() {
        mPresenter.requestWeatherInfo();
    }

    @Override
    public void onInfoUpdate(final String info) {
        Lcat.print("``````````````", info);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                tvWeather.setText(info);
            }
        });
    }

    @Override
    public void showWaitingDialog() {
        if (dialog != null) {
            if (dialog.isShowing())
                dialog.dismiss();
        }
        dialog = ProgressDialog.show(this, "title", "msg");
    }

    @Override
    public void dismissWaitingDialog() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (dialog != null) {
                    if (dialog.isShowing()) {
                        dialog.dismiss();
                    }
                }
            }
        });
    }
}
