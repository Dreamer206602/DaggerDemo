package com.booboomx.daggerdemo.bean;

/**
 * Created by booboomx on 17/1/12.
 */

public class Cloth {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;


    @Override
    public String toString() {
        return color+"布料";
    }
}
