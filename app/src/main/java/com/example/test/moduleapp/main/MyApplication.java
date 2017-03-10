package com.example.test.moduleapp.main;

import com.example.test.common.base.BaseApplication;
import com.github.mzule.activityrouter.annotation.Modules;

/**
 * Created by duchao on 2017/3/10.
 */
@Modules({"app", "login"})
public class MyApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
