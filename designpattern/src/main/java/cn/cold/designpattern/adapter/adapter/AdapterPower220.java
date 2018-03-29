package cn.cold.designpattern.adapter.adapter;

import cn.cold.designpattern.adapter.power.AbstractBasePower;
import cn.cold.designpattern.adapter.power.power220.IPower220;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public class AdapterPower220 implements IPower220 {

    private final AbstractBasePower abstractBasePower;

    public AdapterPower220(AbstractBasePower abstractBasePower) {
        this.abstractBasePower = abstractBasePower;
    }

    @Override
    public void outPower220() {
        System.out.println(this.abstractBasePower.getPower()/22f);
    }
}
