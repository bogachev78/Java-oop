package com.javalesson.constructors;

import com.javalesson.domainmodel.Employee;

public class ConstructorsMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Andrey", "developer", 100);
        Employee employee1 = new Employee("John", "developer", 70);
        System.out.println(employee);
        System.out.println(employee1);
    }
}
