package cn.cold.designpattern.abstractfactory.itf;

import cn.cold.designpattern.abstractfactory.model.AbstractBeverage;
import cn.cold.designpattern.abstractfactory.model.AbstractChiecken;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public interface IFoodFactory {

    AbstractChiecken getChiecken(int num);

    AbstractBeverage getBeverage(int num);
}
