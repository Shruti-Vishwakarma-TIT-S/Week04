package com.regex.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddressValidator {

    public static boolean isValidIPAddress(String ipAddress) {
        // Regex pattern for a valid IPv4 address
        String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        return ipAddress.matches(regex);
    }

    public static void main(String[] args) {
        // Example IP addresses to test
        String[] ipAddresses = {"192.168.1.1", "255.255.255.255", "256.256.256.256", "123.456.789.0"};

        // Loop through each IP address and validate it
        for (String ipAddress : ipAddresses) {
            // Check and print if the IP address is valid or invalid
            if (isValidIPAddress(ipAddress)) {
                System.out.println(ipAddress + " → Valid");
            } else {
                System.out.println(ipAddress + " → Invalid");
            }
        }
    }
}
