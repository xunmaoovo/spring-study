package com.kuang.proxyDemo;

public class RealSubject implements Subject{

    @Override
    public void Rent() {
        System.out.println("我要出租");
    }
}
