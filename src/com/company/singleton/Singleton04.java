package com.company.singleton;

/**
 * description :静态类内部加载（线程安全）
 * @author 刘俊新
 * @date 2020/6/16 14:12
 */
public class Singleton04 {
    private static class SingletonLoader{
        private static Singleton04  instance = new Singleton04();
    }

    private Singleton04(){

    }

    public Singleton04 getInstance(){
        return SingletonLoader.instance;
    }
}
