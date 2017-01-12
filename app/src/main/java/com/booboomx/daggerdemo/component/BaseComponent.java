package com.booboomx.daggerdemo.component;

import com.booboomx.daggerdemo.module.BaseModule;
import com.booboomx.daggerdemo.utils.ClothHandler;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by booboomx on 17/1/12.
 */
@Singleton
@Component(modules = BaseModule.class)
public interface BaseComponent {
    ClothHandler getClothHandler();
}
