package com.example.test.common.base;

import android.app.Application;

/**
 * Created by duchao on 2017/3/10.
 */

public class BaseApplication extends Application {

    private static BaseApplication mApplication;
    public static BaseApplication getInstance() {
        return mApplication;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
    }
}
