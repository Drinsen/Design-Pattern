package com.company.singleton;

/**
 * description :双重校验锁法（通常线程安全，低概率不安全） 高并发下会出现某个线程获得未初始化的单例对象
 * @author 刘俊新
 * @date 2020/6/16 14:18
 */
public class Singleton06 {
    private static Singleton06 instance;

    private Singleton06(){

    }

    public static synchronized Singleton06 getInstance(){
        if(instance == null){
            synchronized (Singleton06.class){
                if (instance == null){
                    instance = new Singleton06();
                }
            }
        }
        return instance;
    }
}
