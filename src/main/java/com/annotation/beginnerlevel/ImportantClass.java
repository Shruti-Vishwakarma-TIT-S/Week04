package com.annotation.beginnerlevel;

import java.lang.reflect.Method;

public class ImportantClass {

    // Apply the ImportantMethod annotation to method1
    @ImportantMethod(level = "HIGH")
    public void method1() {
        System.out.println("Executing method1");
    }

    // Apply the ImportantMethod annotation to method2
    @ImportantMethod(level = "MEDIUM")
    public void method2() {
        System.out.println("Executing method2");
    }

    // A regular method without any annotation
    public void method3() {
        System.out.println("Executing method3");
    }

    public static void main(String[] args) throws Exception {
        // Create an instance of ImportantClass
        ImportantClass importantClass = new ImportantClass();

        // Retrieve and print all methods annotated with ImportantMethod
        for (Method method : ImportantClass.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + ", Level: " + annotation.level());
            }
        }
    }
}
