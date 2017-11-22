package com.riqthen.myandroid.weather.model;

/**
 * Created by H on 2017/11/20 15:43
 */

public class IWeatherImpl implements IWeatherModel {
    private String info;

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public void setInfo(String info) {
        this.info = info;
    }
}
