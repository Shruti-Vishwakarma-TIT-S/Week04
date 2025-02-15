package com.regex.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWordsExtractor {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        extractCapitalizedWords(text);
    }

    public static void extractCapitalizedWords(String text) {
        // Regex pattern for matching capitalized words
        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Find and print all capitalized words in the text
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
