package com.company.factory.factorymethod.product.concrete;

import com.company.factory.factorymethod.product.base.AbstractProduct;

/**
 * description :
 * @author 刘俊新
 * @date 2020/6/16 15:04
 */
public class ConcreteProduct2 extends AbstractProduct {
    @Override
    public void getProduct() {
        System.out.println("生产了产品 2 ");
    }
}
