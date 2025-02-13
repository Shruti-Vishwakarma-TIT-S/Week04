package com.collections.queue;
import java.util.*;

public class HospitalTriageSystem {

    // Class to represent a patient with name and severity
    static class Patient {
        String name;
        int severity;

        // Constructor to initialize patient details
        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }

        // Override toString method to print patient details
        @Override
        public String toString() {
            return name + " (Severity: " + severity + ")";
        }
    }

    public static void main(String[] args) {
        // Create a priority queue with a custom comparator for patient severity
        PriorityQueue<Patient> pq = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.severity, p1.severity));

        // Add patients to the priority queue
        pq.add(new Patient("Jasmine", 3));
        pq.add(new Patient("Mohit", 5));
        pq.add(new Patient("Chandni", 2));

        // Simulate the hospital triage system
        System.out.println("Patients treated in order of severity:");
        while (!pq.isEmpty()) {
            // Treat the patient with the highest severity
            System.out.println(pq.remove());
        }
    }
}

