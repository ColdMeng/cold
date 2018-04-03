package cn.cold.designpattern.proxy.cglib.interceptor;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * Created by mengll on 2018/4/3 0003.
 */
public class TDaoCglibFilter implements CallbackFilter {
    public final static int NO_RESTRICTION = 0;
    public final static int RESTRICTION_CREATE = 1;


    /* (non-Javadoc)
     *    根据调用的方法返回使用的callbacks下标
     */
    @Override
    public int accept(Method method) {
        if(method.getName().startsWith("create")){
            System.out.println("1111111111");
            return RESTRICTION_CREATE;
        }
        return NO_RESTRICTION;
    }
}
