package com.riqthen.myandroid.okhttpmvp.contract;

/**
 * @author H
 * @date 2017/11/29 11:05
 * @description
 */
public interface OkhttpMvpContract {
    interface Model {
        void setText(String text);

        String getText();
    }

    interface View {
        void showDialog();

        void dismissDialog();

        void showText(String text);

        void clearText();
    }

    interface Presenter {
        void showDialog();

        void dismissDialog();

        void showText(String text);

        void clearText();

        void setText(String text);

        String getText();
    }
}
