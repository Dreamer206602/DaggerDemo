package com.booboomx.daggerdemo.utils;

import com.booboomx.daggerdemo.bean.Cloth;
import com.booboomx.daggerdemo.bean.Clothes;

/**
 * Created by booboomx on 17/1/12.
 */

public class ClothHandler {

    public Clothes handle(Cloth cloth){
        return new Clothes(cloth);
    }
}
