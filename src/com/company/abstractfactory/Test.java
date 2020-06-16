package com.company.abstractfactory;

import com.company.abstractfactory.creator.base.AbstractCreator;
import com.company.abstractfactory.creator.concrete.Creator1;
import com.company.abstractfactory.creator.concrete.Creator2;

/**
 * description :
 * @author 刘俊新
 * @date 2020/6/16 15:45
 */
public class Test {
    public static void main(String[] args) {
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();

        creator1.getProductA().different();
        creator1.getProductB().different();
        creator2.getProductA().different();
        creator2.getProductB().different();

    }
}
