package cn.cold.designpattern.proxy.cglib.lazyLoad;

import net.sf.cglib.proxy.Dispatcher;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.LazyLoader;
import net.sf.cglib.proxy.ProxyRefDispatcher;

/**
 * Created by mengll on 2018/4/3 0003.
 */
public class CglibLazyTest {
    public void testLazyBean() {
        TB tb = new TB();
        System.out.println("***************************************");
        System.out.println("cid's value: " + tb.getCid());
        System.out.println("***************************************");
        System.out.println("bean's username value: " + tb.getBean());
//        LazyLoader 这里将返回同一个对象
        System.out.println("bean's username value: " + tb.getBean());


        System.out.println("***************************************");
        System.out.println("bean2's username value: " + tb.getBean2());
//        这里将返回一个新的对象
        System.out.println("bean2's username value: " + tb.getBean2());
    }

    public static void main(String[] args) {
        CglibLazyTest cglibLazyTest = new CglibLazyTest();
        cglibLazyTest.testLazyBean();
    }

    /**
     * @author longe
     *         通过实现LazyLoader接口延迟加载
     */
    class Lazy implements LazyLoader {
        @Override
        public Object loadObject() throws Exception {
            TestBean tb = new TestBean();
            System.out.println("lazy load ========= 2222");
            tb.setUserName("longe lazy");
            return tb;
        }

    }

    /**
     * @author longe
     *         通过实现Dispatcher接口延迟加载
     */
    class DispacherTest implements Dispatcher {
        @Override
        public Object loadObject() throws Exception {
            TestBean2 tb2 = new TestBean2();
            System.out.println("dispatcher load =========== ");
            tb2.setNo("longe dispatcher lazy");
            return tb2;
        }

    }

    /**
     * @author longe
     *         与Dispatcher一样，只不过可以把代理对象作为参数进行传递
     */
    class ProxyRefDispacherTest implements ProxyRefDispatcher {
        @Override
        public Object loadObject(Object proxy) throws Exception {
            return null;
        }
    }

    class TB {
        private String cid;
        private TestBean bean;
        private TestBean2 bean2;
        LazyLoader lazy = new Lazy();
        Dispatcher dis = new DispacherTest();

        public TB() {
            cid = "no lazy";
            // Enhancer en = new Enhancer();
            // en.setSuperclass(TestBean.class);
            // en.setCallback(lazy);
            // bean = (TestBean) en.create(new Class[]{CglibLazyTest.class},new
            // Object[]{new CglibLazyTest()});
            bean = (TestBean) Enhancer.create(TestBean.class, lazy);
            bean2 = (TestBean2) Enhancer.create(TestBean2.class, dis);
            System.out.println("TB construct end...");
        }

        public TestBean getBean() {
            return bean;
        }

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public void setBean(TestBean bean) {
            this.bean = bean;
        }

        public TestBean2 getBean2() {
            return bean2;
        }

        public void setBean2(TestBean2 bean2) {
            this.bean2 = bean2;
        }
    }
}
