package cn.cold.designpattern.abstractfactory.model;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public abstract class AbstractBaseFood {
    protected String kind;
    protected int num;
    protected float price;

    public float totalPrice() {
        return num * price;
    }
}
