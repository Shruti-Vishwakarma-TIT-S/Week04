package basicjunittest;

import com.junittesting.basicjunit.Calculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    // Test for the add method
    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-2, 2));
    }

    // Test for the subtract method
    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-4, calculator.subtract(2, 6));
    }

    // Test for the multiply method
    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-8, calculator.multiply(-2, 4));
    }

    // Test for the divide method
    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(-2, calculator.divide(-8, 4));
    }

    // Test for division by zero
    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(1, 0);
        });
    }
}
