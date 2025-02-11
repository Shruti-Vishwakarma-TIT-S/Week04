package com.generics.resumescreeningsystem;

// abstract class Jobrole
public abstract class JobRole {

    // Instance Field
    private String name;

    // constructor
    public JobRole(String name) {
        this.name = name;
    }

    // Method to get Name
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "JobRole: " + name;
    }
}
