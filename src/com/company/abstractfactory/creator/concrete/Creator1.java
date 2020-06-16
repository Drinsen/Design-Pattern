package com.company.abstractfactory.creator.concrete;

import com.company.abstractfactory.creator.base.AbstractCreator;
import com.company.abstractfactory.product.base.AbstractProductA;
import com.company.abstractfactory.product.base.AbstractProductB;
import com.company.abstractfactory.product.concrete.ConcreteProductA1;
import com.company.abstractfactory.product.concrete.ConcreteProductA2;
import com.company.abstractfactory.product.concrete.ConcreteProductB1;

/**
 * description :
 * @author 刘俊新
 * @date 2020/6/16 16:13
 */
public class Creator1 extends AbstractCreator {
    @Override
    public AbstractProductA getProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB getProductB() {
        return new ConcreteProductB1();
    }
}
