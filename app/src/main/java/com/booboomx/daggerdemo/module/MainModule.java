package com.booboomx.daggerdemo.module;

import android.util.Log;

import com.booboomx.daggerdemo.bean.Cloth;
import com.booboomx.daggerdemo.bean.Clothes;
import com.booboomx.daggerdemo.bean.Shoe;
import com.booboomx.daggerdemo.scope.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by booboomx on 17/1/12.
 */

/**
 * @Module 表示该类是Module类，这样dagger2才能识别
 */
@Module
public class MainModule {

    public static final String TAG="MainModule";

    // Providers 表明Module类中有哪些方法用来提供依赖对象的
//    @Provides
//    public Cloth getCloth(){
//        Cloth cloth=new Cloth();
//        cloth.setColor("红色");
//        return cloth;
//    }

//    @Provides
//    @Named("red")
//    public Cloth getRedCloth(){
//        Cloth cloth=new Cloth();
//        cloth.setColor("红色");
//        return cloth;
//    }


//    @Singleton
//    @Provides
//    public Cloth getRedCloth(){
//        Cloth cloth=new Cloth();
//        cloth.setColor("红色");
//        return cloth;
//    }



//    @Provides
//    @Named("blue")
//    public Cloth getBlueCloth(){
//        Cloth cloth=new Cloth();
//        cloth.setColor("蓝色");
//        return cloth;
//    }


//    @Provides
//    public Clothes getClothes(){
//        Cloth cloth=new Cloth();
//        cloth.setColor("红色");
//        return new Clothes(cloth);
//    }


    @PerActivity
    @Provides
    public Cloth getReadCloth(){
        Log.i(TAG, "getReadCloth: ...");
        Cloth cloth=new Cloth();
        cloth.setColor("红色");
        return cloth;
    }


    @PerActivity
    @Provides
    public Shoe getShoe(){
        Log.i(TAG, "getShoe: ...");
        return new Shoe();
    }




//    @PerActivity
//    @Provides
//    public ClothHandler getClothHandler(){
//        return  new ClothHandler();
//    }

    @Provides
    public Clothes getClothes(Cloth cloth){
        return new Clothes(cloth);
    }

}
