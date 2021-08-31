package com.cloud.test;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {
    public <T> List<T> testGeneric(){
        List<T> list = new ArrayList<T>();
        return list;
    }

    public static void main(String[] args) {
        GenericMethod obj = new GenericMethod();
        System.out.println(obj.testGeneric());
    }
}
