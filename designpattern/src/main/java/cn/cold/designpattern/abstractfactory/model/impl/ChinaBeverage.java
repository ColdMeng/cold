package cn.cold.designpattern.abstractfactory.model.impl;

import cn.cold.designpattern.abstractfactory.model.AbstractBaseFood;
import cn.cold.designpattern.abstractfactory.model.AbstractBeverage;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public class ChinaBeverage extends AbstractBeverage {
    public ChinaBeverage(int num) {
        this.kind = "红牛";
        this.num = num;
        this.price = 5.00f;
    }
}
