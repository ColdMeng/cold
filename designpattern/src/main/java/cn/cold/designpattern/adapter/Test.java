package cn.cold.designpattern.adapter;

import cn.cold.designpattern.adapter.adapter.AdapterPower220;
import cn.cold.designpattern.adapter.power.power220.IPower220;
import cn.cold.designpattern.adapter.power.power220.PowerImpl220;
import cn.cold.designpattern.adapter.power.power360.IPower360;
import cn.cold.designpattern.adapter.power.power360.PowerImpl360;

/**
 * 只有对象适配器
 * Created by mengll on 2018/3/29 0029.
 */
public class Test {
    public static void main(String[] args) {
        IPower220 power220 = new PowerImpl220();
        IPower360 power360 = new PowerImpl360();

        power220.outPower220();
        power360.outPower360();

        IPower220 adapterPower220 = new AdapterPower220(new PowerImpl360());
        adapterPower220.outPower220();
    }
}
