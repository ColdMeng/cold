package cn.cold.designpattern.builder.base;

import cn.cold.designpattern.builder.model.MobilePackage;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public abstract class AbstractBasePackage {
    protected MobilePackage mobilePackage;

    public AbstractBasePackage() {
        this.mobilePackage = new MobilePackage();
    }
}
