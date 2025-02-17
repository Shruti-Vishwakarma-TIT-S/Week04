package com.annotation.exercise;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Container annotation for repeated BugReports
@Retention(RetentionPolicy.RUNTIME)
public @interface BugReports {
    BugReport[] value();
}

