package com.reflection.basiclevel;

import java.lang.reflect.Constructor;

public class Student {
    public Student() {
        System.out.println("Student instance created!"); // Default constructor
    }

    public static void main(String[] args) {
        try {
            // Get the Class object
            Class<?> cls = Class.forName("Student");

            // Get the default constructor
            Constructor<?> constructor = cls.getConstructor();

            // Create an instance of the Student class dynamically
            Object studentInstance = constructor.newInstance();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
