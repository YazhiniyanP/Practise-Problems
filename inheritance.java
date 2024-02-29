package com.zukun.java;


class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void displayManagerDetails() {
        displayDetails();
        System.out.println("Department: " + department);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 50000, "IT");
        manager.displayManagerDetails();
    }
}