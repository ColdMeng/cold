package cn.cold.designpattern.factory;

import cn.cold.designpattern.factory.model.AbstractMeat;
import cn.cold.designpattern.factory.model.PigMeat;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public class PigMeatFactoryImpl implements IMeatFactory {
    public AbstractMeat createMeat() {
        return new PigMeat();
    }
}
