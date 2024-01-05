package com.kuang.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class DiyAop {
    @Before("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("执行前====");
    }
    @After("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("执行后====");
    }
    @AfterReturning("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void afterReturning(){
        System.out.println("执行return后");
    }

    @Around("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {

        System.out.println("环绕前");
        Object proceed = jp.proceed();
        System.out.println("环绕后");

    }
}
