package cn.cold.designpattern.abstractfactory.custom;

import cn.cold.designpattern.abstractfactory.itf.IFoodFactory;
import cn.cold.designpattern.abstractfactory.model.AbstractBeverage;
import cn.cold.designpattern.abstractfactory.model.AbstractChiecken;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public class Custom {
    private IFoodFactory foodFactory;

    public Custom(IFoodFactory foodFactory) {
        this.foodFactory = foodFactory;
    }

    public float orderBeverage(int num){
        AbstractBeverage beverage = foodFactory.getBeverage(num);
        beverage.printFoodMessage();
        return beverage.totalPrice();
    }

    public float orderChicken(int num){
        AbstractChiecken chiecken = foodFactory.getChiecken(num);
        chiecken.printFoodMessage();
        return chiecken.totalPrice();
    }
}
