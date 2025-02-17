package com.reflection.advancedlevel;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class CustomObjectMapper {

    // Method to map properties to an object
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            // Create a new instance of the class
            T instance = clazz.getDeclaredConstructor().newInstance();

            // Iterate through the map and set field values
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                // Get the field from the class
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true); // Make the field accessible

                // Set the field value on the instance
                field.set(instance, fieldValue);
            }

            return instance;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        // Create a map of properties
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Mukesh");
        properties.put("age", 30);

        // Map the properties to the Person object
        Person person = toObject(Person.class, properties);

        // Print the field values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

    }
}
