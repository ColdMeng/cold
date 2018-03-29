package cn.cold.designpattern.builder;

import cn.cold.designpattern.builder.director.MobileDirector;
import cn.cold.designpattern.builder.itf.IMobileBuilder;
import cn.cold.designpattern.builder.itf.MobileBuilderImpl1;
import cn.cold.designpattern.builder.others.Person;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public class Test {
    public static void main(String[] args) {
        MobileDirector mobileDirector = new MobileDirector();
        IMobileBuilder mobileBuilder = new MobileBuilderImpl1();
        System.out.println(mobileDirector.createMobilePackage(mobileBuilder));

        Person person = new Person.Builder("张学友",2).height(12).builder();
        System.out.println(person);
    }
}
