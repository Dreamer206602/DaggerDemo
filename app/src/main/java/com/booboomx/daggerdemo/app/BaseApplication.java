package com.booboomx.daggerdemo.app;

import android.app.Application;

import com.booboomx.daggerdemo.component.BaseComponent;
import com.booboomx.daggerdemo.component.DaggerBaseComponent;
import com.booboomx.daggerdemo.module.BaseModule;

/**
 * Created by booboomx on 17/1/12.
 */

public class BaseApplication extends Application {

    public static BaseApplication mInstance;
    private BaseComponent baseComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance=this;
        baseComponent= DaggerBaseComponent.builder().baseModule(new BaseModule()).build();

    }

    public static  BaseApplication getInstance(){
        return mInstance;
    }
    public BaseComponent getBaseComponent(){
        return baseComponent;
    }
}
