package cn.cold.designpattern.chain.handle;

import cn.cold.designpattern.chain.impl.SchoolMasterHandler;
import cn.cold.designpattern.chain.impl.SquadLeaderHandler;
import cn.cold.designpattern.chain.impl.TeacherHander;
import cn.cold.designpattern.chain.message.IStudent;

/**
 * Created by mengll on 2018/4/3 0003.
 */
public final class ProcessHandler {

    private final static ProcessHandler instance = new ProcessHandler();
    private final IHandler schoolMasterHandler;
    private final IHandler squadLeaderHandler;
    private final IHandler teacherHandler;

    private ProcessHandler() {
        this.schoolMasterHandler = new SchoolMasterHandler();
        this.squadLeaderHandler = new SquadLeaderHandler();
        this.teacherHandler = new TeacherHander();

        this.squadLeaderHandler.setHandler(teacherHandler);
        this.teacherHandler.setHandler(schoolMasterHandler);
    }

    public static ProcessHandler getInstance() {
        return instance;
    }

    public void sendMessage(IStudent student) {
        squadLeaderHandler.handleRequest(student);

    }
}
