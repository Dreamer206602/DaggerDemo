package com.booboomx.daggerdemo.component;

import com.booboomx.daggerdemo.module.BaseModule;
import com.booboomx.daggerdemo.module.MainModule;
import com.booboomx.daggerdemo.utils.ClothHandler;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by booboomx on 17/1/12.
 */
@Singleton
@Component(modules = BaseModule.class)
public interface BaseComponent {
    // 这个是为第二个Activity准备的，也就是dependencies依赖声明的方式
    ClothHandler getClothHandler();

    // @SubComponent使用的声明方式，声明一个返回值为子组件的方法，子组件需要什么 Module,就在方法参数中添加什么
    SubMainComponent getSubMainComponent(MainModule module);
}

