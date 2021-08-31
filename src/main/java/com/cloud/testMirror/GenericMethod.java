package com.cloud.testMirror;


/**
 *
 */
public class GenericMethod {
    String name;
    public String getName(){
        return this.name;
    }

    public static void main(String[] args) {
        com.cloud.test.GenericMethod method = new com.cloud.test.GenericMethod();
        System.out.println(method.testGeneric());
    }
}
