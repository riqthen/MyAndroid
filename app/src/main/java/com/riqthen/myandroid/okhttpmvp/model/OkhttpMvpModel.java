package com.riqthen.myandroid.okhttpmvp.model;

import com.riqthen.myandroid.okhttpmvp.contract.OkhttpMvpContract;

/**
 * @author H
 * @date 2017/11/29 11:05
 * @description
 */
public class OkhttpMvpModel implements OkhttpMvpContract.Model {
    private String text;

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
