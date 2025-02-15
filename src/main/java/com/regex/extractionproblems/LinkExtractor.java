package com.regex.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkExtractor {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        extractLinks(text);
    }

    public static void extractLinks(String text) {
        // Regex pattern for matching URLs
        String regex = "https?://\\S+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Find and print all URLs in the text
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
