package cn.cold.designpattern.bridge;

/**
 * Created by mengll on 2018/4/2 0002.
 */
public class BridgeCircle extends AbstractCircle {
    private int x, y, radius;

    public BridgeCircle(DrawAPI drawAPI) {
        super(drawAPI);
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
