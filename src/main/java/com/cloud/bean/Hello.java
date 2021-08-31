package com.cloud.bean;

public class Hello implements HelloInterface{
    @Override
    public void greeting() {
        System.out.println("Hello word!");
    }
}
