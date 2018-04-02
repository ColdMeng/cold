package cn.cold.designpattern.bridge;

/**
 * Created by mengll on 2018/4/2 0002.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("red circle " + x + y);
    }
}
