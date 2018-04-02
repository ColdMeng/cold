package cn.cold.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mengll on 2018/3/29 0029.
 */
public class Employee {

    private String name;
    private String department;
    private float salary;
    private List<Employee> employeeList;

    public Employee(String name, String department, float salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        this.employeeList.remove(employee);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", department='" + department + '\'' + ", salary=" + salary + ", employeeList=" + employeeList + '}';
    }
}
