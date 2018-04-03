package cn.cold.designpattern.chain.handle;

import cn.cold.designpattern.chain.message.IStudent;

/**
 * Created by mengll on 2018/4/3 0003.
 */
public interface IHandler {
    void handleRequest(IStudent student);

    void setHandler(IHandler handler);
}
