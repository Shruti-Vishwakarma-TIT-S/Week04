package com.annotation.intermediatelevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define a custom annotation named LogExecutionTime
@Retention(RetentionPolicy.RUNTIME)
public @interface LogExecutionTime {
}
