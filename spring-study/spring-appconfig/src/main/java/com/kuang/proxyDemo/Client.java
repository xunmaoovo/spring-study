package com.kuang.proxyDemo;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();

        ProxyInvocationHandler handler = new ProxyInvocationHandler(realSubject);

        Subject proxy = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), handler);


        System.out.println(proxy.getClass().getName());
        proxy.Rent();

    }

}
