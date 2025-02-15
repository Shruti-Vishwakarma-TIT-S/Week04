package com.regex.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtractor {
    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        extractDates(text);
    }

    public static void extractDates(String text) {
        // Regex pattern for matching dates in dd/mm/yyyy format
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Find and print all dates in the text
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
