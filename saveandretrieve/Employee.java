package com.javastreams.saveandretrieve;

import java.io.Serializable;

class Employee implements Serializable {
    private int id;
    private String name;
    private String department;
    private double salary;

    // Constructor to initialize the Employee object
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Override toString() method to display employee details
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
