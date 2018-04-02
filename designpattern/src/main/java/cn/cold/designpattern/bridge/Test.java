package cn.cold.designpattern.bridge;

/**
 * 桥接模式用于抽象化与实例化解耦,使二者可以独立变化
 * 1、如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，
 * 通过桥接模式可以使它们在抽象层建立一个关联关系。
 * 2、对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用。
 * 3、一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。
 * Created by mengll on 2018/4/2 0002.
 */
public class Test {
    public static void main(String[] args) {
        DrawAPI greenCircle = new GreenCircle();
        AbstractCircle circle = new BridgeCircle(greenCircle);
        circle.draw();
    }
}
