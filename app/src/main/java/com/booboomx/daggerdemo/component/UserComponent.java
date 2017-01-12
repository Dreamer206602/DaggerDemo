package com.booboomx.daggerdemo.component;

import com.booboomx.daggerdemo.MainActivity;
import com.booboomx.daggerdemo.module.UserModule;

import javax.inject.Singleton;

import dagger.Subcomponent;

/**
 * Created by booboomx on 17/1/12.
 */

@Singleton
@Subcomponent(modules = UserModule.class)
public  interface UserComponent {



//    private static  UserComponent userComponent;
//    public static UserComponent getInstance(){
//        if(userComponent==null){
//            synchronized (UserComponent.class){
//                if(userComponent==null){
//                    userComponent=DaggerUserComponent.create();
//                }
//            }
//        }
//
//        return userComponent;
//    }

   public abstract  void inject(MainActivity mainActivity);
//   public abstract void  inject(SecondActivity secondActivity);
}
