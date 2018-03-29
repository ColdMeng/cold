package cn.cold.designpattern.abstractfactory.itf;

import cn.cold.designpattern.abstractfactory.model.AbstractBeverage;
import cn.cold.designpattern.abstractfactory.model.AbstractChiecken;
import cn.cold.designpattern.abstractfactory.model.impl.ChinaBeverage;
import cn.cold.designpattern.abstractfactory.model.impl.ChinaChiecken;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public class FoodFactoryImpl implements IFoodFactory {
    public AbstractChiecken getChiecken(int num) {
        return new ChinaChiecken(num);
    }

    public AbstractBeverage getBeverage(int num) {
        return new ChinaBeverage(num);
    }
}
