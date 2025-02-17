package com.annotation.intermediatelevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define a custom annotation named MaxLength
@Retention(RetentionPolicy.RUNTIME)
public @interface MaxLength {
    // Field to specify the maximum length
    int value();
}
