package com.company.singleton;

/**
 * description : 懒汉模式
 * @author 刘俊新
 * @date 2020/6/16 14:04
 */
public class Singleton01 {
    private static Singleton01 instance;

    private Singleton01(){

    }
    public static Singleton01 getInstance(){
        if (instance == null){
            instance = new Singleton01();
        }
        return instance;
    }
}
