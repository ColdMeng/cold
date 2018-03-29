package cn.cold.designpattern.builder.others;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public class Person {

    private final String name;
    private final int sex;
    private final String numId;
    private final float height;
    private final float wegiht;

    public static class Builder {
        private final String name;
        private final int sex;
        private String numId = "000000000";
        private float height = 100f;
        private float wegiht = 54f;

        public Builder(String name, int sex) {
            this.name = name;
            this.sex = sex;
        }

        public Builder numId(String val) {
            this.numId = val;
            return this;
        }

        public Builder height(float val) {
            this.height = val;
            return this;
        }

        public Builder wegiht(float val) {
            this.wegiht = val;
            return this;
        }

        public Person builder() {
            return new Person(this);
        }
    }

    private Person(Builder builder) {
        this.name = builder.name;
        this.sex = builder.sex;
        this.numId = builder.numId;
        this.height = builder.height;
        this.wegiht = builder.wegiht;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", sex=" + sex + ", numId='" + numId + '\'' + ", height=" + height + ", wegiht=" + wegiht + '}';
    }
}
