package com.company.abstractfactory.creator.base;

import com.company.abstractfactory.product.base.AbstractProductA;
import com.company.abstractfactory.product.base.AbstractProductB;

/**
 * description :
 * @author 刘俊新
 * @date 2020/6/16 15:49
 */
public abstract class AbstractCreator {
    /**
     * description:
     * @author 刘俊新
     * @return T
     * @date 2020/6/16 16:00
     */
    public abstract AbstractProductA getProductA();

    /**
     * description:
     * @author 刘俊新
     * @return com.company.abstractfactory.product.base.AbstractProductB
     * @date 2020/6/16 16:09
     */
    public abstract AbstractProductB getProductB();
}
