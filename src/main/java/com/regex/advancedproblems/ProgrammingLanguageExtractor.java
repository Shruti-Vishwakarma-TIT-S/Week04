package com.regex.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgrammingLanguageExtractor {

    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        extractProgrammingLanguages(text);
    }

    public static void extractProgrammingLanguages(String text) {
        // Regex pattern for matching programming language names
        String regex = "\\b(Java|Python|JavaScript|Go)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Find and print all programming language names in the text
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
