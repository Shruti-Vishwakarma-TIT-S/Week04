package com.annotation.advancedlevel;
import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;

// Class to demonstrate caching of method results
public class ExpensiveComputation {

    // Cache to store previously computed results
    private static final Map<String, Object> cache = new HashMap<>();

    @CacheResult
    public int compute(int num) {
        // Simulate a computationally expensive operation
        System.out.println("Performing expensive computation...");
        return num * num;
    }

    // Method to check and use cache for the method results
    public Object checkCacheAndInvoke(Method method, Object... args) throws Exception {
        String key = method.getName() + args[0];
        if (cache.containsKey(key)) {
            return cache.get(key);
        } else {
            Object result = method.invoke(this, args);
            cache.put(key, result);
            return result;
        }
    }

    public static void main(String[] args) throws Exception {
        // Create an instance of ExpensiveComputation
        ExpensiveComputation computation = new ExpensiveComputation();

        // Invoke the compute method and use caching
        Method method = ExpensiveComputation.class.getMethod("compute", int.class);
        System.out.println(computation.checkCacheAndInvoke(method, 5)); // First time, compute
        System.out.println(computation.checkCacheAndInvoke(method, 5)); // Second time, use cache
    }
}
