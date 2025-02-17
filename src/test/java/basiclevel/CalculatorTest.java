package basiclevel;
import com.reflection.basiclevel.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.*;

class CalculatorTest {
    @Test
    void testInvokePrivateMethod() {
        try {
            Calculator calculator = new Calculator();
            Class<?> cls = calculator.getClass();
            Method method = cls.getDeclaredMethod("multiply", int.class, int.class);
            method.setAccessible(true);

            // Invoke the method and check the result
            int result = (int) method.invoke(calculator, 5, 4);
            assertEquals(20, result);
        } catch (Exception e) {
            fail("Exception: " + e.getMessage());
        }
    }
}
