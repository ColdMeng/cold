package cn.cold.designpattern.builder.itf;

import cn.cold.designpattern.builder.model.MobilePackage;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public interface IMobileBuilder {

    void builderMoney();

    void builderMusic();

    void builderShortInfo();

    MobilePackage getMobilePackage();
}
