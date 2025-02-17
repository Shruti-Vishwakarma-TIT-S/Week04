package com.reflection.basiclevel;

import java.lang.reflect.Field;

public class Person {
    private int age = 25; // Private field

    public static void main(String[] args) {
        try {
            // Create an instance of Person
            Person person = new Person();

            // Get the Class object
            Class<?> cls = person.getClass();

            // Access the private field 'age'
            Field field = cls.getDeclaredField("age");
            field.setAccessible(true); // Make the field accessible

            // Get the value of the field
            int ageValue = (int) field.get(person);
            System.out.println("Age before modification: " + ageValue);

            // Modify the value of the field
            field.set(person, 30);
            ageValue = (int) field.get(person);
            System.out.println("Age after modification: " + ageValue);

        }
        catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
