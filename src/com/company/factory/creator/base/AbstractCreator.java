package com.company.factory.creator.base;

import com.company.factory.product.base.AbstractProduct;

/**
 * description :
 * @author 刘俊新
 * @date 2020/6/16 15:06
 */
public abstract class AbstractCreator {
    /**
     * description:
     * @author 刘俊新
     * @param tClass 参数
     * @return T
     * @date 2020/6/16 15:12
     */
    public abstract <T extends AbstractProduct> T create(Class<T> tClass);
}
