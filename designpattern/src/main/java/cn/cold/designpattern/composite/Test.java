package cn.cold.designpattern.composite;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public class Test {
    public static void main(String[] args) {
        Employee CEO = new Employee("CEO","顶级部门",50000);
        Employee bumenjingli = new Employee("部门经理","A",10000);
        Employee zhangsan = new Employee("张三","A",5000);
        Employee lisi = new Employee("李四","A",5000);
        Employee wangwu = new Employee("王五","A",1000);

        CEO.addEmployee(bumenjingli);
        bumenjingli.addEmployee(zhangsan);
        bumenjingli.addEmployee(lisi);
        bumenjingli.addEmployee(wangwu);

        System.out.println(CEO);
    }
}
