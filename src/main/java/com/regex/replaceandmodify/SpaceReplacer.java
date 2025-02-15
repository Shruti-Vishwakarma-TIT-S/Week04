package com.regex.replaceandmodify;

public class SpaceReplacer {
    public static void main(String[] args) {
        String text = "This is an  example   with multiple    spaces.";
        String modifiedText = replaceMultipleSpaces(text);
        System.out.println(modifiedText);
    }

    public static String replaceMultipleSpaces(String text) {
        // Regex pattern to replace multiple spaces with a single space
        return text.replaceAll("\\s+", " ");
    }
}

