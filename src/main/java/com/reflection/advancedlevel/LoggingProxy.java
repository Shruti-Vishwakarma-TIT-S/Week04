package com.reflection.advancedlevel;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LoggingProxy {

    public static void main(String[] args) {
        // Create an instance of the original class
        Greeting greeting = new GreetingImpl();

        // Create a proxy instance that logs method calls
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class<?>[]{Greeting.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // Log the method name before executing
                        System.out.println("Method " + method.getName() + " is called");
                        return method.invoke(greeting, args);
                    }
                });

        // Call the method on the proxy instance
        proxyInstance.sayHello();
    }
}
