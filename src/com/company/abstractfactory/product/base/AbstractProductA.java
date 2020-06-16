package com.company.abstractfactory.product.base;

/**
 * description :
 * @author 刘俊新
 * @date 2020/6/16 15:50
 */
public abstract class AbstractProductA {
    public void same(){
        System.out.println("我是一个产品A");
    }
    /**
     * description: 不同方法
     * @author 刘俊新
     * @date 2020/6/16 15:56
     */
    public abstract void different();
}
