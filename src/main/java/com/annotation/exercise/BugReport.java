package com.annotation.exercise;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define a repeatable annotation named BugReport
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
public @interface BugReport {
    // Annotation field for the bug description
    String description();
}
