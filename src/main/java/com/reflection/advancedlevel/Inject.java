package com.reflection.advancedlevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Custom annotation to mark fields for injection
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject {
}
