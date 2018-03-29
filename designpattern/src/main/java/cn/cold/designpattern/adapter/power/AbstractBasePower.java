package cn.cold.designpattern.adapter.power;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public abstract class AbstractBasePower {
    private float power;
    private String unit = "v";

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public AbstractBasePower(float power) {
        this.power = power;
    }
}
