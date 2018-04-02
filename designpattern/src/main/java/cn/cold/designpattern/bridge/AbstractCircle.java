package cn.cold.designpattern.bridge;

/**
 * Created by mengll on 2018/4/2 0002.
 */
public abstract class AbstractCircle {
    protected DrawAPI drawAPI;

    public AbstractCircle(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
