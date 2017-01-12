package com.booboomx.daggerdemo.component;

import com.booboomx.daggerdemo.MainActivity;
import com.booboomx.daggerdemo.module.MainModule;
import com.booboomx.daggerdemo.scope.PerActivity;

import dagger.Component;

/**
 * Created by booboomx on 17/1/12.
 */
@PerActivity
@Component(modules = MainModule.class,dependencies = BaseComponent.class)
public interface MainComponent {
    void  inject(MainActivity mainActivity);
}
