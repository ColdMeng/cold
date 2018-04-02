package cn.cold.designpattern.decorator;

/**
 * Created by mengll on 2018/3/30 0030.
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(IShape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        this.shape.draw();
        setRedBorder(shape);
    }

    private void setRedBorder(IShape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
