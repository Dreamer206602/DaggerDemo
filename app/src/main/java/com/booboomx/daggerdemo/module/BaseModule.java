package com.booboomx.daggerdemo.module;

import com.booboomx.daggerdemo.utils.ClothHandler;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by booboomx on 17/1/12.
 */
@Module
public class BaseModule {
    @Singleton
    @Provides
    public ClothHandler getClothHandler(){
        return new ClothHandler();
    }
}
