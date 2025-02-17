package com.reflection.advancedlevel;

import java.lang.reflect.Field;

public class ObjectToJsonConverter {

    // Method to convert an object to a JSON-like string
    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder("{");

        try {
            Class<?> clazz = obj.getClass();
            Field[] fields = clazz.getDeclaredFields();

            // Iterate through the fields and append to JSON string
            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                field.setAccessible(true); // Make the field accessible

                // Append field name and value to the JSON string
                json.append("\"").append(field.getName()).append("\":");
                json.append("\"").append(field.get(obj)).append("\"");

                if (i < fields.length - 1) {
                    json.append(",");
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) {
        // Create a sample object
        PersonCustom person = new PersonCustom("Shreya", 25);

        // Convert the object to JSON string
        String json = toJson(person);

        // Print the JSON string
        System.out.println(json);
    }
}
