package com.junittesting.dateformatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
    // Method to format date from yyyy-MM-dd to dd-MM-yyyy
    public String formatDate(String inputDate) throws ParseException {
        SimpleDateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat targetFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = originalFormat.parse(inputDate);
        return targetFormat.format(date);
    }

    // Main method to run the DateFormatter class
    public static void main(String[] args) {
        DateFormatter formatter = new DateFormatter();
        try {
            System.out.println("Formatted date: " + formatter.formatDate("2025-02-16"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
