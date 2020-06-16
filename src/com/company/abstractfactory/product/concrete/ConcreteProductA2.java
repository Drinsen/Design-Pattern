package com.company.abstractfactory.product.concrete;

import com.company.abstractfactory.product.base.AbstractProductA;

/**
 * description :
 * @author 刘俊新
 * @date 2020/6/16 15:53
 */
public class ConcreteProductA2 extends AbstractProductA {
    @Override
    public void different() {
        System.out.println("我的名字是 A2");
    }
}
