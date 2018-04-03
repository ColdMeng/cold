package cn.cold.designpattern.proxy.cglib.lazyLoad;

/**
 * Created by mengll on 2018/4/3 0003.
 */
public class TestBean2 {
    public TestBean2() {
        System.out.println("TestBean2 construct end...");
    }

    private String no;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
