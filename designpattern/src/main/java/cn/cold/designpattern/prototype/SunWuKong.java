package cn.cold.designpattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public class SunWuKong implements Cloneable {

    private int age;
    private String fly;
    private ArrayList<String> mao = new ArrayList<>();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFly() {
        return fly;
    }

    public void setFly(String fly) {
        this.fly = fly;
    }

    public void addMao(String mao) {
        this.mao.add(mao);
    }

    public List<String> getMao() {
        return this.mao;
    }

    public SunWuKong(int age, String fly) {
        this.age = age;
        this.fly = fly;
    }

    @Override
    public String toString() {
        return "SunWuKong{" + "age=" + age + ", fly='" + fly + '\'' + ", mao=" + mao + '}';
    }

    @Override
    protected SunWuKong clone() throws CloneNotSupportedException {
        SunWuKong sunWuKong = (SunWuKong) super.clone();
        sunWuKong.mao = (ArrayList<String>) mao.clone();
        return sunWuKong;
    }

    protected SunWuKong deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return (SunWuKong) ois.readObject();
    }
}
