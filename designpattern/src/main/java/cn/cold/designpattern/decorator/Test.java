package cn.cold.designpattern.decorator;

/**
 * 动态添加新功能,获取实例然后调用实例方法添加相对应的功能
 * Created by mengll on 2018/3/30 0030.
 */
public class Test {
    public static void main(String[] args) {
        IShape circle = new Circle();

        IShape redCircle = new RedShapeDecorator(new Circle());

        IShape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
