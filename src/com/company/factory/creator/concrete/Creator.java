package com.company.factory.creator.concrete;

import com.company.factory.creator.base.AbstractCreator;
import com.company.factory.product.base.AbstractProduct;

/**
 * description :
 * @author 刘俊新
 * @date 2020/6/16 15:14
 */
public class Creator extends AbstractCreator {
    @Override
    public <T extends AbstractProduct> T create(Class<T> tClass) {
        AbstractProduct product = null;
        try {
            product = (AbstractProduct)Class.forName(tClass.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
