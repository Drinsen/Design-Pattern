package com.company.singleton;

/**
 * description :线程安全的懒汉模式
 * @author 刘俊新
 * @date 2020/6/16 14:05
 */
public class Singleton02 {
    private static Singleton02 instance;

    private Singleton02(){

    }
    public static synchronized Singleton02 getInstance(){
        if (instance == null){
             instance = new Singleton02();
        }
        return instance;
    }
}
