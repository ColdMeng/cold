package cn.cold.designpattern.builder.model;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public class MobilePackage {
    private float money;
    private int shortInfo;
    private String music;

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public int getShortInfo() {
        return shortInfo;
    }

    public void setShortInfo(int shortInfo) {
        this.shortInfo = shortInfo;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    @Override
    public String toString() {
        return "MobilePackage{" + "money=" + money + ", shortInfo=" + shortInfo + ", music='" + music + '\'' + '}';
    }
}
