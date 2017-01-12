package com.booboomx.daggerdemo.component;

import com.booboomx.daggerdemo.module.PackModule;
import com.booboomx.daggerdemo.module.UserModule;

import dagger.Component;

/**
 * Created by booboomx on 17/1/12.
 */
@Component(modules = PackModule.class)
public interface PackComponent {

    // 提供 UserComponent 对象的获取方法
    UserComponent userComponent(UserModule module);

}
