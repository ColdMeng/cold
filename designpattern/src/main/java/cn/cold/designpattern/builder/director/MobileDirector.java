package cn.cold.designpattern.builder.director;

import cn.cold.designpattern.builder.itf.IMobileBuilder;
import cn.cold.designpattern.builder.model.MobilePackage;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public class MobileDirector {

    public MobilePackage createMobilePackage(IMobileBuilder mobileBuilder) {
        mobileBuilder.builderMoney();
        mobileBuilder.builderMusic();
        mobileBuilder.builderShortInfo();
        return mobileBuilder.getMobilePackage();
    }
}
