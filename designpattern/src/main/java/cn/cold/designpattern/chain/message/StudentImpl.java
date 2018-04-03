package cn.cold.designpattern.chain.message;

/**
 * Created by mengll on 2018/4/3 0003.
 */
public class StudentImpl implements IStudent {

    private int state = -1;
    private final String message;

    public StudentImpl(int state, String message) {
        this.state = state;
        this.message = message;
    }

    @Override
    public int getState() {
        return this.state;
    }

    @Override
    public String getRequestMessage() {
        return this.message;
    }
}
