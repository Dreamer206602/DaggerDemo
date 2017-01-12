package com.booboomx.daggerdemo.app;

import android.app.Application;

import com.booboomx.daggerdemo.component.BaseComponent;
import com.booboomx.daggerdemo.component.UserComponent;

/**
 * Created by booboomx on 17/1/12.
 */

public class BaseApplication extends Application {

    public static BaseApplication mInstance;
    private BaseComponent baseComponent;
    private UserComponent userComponent;



    @Override
    public void onCreate() {
        super.onCreate();
        mInstance=this;
//        baseComponent= DaggerBaseComponent.builder().baseModule(new BaseModule()).build();
//        userComponent= DaggerUserComponent.create();

    }

    public static  BaseApplication getInstance(){
        return mInstance;
    }

//    public UserComponent getUserComponent(){
//        return userComponent;
//    }
//    public BaseComponent getBaseComponent(){
//        return baseComponent;
//    }
}
