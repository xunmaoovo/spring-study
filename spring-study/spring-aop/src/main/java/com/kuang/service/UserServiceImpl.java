package com.kuang.service;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("用户增加");
    }

    @Override
    public void select() {
        System.out.println("用户查找");
    }
}
