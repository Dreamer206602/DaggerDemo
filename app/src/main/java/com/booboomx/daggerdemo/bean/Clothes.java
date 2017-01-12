package com.booboomx.daggerdemo.bean;

/**
 * Created by booboomx on 17/1/12.
 */

public class Clothes {

    private Cloth cloth;

    public Clothes(Cloth cloth) {
        this.cloth = cloth;
    }

    public Cloth getCloth(){
        return cloth;
    }

    @Override
    public String toString() {
        return cloth.getColor()+"衣服";
    }
}
