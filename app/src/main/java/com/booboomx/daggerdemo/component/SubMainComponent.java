package com.booboomx.daggerdemo.component;

import com.booboomx.daggerdemo.module.MainModule;
import com.booboomx.daggerdemo.scope.PerActivity;

import dagger.Subcomponent;

/**
 * Created by booboomx on 17/1/12.
 */
@PerActivity
@Subcomponent(modules = MainModule.class)
public interface SubMainComponent {
//    void inject(MainActivity mainActivity);

}
