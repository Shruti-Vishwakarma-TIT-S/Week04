package com.regex.advancedproblems;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashSet;
import java.util.Set;

public class RepeatingWordFinder {

    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        findRepeatingWords(text);
    }

    public static void findRepeatingWords(String text) {
        // Regex pattern for matching repeating words
        String regex = "\\b(\\w+)\\b(?:\\s+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        Set<String> repeatingWords = new HashSet<>();
        // Find and add repeating words to the set
        while (matcher.find()) {
            repeatingWords.add(matcher.group(1));
        }

        // Print all repeating words
        repeatingWords.forEach(System.out::println);
    }
}
