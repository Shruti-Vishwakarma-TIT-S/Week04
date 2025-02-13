package com.collections.mapinterface;

import java.util.*;

public class GroupByDepartment {

    // Class to represent an Employee
    static class Employee {
        String name;
        String department;

        // Constructor to initialize employee details
        Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        // Override toString method to print employee details
        @Override
        public String toString() {
            return name;
        }
    }

    // Method to group employees by department
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {

        // Create a map to store the grouped result
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        // Iterate through the list of employees
        for (Employee employee : employees) {

            // Add the employee to the corresponding department list
            departmentMap
                    .computeIfAbsent(employee.department, k -> new ArrayList<>())
                    .add(employee);
        }

        // Return the grouped map
        return departmentMap;
    }

    public static void main(String[] args) {

        // Create a list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Muskan", "HR"),
                new Employee("Bholu", "IT"),
                new Employee("Lalit", "HR")
        );

        // Group employees by department and print the result
        Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);

        // Print the grouped employees
        for (Map.Entry<String, List<Employee>> entry : groupedEmployees.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
