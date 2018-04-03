package cn.cold.designpattern.proxy.cglib.interceptor;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import net.sf.cglib.proxy.NoOp;

import java.lang.reflect.Method;

/**
 * Created by mengll on 2018/4/3 0003.
 */
public class TDaoCglibProxy implements MethodInterceptor {
    private String name;
    private Object objT;

    public TDaoCglibProxy(String name) {
        this.name = name;
    }
    public TDaoCglibProxy(Object obj,String name) {
        this.name = name;
        this.objT = obj;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        if(!name.equals("张三")){
            System.out.println("没有权限!");
            return null;
        }
//        return method.invoke(objT, args);    //通过反射进行调用
        return proxy.invokeSuper(obj, args);    //使用Cglib代理调用
    }


    public static void main(String[] args) {
        Enhancer en = new Enhancer();
        en.setSuperclass(TDao.class);
        TDaoCglibProxy callBack = new TDaoCglibProxy("张三1");
//        指定两个callback，通过callBackFilter返回的下标值控制调用使用那一个callback处理
        en.setCallbacks(new Callback[] { NoOp.INSTANCE, callBack });
//        方法过滤器，根据过滤器返回不同的值回调对应下标的Callback方法
        en.setCallbackFilter(new TDaoCglibFilter());
        TDao dao = (TDao) en.create();
        dao.create();
        dao.query();
        dao.update();
        dao.delete();
    }
}
