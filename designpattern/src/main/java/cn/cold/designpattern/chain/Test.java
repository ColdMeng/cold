package cn.cold.designpattern.chain;

import cn.cold.designpattern.chain.handle.ProcessHandler;
import cn.cold.designpattern.chain.message.IStudent;
import cn.cold.designpattern.chain.message.StudentImpl;

import java.util.Random;

/**
 * Created by mengll on 2018/4/3 0003.
 */
public class Test {
    public static void main(String[] args) {
        ProcessHandler handler = ProcessHandler.getInstance();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int radom = random.nextInt(3);
            IStudent student = new StudentImpl(radom, "学生" + i + "生病了");
            handler.sendMessage(student);

        }
    }
}
