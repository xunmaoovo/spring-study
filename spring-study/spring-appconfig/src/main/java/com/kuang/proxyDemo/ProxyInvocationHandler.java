package com.kuang.proxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyInvocationHandler implements InvocationHandler {

    private Object realSubject;

    public ProxyInvocationHandler(Object realSubject){
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();

        Object result = method.invoke(realSubject, args);

        after();

        return result;
    }

    public static void before(){
        System.out.println("调用前");
    }

    public static void after(){
        System.out.println("调用后");
    }

}
