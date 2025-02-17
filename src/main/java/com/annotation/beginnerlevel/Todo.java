package com.annotation.beginnerlevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define a custom annotation named Todo
@Retention(RetentionPolicy.RUNTIME)
public @interface Todo {
    // Fields for task description, assignedTo, and priority with a default value of "MEDIUM"
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}
