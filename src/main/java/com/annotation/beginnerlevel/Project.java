package com.annotation.beginnerlevel;

import java.lang.reflect.Method;

public class Project {

    // Apply the Todo annotation to feature1 method
    @Todo(task = "Implement login functionality", assignedTo = "John")
    public void feature1() {
        System.out.println("Pending feature1");
    }

    // Apply the Todo annotation to feature2 method
    @Todo(task = "Add payment gateway integration", assignedTo = "Jane", priority = "HIGH")
    public void feature2() {
        System.out.println("Pending feature2");
    }

    // A regular method without any annotation
    public void feature3() {
        System.out.println("Completed feature3");
    }

    public static void main(String[] args) throws Exception {
        // Create an instance of Project
        Project project = new Project();

        // Retrieve and print all methods annotated with Todo
        for (Method method : Project.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo annotation = method.getAnnotation(Todo.class);
                System.out.println("Method: " + method.getName() + ", Task: " + annotation.task() +
                        ", Assigned To: " + annotation.assignedTo() + ", Priority: " + annotation.priority());
            }
        }
    }
}
