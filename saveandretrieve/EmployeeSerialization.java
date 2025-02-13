package com.javastreams.saveandretrieve;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerialization {
    private static final String FILE_NAME = "employees.ser"; // File name to store employee data

    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "HR", 50000));
        employees.add(new Employee(2, "Bob", "IT", 60000));
        employees.add(new Employee(3, "Charlie", "Finance", 70000));

        // Serialize the list of employees
        serializeEmployees(employees);

        // Deserialize and display the list of employees
        List<Employee> deserializedEmployees = deserializeEmployees();
        if (deserializedEmployees != null) {
            for (Employee employee : deserializedEmployees) {
                System.out.println(employee);
            }
        }
    }

    // Method to serialize the list of employees to a file
    private static void serializeEmployees(List<Employee> employees) {
        // Use try-with-resources to ensure streams are closed properly
        try (FileOutputStream fos = new FileOutputStream(FILE_NAME);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(employees);
            System.out.println("Employees have been serialized to " + FILE_NAME);

        } catch (IOException e) {
            // Handle any IOExceptions that may occur
            System.out.println("An error occurred during serialization: " + e.getMessage());
        }
    }

    // Method to deserialize the list of employees from the file
    private static List<Employee> deserializeEmployees() {
        // Use try-with-resources to ensure streams are closed properly
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            List<Employee> employees = (List<Employee>) ois.readObject();
            System.out.println("Employees have been deserialized from " + FILE_NAME);
            return employees;

        } catch (IOException e) {
            // Handle any IOExceptions that may occur
            System.out.println("An error occurred during deserialization: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            // Handle ClassNotFoundException that may occur
            System.out.println("Class not found: " + e.getMessage());
        }
        return null;
    }
}
