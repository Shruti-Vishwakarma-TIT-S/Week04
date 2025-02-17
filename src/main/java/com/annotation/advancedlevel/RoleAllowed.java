package com.annotation.advancedlevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define a custom annotation named RoleAllowed
@Retention(RetentionPolicy.RUNTIME)
public @interface RoleAllowed {
    // Field to specify the allowed role
    String value();
}
