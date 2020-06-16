package com.company.factory;

import com.company.factory.creator.concrete.Creator;
import com.company.factory.creator.base.AbstractCreator;
import com.company.factory.product.base.AbstractProduct;
import com.company.factory.product.concrete.ConcreteProduct1;

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
