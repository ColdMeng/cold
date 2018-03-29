package cn.cold.designpattern.builder.itf;

import cn.cold.designpattern.builder.base.AbstractBasePackage;
import cn.cold.designpattern.builder.model.MobilePackage;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public class MobileBuilderImpl1 extends AbstractBasePackage implements IMobileBuilder {
    public void builderMoney() {
        this.mobilePackage.setMoney(12.55f);
    }

    public void builderMusic() {
        this.mobilePackage.setMusic("童话镇");
    }

    public void builderShortInfo() {
        this.mobilePackage.setShortInfo(200);
    }

    public MobilePackage getMobilePackage() {
        return this.mobilePackage;
    }
}
