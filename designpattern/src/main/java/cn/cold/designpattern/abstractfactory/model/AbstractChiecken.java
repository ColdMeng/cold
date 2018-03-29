package cn.cold.designpattern.abstractfactory.model;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public class AbstractChiecken extends AbstractBaseFood implements IFood {
    public void printFoodMessage() {
        System.out.println(this.kind + "--鸡肉单价:" + this.price + " 数量:" + this.num + "总额:" + this.totalPrice());
    }
}
