package com.generics.resumescreeningsystem;

// Main class
public class Main {

    // Method call
    public static void main(String[] args) {

        // Object creation
        Resume<SoftwareEngineer> softwareEngineerResumes = new Resume<>();
        Resume<DataScientist> dataScientistResumes = new Resume<>();
        Resume<ProductManager> productManagerResumes = new Resume<>();

        // Method call
        softwareEngineerResumes.addResume(new SoftwareEngineer());
        dataScientistResumes.addResume(new DataScientist());
        productManagerResumes.addResume(new ProductManager());

        // Print individual resumes
        System.out.println("All Software Engineer Resumes:\n" + softwareEngineerResumes);
        System.out.println("All Data Scientist Resumes:\n" + dataScientistResumes);
        System.out.println("All Product Manager Resumes:\n" + productManagerResumes);

        // Print all resumes
        System.out.println("\nScreening All Resumes:");
        ResumeScreening.processResumes(softwareEngineerResumes.getAllResumes());
        ResumeScreening.processResumes(dataScientistResumes.getAllResumes());
        ResumeScreening.processResumes(productManagerResumes.getAllResumes());
    }
}
