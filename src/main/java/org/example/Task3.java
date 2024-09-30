package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setSalary(10.0);

        Employee employee2 = new Employee();
        employee2.setSalary(1000000.0);

        Employee employee3 = new Employee();
        employee3.setSalary(566.0);

        Employee employee4 = new Employee();
        employee4.setSalary(777.0);

        Employee employee5 = new Employee();
        employee5.setSalary(999999.0);

        List<Employee> employees = List.of(employee1, employee2, employee3, employee4, employee5);

        boolean answer = employees.stream()
                .filter(t -> t.getSalary() > 100000.0)
                .count() > 1;

        System.out.println(answer);

    }
}

class Employee {
    private String fullName;
    private Integer age;
    private String department;
    private Double salary;

    public String getFullName() {
        return fullName;
    }

    public Integer getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
