package cn.cold.designpattern.bridge.model;

import cn.cold.designpattern.bridge.IColor;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public class Red implements IColor {
    @Override
    public void bepaint(String Graphical) {
        System.out.println("Red" + Graphical);
    }
}
