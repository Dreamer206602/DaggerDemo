package com.booboomx.daggerdemo.bean;

import javax.inject.Inject;

/**
 * Created by booboomx on 17/1/12.
 */

public class Shoe {
    @Inject
    public Shoe(){

    }

    @Override
    public String toString() {
        return "鞋子";
    }
}
