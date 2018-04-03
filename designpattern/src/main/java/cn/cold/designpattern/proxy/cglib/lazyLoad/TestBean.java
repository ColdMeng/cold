package cn.cold.designpattern.proxy.cglib.lazyLoad;

/**
 * Created by mengll on 2018/4/3 0003.
 */
public class TestBean {
    public TestBean() {
        System.out.println("TestBean construct end...");
    }

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
