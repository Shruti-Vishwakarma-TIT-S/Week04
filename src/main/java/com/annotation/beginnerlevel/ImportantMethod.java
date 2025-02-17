package com.annotation.beginnerlevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define a custom annotation named ImportantMethod
@Retention(RetentionPolicy.RUNTIME)
public @interface ImportantMethod {
    // Optional parameter level with a default value of "HIGH"
    String level() default "HIGH";
}
