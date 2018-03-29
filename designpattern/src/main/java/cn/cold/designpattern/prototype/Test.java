package cn.cold.designpattern.prototype;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        SunWuKong sunWuKong = new SunWuKong(12,"222");
        sunWuKong.addMao("2");
        SunWuKong sunWuKong1 = sunWuKong.clone();
        sunWuKong.setFly("2333333333333");
        sunWuKong.addMao("3");

        System.out.println("悟空本人" + sunWuKong);
        System.out.println("悟空克隆" + sunWuKong1);
        System.out.println(sunWuKong == sunWuKong1);
    }
}
