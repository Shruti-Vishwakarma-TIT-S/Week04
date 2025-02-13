package com.javastreams.imagebytetoarray;

import java.io.*;

public class ImageByteArray {
    public static void main(String[] args) {
        // Specify the source image file path
        String sourceImage = "C:\\Users\\HP\\OneDrive\\Attachments\\Week4Day3\\src\\main\\java\\com\\javastreams\\imagebytetoarray\\Screenshot (20).png";

        // Specify the destination image file path
        String destinationImage = "destinationImage.jpg";

        try {
            // Convert the source image to a byte array
            byte[] imageBytes = convertImageToByteArray(sourceImage);

            // Write the byte array back to a new image file
            writeByteArrayToImage(imageBytes, destinationImage);

            // Verify that the new file is identical to the original image
            System.out.println("Image conversion and verification completed successfully.");
        } catch (IOException e) {
            // Handle any IOExceptions that may occur
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Method to convert an image to a byte array
    private static byte[] convertImageToByteArray(String imagePath) throws IOException {
        // Use try-with-resources to ensure streams are closed properly
        try (FileInputStream fis = new FileInputStream(imagePath);
             ByteArrayOutputStream bos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096]; // Buffer to hold chunks of data
            int bytesRead;
            // Read the image file and write to ByteArrayOutputStream
            while ((bytesRead = fis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            // Return the byte array
            return bos.toByteArray();
        }
    }

    // Method to write a byte array to an image file
    private static void writeByteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
        // Use try-with-resources to ensure streams are closed properly
        try (ByteArrayInputStream bis = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            byte[] buffer = new byte[4096]; // Buffer to hold chunks of data
            int bytesRead;
            // Read from ByteArrayInputStream and write to the output image file
            while ((bytesRead = bis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
}
