package cn.cold.designpattern.factory;

import cn.cold.designpattern.factory.model.AbstractMeat;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public class Client {
    public static void main(String[] args) {
        IMeatFactory factory = new PigMeatFactoryImpl();
        AbstractMeat pigMeat = factory.createMeat();
    }
}
