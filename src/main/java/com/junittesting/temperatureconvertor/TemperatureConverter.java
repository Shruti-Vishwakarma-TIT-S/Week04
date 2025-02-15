package com.junittesting.temperatureconvertor;

public class TemperatureConverter {
    // Method to convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Main method to run the TemperatureConverter class
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        System.out.println("25°C to Fahrenheit: " + converter.celsiusToFahrenheit(25));
        System.out.println("77°F to Celsius: " + converter.fahrenheitToCelsius(77));
    }
}
