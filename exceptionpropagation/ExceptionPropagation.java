package com.exceptions.exceptionpropagation;

public class ExceptionPropagation {
    // method1 throws an ArithmeticException (10 / 0)
    public static void method1() {
        int result = 10 / 0; // This will throw an ArithmeticException
    }

    // method2 calls method1
    public static void method2() {
        method1(); // Call method1, which will throw the exception
    }

    public static void main(String[] args) {
        try {
            // Call method2, which in turn calls method1
            method2();
        } catch (ArithmeticException e) {
            // Handle the ArithmeticException here
            System.out.println("Handled exception in main");
        }
    }
}
