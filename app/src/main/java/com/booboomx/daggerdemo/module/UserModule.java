package com.booboomx.daggerdemo.module;

import com.booboomx.daggerdemo.bean.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by booboomx on 17/1/12.
 */
@Module
public class UserModule {

    @Provides
    @Singleton
    User providerUser(){
        return new User();
    }
}
