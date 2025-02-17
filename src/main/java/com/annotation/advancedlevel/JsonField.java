package com.annotation.advancedlevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define a custom annotation named JsonField
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonField {
    // Field to specify the custom JSON key
    String name();
}
