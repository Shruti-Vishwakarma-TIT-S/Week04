package testingexceptiontest;

import com.junittesting.testingexception.DivisionHandler;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DivisionHandlerTest {
    private DivisionHandler divisionHandler;

    @BeforeEach
    public void setUp() {
        divisionHandler = new DivisionHandler();
    }

    // Test for the divide method
    @Test
    public void testDivide() {
        assertEquals(5, divisionHandler.divide(10, 2));
        assertEquals(-5, divisionHandler.divide(-10, 2));
    }

    // Test for division by zero exception
    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            divisionHandler.divide(10, 0);
        });
    }
}
