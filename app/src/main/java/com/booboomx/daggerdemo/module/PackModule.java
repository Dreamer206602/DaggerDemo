package com.booboomx.daggerdemo.module;

import com.booboomx.daggerdemo.bean.Food;
import com.booboomx.daggerdemo.bean.Money;

import dagger.Module;
import dagger.Provides;

/**
 * Created by booboomx on 17/1/12.
 */
@Module
public class PackModule {

    @Provides
    Money provideMoney(){
        return  new Money();
    }


    @Provides
    Food provideFood(){
        return new Food();
    }
}
