package com.kuang.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("返回值为"+returnValue+",执行了"+method.getName());
    }
}
