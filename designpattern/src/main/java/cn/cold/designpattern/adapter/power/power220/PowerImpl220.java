package cn.cold.designpattern.adapter.power.power220;

import cn.cold.designpattern.adapter.power.AbstractBasePower;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public class PowerImpl220 extends AbstractBasePower implements IPower220 {

    public PowerImpl220() {
        super(220);
    }

    @Override
    public void outPower220() {
        System.out.println("输出220电流---滋滋滋~~~~~~");
    }
}
