package cn.cold.designpattern.chain.impl;

import cn.cold.designpattern.chain.handle.AbstractHandler;
import cn.cold.designpattern.chain.message.IStudent;

/**
 * Created by mengll on 2018/4/3 0003.
 */
public class SchoolMasterHandler extends AbstractHandler {
    public SchoolMasterHandler() {
        super(2);
    }

    @Override
    public void proccess(IStudent student) {
        System.out.println("校长 批复:  " + student.getRequestMessage());
    }
}
