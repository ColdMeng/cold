package cn.cold.designpattern.abstractfactory.model.impl;

import cn.cold.designpattern.abstractfactory.model.AbstractChiecken;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public class ChinaChiecken extends AbstractChiecken {
    public ChinaChiecken(int num) {
        this.kind = "微辣";
        this.num = num;
        this.price = 14.0f;
    }
}
