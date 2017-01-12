package com.booboomx.daggerdemo.component;

import com.booboomx.daggerdemo.module.SecondModule;
import com.booboomx.daggerdemo.scope.PerActivity;

import dagger.Component;

/**
 * Created by booboomx on 17/1/12.
 */
@PerActivity
@Component(modules = SecondModule.class,dependencies = BaseComponent.class)
public interface SecondComponent {
//    void inject(SecondActivity secondActivity);
}
