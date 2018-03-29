package cn.cold.designpattern.bridge.model;

import cn.cold.designpattern.bridge.Graphical;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public class Rectangle extends Graphical {
    @Override
    public void draw() {
        color.bepaint("正方形");
    }
}
