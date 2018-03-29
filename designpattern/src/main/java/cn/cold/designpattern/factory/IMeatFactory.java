package cn.cold.designpattern.factory;

import cn.cold.designpattern.factory.model.AbstractMeat;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public interface IMeatFactory {
    AbstractMeat createMeat();
}
