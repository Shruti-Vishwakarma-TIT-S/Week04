package com.annotation.advancedlevel;

import java.lang.reflect.Field;

// Class to represent a User
public class UserJson {

    // Apply the JsonField annotation to the fields
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    public UserJson(String username, int age) {
        this.username = username;
        this.age = age;
    }

    // Method to convert object to JSON string by reading the annotations
    public String toJson() throws Exception {
        StringBuilder json = new StringBuilder("{");
        for (Field field : this.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField jsonField = field.getAnnotation(JsonField.class);
                field.setAccessible(true);
                json.append("\"").append(jsonField.name()).append("\": \"").append(field.get(this)).append("\", ");
            }
        }
        if (json.length() > 1) {
            json.setLength(json.length() - 2); // Remove the trailing comma and space
        }
        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws Exception {
        // Create an instance of User
        UserJson user = new UserJson("Disha", 30);

        // Convert the user object to JSON string and print it
        System.out.println(user.toJson());
    }
}
