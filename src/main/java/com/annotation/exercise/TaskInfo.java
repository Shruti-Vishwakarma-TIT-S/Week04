package com.annotation.exercise;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define a custom annotation named TaskInfo
@Retention(RetentionPolicy.RUNTIME)
public @interface TaskInfo {
    // Annotation fields for priority and assignedTo
    String priority();
    String assignedTo();
}
