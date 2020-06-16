package com.company.singleton;

/**
 * description :volatile 解决了双重锁机制带来的问题
 * @author 刘俊新
 * @date 2020/6/16 14:21
 */
public class Singleton07 {
    private static volatile Singleton07 instance;

    private Singleton07(){

    }

    public static synchronized Singleton07 getInstance(){
        if(instance == null){
            synchronized (Singleton06.class){
                if (instance == null){
                    instance = new Singleton07();
                }
            }
        }
        return instance;
    }
}
