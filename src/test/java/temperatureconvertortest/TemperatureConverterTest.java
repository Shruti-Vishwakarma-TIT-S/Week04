package temperatureconvertortest;

import com.junittesting.temperatureconvertor.TemperatureConverter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {
    private TemperatureConverter converter;

    @BeforeEach
    public void setUp() {
        converter = new TemperatureConverter();
    }

    // Test for Celsius to Fahrenheit conversion
    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(77, converter.celsiusToFahrenheit(25), 0.001);
        assertEquals(32, converter.celsiusToFahrenheit(0), 0.001);
    }

    // Test for Fahrenheit to Celsius conversion
    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(25, converter.fahrenheitToCelsius(77), 0.001);
        assertEquals(0, converter.fahrenheitToCelsius(32), 0.001);
    }
}
