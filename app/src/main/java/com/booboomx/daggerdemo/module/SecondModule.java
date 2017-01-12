package com.booboomx.daggerdemo.module;

import com.booboomx.daggerdemo.bean.Cloth;
import com.booboomx.daggerdemo.scope.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by booboomx on 17/1/12.
 */

@Module
public class SecondModule {

    @PerActivity
    @Provides
    public Cloth getBlueCloth(){
        Cloth cloth=new Cloth();
        cloth.setColor("蓝色");
        return cloth;
    }

//    @PerActivity
//    @Provides
//    public ClothHandler getClothHandler(){
//        return new ClothHandler();
//    }

}
