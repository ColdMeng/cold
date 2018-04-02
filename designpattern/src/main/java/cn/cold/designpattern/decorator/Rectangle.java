package cn.cold.designpattern.decorator;

/**
 * Created by mengll on 2018/3/30 0030.
 */
public class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("shape: rectangle 矩形");
    }
}
