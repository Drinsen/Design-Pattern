package com.company.singleton;

/**
 * description :饿汉模式
 * @author 刘俊新
 * @date 2020/6/16 14:10
 */
public class Singleton03 {
    private static Singleton03 instance = new Singleton03();
    private Singleton03(){

    }
    public static Singleton03 getInstance(){
        return instance;
    }
}
