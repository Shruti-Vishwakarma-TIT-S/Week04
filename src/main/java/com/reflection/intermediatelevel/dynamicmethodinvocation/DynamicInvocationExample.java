package com.reflection.intermediatelevel.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicInvocationExample {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter method name (add, subtract, multiply):");
            String methodName = scanner.nextLine();
            System.out.println("Enter two integers:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            Class<?> mathOpsClass = Class.forName("MathOperations");
            Object mathOpsInstance = mathOpsClass.getDeclaredConstructor().newInstance();

            Method method = mathOpsClass.getMethod(methodName, int.class, int.class);
            Object result = method.invoke(mathOpsInstance, a, b);

            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
