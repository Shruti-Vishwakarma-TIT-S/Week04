package com.regex.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyValueExtractor {

    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";
        extractCurrencyValues(text);
    }

    public static void extractCurrencyValues(String text) {
        // Regex pattern for matching currency values
        String regex = "\\$?\\d+\\.\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Find and print all currency values in the text
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
