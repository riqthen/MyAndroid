package com.riqthen.mylibrary.utils;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.LayoutRes;
import android.support.v4.widget.TextViewCompat;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.ref.WeakReference;

/**
 * author: Blankj
 * blog  : http://blankj.com
 * time  : 2016/09/29
 * update: H
 * uTime : 2017/11/14
 * desc  : 吐司相关工具类
 */
public class TUtil {
    @SuppressLint("StaticFieldLeak")
    private static Application sApplication;

    private static final int COLOR_DEFAULT = 0xFEFFFFFF;    //默认背景颜色
    private static final Handler HANDLER = new Handler(Looper.getMainLooper());

    private static Toast sToast;
    private static WeakReference<View> sViewWeakReference;
    private static int sLayoutId = -1;
    private static int gravity = Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM;    //默认位置
    private static int xOffset = 0;     //默认x偏移
    private static int yOffset;  //默认y偏移
    private static int bgColor = COLOR_DEFAULT;
    private static int msgColor = COLOR_DEFAULT;
    private static int duration = Toast.LENGTH_SHORT;   //默认时长

    private TUtil() {
        throw new UnsupportedOperationException("you can't instantiate TUtil...");
    }

    public static void init(final Application app) {
        sApplication = app;
        yOffset = (int) (64 * sApplication.getResources().getDisplayMetrics().density + 0.5);
    }

    public static void show(final String format, final Object... args) {
        show(format, duration, args);
    }

    private static void show(final String format, final int duration, final Object... args) {
        show(String.format(format, args), duration);
    }

    public static void show(final CharSequence text) {
        HANDLER.post(new Runnable() {
            @Override
            public void run() {
                cancel();
                if (sApplication == null) {
                    throw new RuntimeException("you must init TUtil in Application");
                }
                sToast = Toast.makeText(sApplication, text, duration);
                // solve the font of toast
                TextView tvMessage = (TextView) sToast.getView().findViewById(android.R.id.message);
                TextViewCompat.setTextAppearance(tvMessage, android.R.style.TextAppearance);
                tvMessage.setTextColor(msgColor);
                View toastView = sToast.getView();
                if (bgColor != COLOR_DEFAULT) {
                    Drawable background = toastView.getBackground();
                    background.setColorFilter(new PorterDuffColorFilter(bgColor, PorterDuff.Mode.SRC_IN));
                }
                sToast.setGravity(gravity, xOffset, yOffset);
                sToast.show();
            }
        });
    }

    public static void show(final CharSequence text, final int duration) {
        HANDLER.post(new Runnable() {
            @Override
            public void run() {
                cancel();
                if (sApplication == null) {
                    throw new RuntimeException("you must init TUtil in Application");
                }
                sToast = Toast.makeText(sApplication, text, duration);
                // solve the font of toast
                TextView tvMessage = (TextView) sToast.getView().findViewById(android.R.id.message);
                TextViewCompat.setTextAppearance(tvMessage, android.R.style.TextAppearance);
                tvMessage.setTextColor(msgColor);
                View toastView = sToast.getView();
                if (bgColor != COLOR_DEFAULT) {
                    Drawable background = toastView.getBackground();
                    background.setColorFilter(new PorterDuffColorFilter(bgColor, PorterDuff.Mode.SRC_IN));
                }
                sToast.setGravity(gravity, xOffset, yOffset);
                sToast.show();
            }
        });
    }

    public static void show(@LayoutRes final int layoutId) {
        final View view = getView(layoutId);
        HANDLER.post(new Runnable() {
            @Override
            public void run() {
                cancel();
                if (sApplication == null) {
                    throw new RuntimeException("you must init TUtil in Application");
                }
                sToast = new Toast(sApplication);
                sToast.setView(view);
                sToast.setDuration(duration);
                View toastView = sToast.getView();
                if (bgColor != COLOR_DEFAULT) {
                    Drawable background = toastView.getBackground();
                    background.setColorFilter(new PorterDuffColorFilter(bgColor, PorterDuff.Mode.SRC_IN));
                }
                sToast.setGravity(gravity, xOffset, yOffset);
                sToast.show();
            }
        });
    }

    public static void show(@LayoutRes final int layoutId, final int duration) {
        final View view = getView(layoutId);
        HANDLER.post(new Runnable() {
            @Override
            public void run() {
                cancel();
                if (sApplication == null) {
                    throw new RuntimeException("you must init TUtil in Application");
                }
                sToast = new Toast(sApplication);
                sToast.setView(view);
                sToast.setDuration(duration);
                View toastView = sToast.getView();
                if (bgColor != COLOR_DEFAULT) {
                    Drawable background = toastView.getBackground();
                    background.setColorFilter(new PorterDuffColorFilter(bgColor, PorterDuff.Mode.SRC_IN));
                }
                sToast.setGravity(gravity, xOffset, yOffset);
                sToast.show();
            }
        });
    }

    public static void show(final CharSequence text, Config config) {
        HANDLER.post(new Runnable() {
            @Override
            public void run() {
                cancel();
                if (sApplication == null) {
                    throw new RuntimeException("you must init TUtil in Application");
                }
                sToast = Toast.makeText(sApplication, text, duration);
                // solve the font of toast
                TextView tvMessage = (TextView) sToast.getView().findViewById(android.R.id.message);
                TextViewCompat.setTextAppearance(tvMessage, android.R.style.TextAppearance);
                tvMessage.setTextColor(msgColor);
                View toastView = sToast.getView();
                if (bgColor != COLOR_DEFAULT) {
                    Drawable background = toastView.getBackground();
                    background.setColorFilter(new PorterDuffColorFilter(bgColor, PorterDuff.Mode.SRC_IN));
                }
                sToast.setGravity(gravity, xOffset, yOffset);
                sToast.show();
            }
        });
    }

    public static void cancel() {
        if (sToast != null) {
            sToast.cancel();
            sToast = null;
        }
    }

    private static View getView(@LayoutRes final int layoutId) {
        if (sLayoutId == layoutId) {
            if (sViewWeakReference != null) {
                final View toastView = sViewWeakReference.get();
                if (toastView != null) {
                    return toastView;
                }
            }
        }
        if (sApplication == null) {
            throw new RuntimeException("you must init TUtil in Application");
        }
        LayoutInflater inflate = (LayoutInflater) sApplication.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View toastView = inflate.inflate(layoutId, null);
        sViewWeakReference = new WeakReference<>(toastView);
        sLayoutId = layoutId;
        return toastView;
    }

    //configuration
    public static class Config {
        public static final int COLOR_DEFAULT = 0xFEFFFFFF;
        public static int gravity = Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM;
        public static int duration = Toast.LENGTH_SHORT;

        public Config(int gravity, int xOffset, int yOffset, int bgColor, int msgColor, int duration) {
            TUtil.gravity = gravity;
            TUtil.xOffset = xOffset;
            TUtil.yOffset = yOffset;
            TUtil.bgColor = bgColor;
            TUtil.msgColor = msgColor;
            TUtil.duration = duration;
        }

        public Config(int bgColor, int msgColor) {
            TUtil.bgColor = bgColor;
            TUtil.msgColor = msgColor;
        }

        public Config(int gravity, int xOffset, int yOffset) {
            TUtil.gravity = gravity;
            TUtil.xOffset = xOffset;
            TUtil.yOffset = yOffset;
        }

    }
}