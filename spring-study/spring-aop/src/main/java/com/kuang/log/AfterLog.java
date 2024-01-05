package com.kuang.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class AfterLog implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"执行了"+method.getName());
    }
}
