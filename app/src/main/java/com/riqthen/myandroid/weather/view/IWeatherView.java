package com.riqthen.myandroid.weather.view;

/**
 * Created by H on 2017/11/20 15:36
 */

public interface IWeatherView {
    void onInfoUpdate(String info);

    void showWaitingDialog();

    void dismissWaitingDialog();
}
