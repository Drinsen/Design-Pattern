package com.company.factory.factorymethod;

import com.company.factory.factorymethod.creator.base.AbstractCreator;
import com.company.factory.factorymethod.creator.concrete.Creator;
import com.company.factory.factorymethod.product.base.AbstractProduct;
import com.company.factory.factorymethod.product.concrete.ConcreteProduct1;

/**
 * description :
 * @author 刘俊新
 * @date 2020/6/16 15:19
 */
public class Test {
    public static void main(String[] args) {
        AbstractCreator creator = new Creator();
        AbstractProduct product = creator.create(ConcreteProduct1.class);
        product.getProduct();
    }
}
