package cn.cold.designpattern.abstractfactory;

import cn.cold.designpattern.abstractfactory.custom.Custom;
import cn.cold.designpattern.abstractfactory.itf.FoodFactoryImpl;
import cn.cold.designpattern.abstractfactory.itf.IFoodFactory;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public class Client {

    public static void main(String[] args) {
        IFoodFactory foodFactory = new FoodFactoryImpl();
        Custom custom = new Custom(foodFactory);
        custom.orderBeverage(1);
        custom.orderChicken(2);
    }
}
