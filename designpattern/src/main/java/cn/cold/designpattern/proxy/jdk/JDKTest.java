package cn.cold.designpattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by mengll on 2018/4/2 0002.
 */
public class JDKTest {
    public static void main(String[] args) {
        ISubject sub = new SubjectImpl();
        InvocationHandler invocationHandler = new InvokeHandlerImpl(sub);
        ISubject proxy = (ISubject) Proxy.newProxyInstance(sub.getClass().getClassLoader(),sub.getClass().getInterfaces(),invocationHandler);
        proxy.fuck();
        System.out.println(sub);
        System.out.println(proxy);
    }
}