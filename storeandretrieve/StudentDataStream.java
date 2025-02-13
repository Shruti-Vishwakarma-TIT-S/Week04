package com.javastreams.storeandretrieve;

import java.io.*;

public class StudentDataStream {
    private static final String FILE_NAME = "studentData.bin";

    public static void main(String[] args) {
        // Sample student details
        int rollNumber = 101;
        String name = "Manisha";
        double gpa = 3.8;

        // Write student details to a binary file
        writeStudentData(rollNumber, name, gpa);

        // Read and display student details from the binary file
        readStudentData();
    }

    // Method to write student details to a binary file
    private static void writeStudentData(int rollNumber, String name, double gpa) {
        // Use try-with-resources to ensure streams are closed properly
        try (FileOutputStream fos = new FileOutputStream(FILE_NAME);
             DataOutputStream dos = new DataOutputStream(fos)) {

            // Write student details to the binary file
            dos.writeInt(rollNumber);
            dos.writeUTF(name);
            dos.writeDouble(gpa);
            System.out.println("Student data written to file.");

        } catch (IOException e) {
            // Handle any IOExceptions that may occur
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    // Method to read student details from the binary file
    private static void readStudentData() {
        // Use try-with-resources to ensure streams are closed properly
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             DataInputStream dis = new DataInputStream(fis)) {

            // Read student details from the binary file
            int rollNumber = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            // Display the retrieved student details
            System.out.println("Student Data Retrieved:");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);

        } catch (IOException e) {
            // Handle any IOExceptions that may occur
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}
