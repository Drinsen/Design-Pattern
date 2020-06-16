package com.company.abstractfactory.product.concrete;

import com.company.abstractfactory.product.base.AbstractProductB;

/**
 * description :
 * @author 刘俊新
 * @date 2020/6/16 16:05
 */
public class ConcreteProductB2 extends AbstractProductB {
    @Override
    public void different() {
        System.out.println("我的名字是 B2");
    }
}
