package cn.cold.designpattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by mengll on 2018/4/2 0002.
 */
public class InvokeHandlerImpl implements InvocationHandler {

    ISubject subject;

    public InvokeHandlerImpl(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start");
        System.out.println("method " + method);
        Object ret = method.invoke(subject,args);
        System.out.println("end");
        return ret;
    }
}
