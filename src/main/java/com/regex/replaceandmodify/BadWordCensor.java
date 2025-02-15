package com.regex.replaceandmodify;

import java.util.Arrays;
import java.util.List;

public class BadWordCensor {
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        List<String> badWords = Arrays.asList("damn", "stupid");
        String censoredText = censorBadWords(text, badWords);
        System.out.println(censoredText);
    }

    public static String censorBadWords(String text, List<String> badWords) {
        for (String badWord : badWords) {
            // Replace each bad word with "****"
            text = text.replaceAll("(?i)\\b" + badWord + "\\b", "****");
        }
        return text;
    }
}
