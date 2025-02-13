package com.collections.insurancepolicy;

import java.util.*;

public class PolicyManagement {
    // Using different types of sets for different purposes
    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>(Comparator.comparing(Policy::getExpiryDate));

    // Method to add a policy to all sets
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    // Retrieve all unique policies
    public Set<Policy> getAllUniquePolicies() {
        return new HashSet<>(hashSet);
    }

    // Retrieve policies expiring within the next 30 days
    public Set<Policy> getPoliciesExpiringSoon() {
        Set<Policy> expiringPolicies = new HashSet<>();
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 30);
        Date soon = cal.getTime();

        for (Policy policy : treeSet) {
            if (policy.getExpiryDate().after(now) && policy.getExpiryDate().before(soon)) {
                expiringPolicies.add(policy);
            }
        }
        return expiringPolicies;
    }

    // Retrieve policies with a specific coverage type
    public Set<Policy> getPoliciesByCoverageType(String coverageType) {
        Set<Policy> policiesByCoverage = new HashSet<>();
        for (Policy policy : hashSet) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                policiesByCoverage.add(policy);
            }
        }
        return policiesByCoverage;
    }

    // Retrieve duplicate policies based on policy numbers
    public Set<Policy> getDuplicatePolicies() {
        Set<Policy> duplicates = new HashSet<>();
        Set<String> seenPolicyNumbers = new HashSet<>();
        for (Policy policy : hashSet) {
            if (!seenPolicyNumbers.add(policy.getPolicyNumber())) {
                duplicates.add(policy);
            }
        }
        return duplicates;
    }

    // Method to remove a policy from all sets
    public void removePolicy(Policy policy) {
        hashSet.remove(policy);
        linkedHashSet.remove(policy);
        treeSet.remove(policy);
    }

    // Performance comparison method (example usage)
    public void comparePerformance() {
        long startTime, endTime;

        // Performance of HashSet
        startTime = System.nanoTime();
        hashSet.contains(new Policy("example", "Jasmine", new Date(), "Health", 1000));
        endTime = System.nanoTime();
        System.out.println("HashSet lookup time: " + (endTime - startTime) + " ns");

        // Performance of LinkedHashSet
        startTime = System.nanoTime();
        linkedHashSet.contains(new Policy("example", "Seema", new Date(), "Health", 1000));
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet lookup time: " + (endTime - startTime) + " ns");

        // Performance of TreeSet
        startTime = System.nanoTime();
        treeSet.contains(new Policy("example", "Dimple", new Date(), "Health", 1000));
        endTime = System.nanoTime();
        System.out.println("TreeSet lookup time: " + (endTime - startTime) + " ns");
    }

    public static void main(String[] args) {
        PolicyManagement pm = new PolicyManagement();

        // Add sample policies
        pm.addPolicy(new Policy("P001", "Nikhil", new Date(2025 - 1900, Calendar.MARCH, 1), "Health", 5000));
        pm.addPolicy(new Policy("P002", "Anish", new Date(2025 - 1900, Calendar.FEBRUARY, 20), "Auto", 3000));
        pm.addPolicy(new Policy("P003", "Hemant", new Date(2025 - 1900, Calendar.MARCH, 10), "Home", 7000));

        // Retrieve and display all unique policies
        System.out.println("All Unique Policies: " + pm.getAllUniquePolicies());

        // Retrieve and display policies expiring soon
        System.out.println("Policies Expiring Soon: " + pm.getPoliciesExpiringSoon());

        // Retrieve and display policies by coverage type
        System.out.println("Policies by Coverage Type (Auto): " + pm.getPoliciesByCoverageType("Auto"));

        // Retrieve and display duplicate policies
        System.out.println("Duplicate Policies: " + pm.getDuplicatePolicies());

        // Performance comparison
        pm.comparePerformance();
    }
}
