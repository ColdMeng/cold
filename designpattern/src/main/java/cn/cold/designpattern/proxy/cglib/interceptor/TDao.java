package cn.cold.designpattern.proxy.cglib.interceptor;

/**
 * Created by mengll on 2018/4/3 0003.
 */
public class TDao {
    public void create() {
        System.out.println("create() is running !");
    }

    public void query() {
        System.out.println("query() is running !");
    }

    public void update() {
        System.out.println("update() is running !");
    }

    public void delete() {
        System.out.println("delete() is running !");
    }
}
