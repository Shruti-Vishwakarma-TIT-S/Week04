package com.regex.basicregexproblems;

public class HexColorValidator {

    /**
     * This method checks if the given hex color code is valid.
     * @param hexColor The hex color code to be validated.
     * @return true if the hex color code is valid, false otherwise.
     */
    public static boolean isValidHexColor(String hexColor) {
        // Regex pattern for a valid hex color code
        String regex = "^#([A-Fa-f0-9]{6})$";
        return hexColor.matches(regex);
    }

    public static void main(String[] args) {
        // Example hex color codes to test
        String[] hexColors = {"#FFA500", "#ff4500", "#123", "#00FF00"};

        // Loop through each hex color code and validate it
        for (String hexColor : hexColors) {
            // Check and print if the hex color code is valid or invalid
            if (isValidHexColor(hexColor)) {
                System.out.println(hexColor + " → Valid");
            } else {
                System.out.println(hexColor + " → Invalid");
            }
        }
    }
}
