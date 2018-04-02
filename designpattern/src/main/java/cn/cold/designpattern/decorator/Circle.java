package cn.cold.designpattern.decorator;

/**
 * Created by mengll on 2018/3/30 0030.
 */
public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("shape : circle 圆");
    }
}
