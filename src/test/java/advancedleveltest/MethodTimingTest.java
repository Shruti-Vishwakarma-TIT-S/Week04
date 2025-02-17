package advancedleveltest;
import com.reflection.advancedlevel.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class MethodTimingTest {

    @Test
    public void testMeasureExecutionTime() {
        // Create an instance of the class containing the method to be measured
        SampleClass sample = new SampleClass();

        // Measure the execution time of the method and assert that no exceptions are thrown
        assertDoesNotThrow(() -> MethodTiming.measureExecutionTime(sample, "performTask"));
    }
}
