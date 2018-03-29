package cn.cold.designpattern.adapter.power.power360;

import cn.cold.designpattern.adapter.power.AbstractBasePower;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public class PowerImpl360 extends AbstractBasePower implements IPower360 {

    public PowerImpl360() {
        super(360);
    }

    @Override
    public void outPower360() {
        System.out.println("输出360电流---滋滋滋~~~~~~");
    }
}
