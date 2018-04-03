package cn.cold.designpattern.chain.handle;

import cn.cold.designpattern.chain.message.IStudent;

/**
 * Created by mengll on 2018/4/3 0003.
 */
public abstract class AbstractHandler implements IHandler {

    protected int state = -1;
    protected IHandler handler;

    public AbstractHandler(int state) {
        this.state = state;
    }

    public abstract void proccess(IStudent student);

    @Override
    public void handleRequest(IStudent student) {
        if (student != null) {
            if (this.state == student.getState()) this.proccess(student);
            else {
                System.out.println("上级来处理");
                if (this.handler != null) {
                    this.handler.handleRequest(student);
                }
            }
        }
    }

    @Override
    public void setHandler(IHandler handler) {
        this.handler = handler;
    }
}
