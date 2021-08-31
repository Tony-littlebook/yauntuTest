package com.cloud.test;

import com.cloud.bean.Hello;
import com.cloud.bean.HelloInterface;
import com.cloud.bean.MyInvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        HelloInterface helloInterface = new Hello();
        InvocationHandler handler = new MyInvocationHandler(helloInterface);
        HelloInterface proxyHello = (HelloInterface) Proxy.newProxyInstance(helloInterface.getClass().getClassLoader(),
                helloInterface.getClass().getInterfaces(), handler);
        proxyHello.greeting();
    }
}
