package cn.cold.designpattern.decorator;

/**
 * Created by mengll on 2018/3/30 0030.
 */
public abstract class ShapeDecorator implements IShape {

    protected IShape shape;

    public ShapeDecorator(IShape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
