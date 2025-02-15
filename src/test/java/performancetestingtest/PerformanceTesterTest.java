package performancetestingtest;
import com.junittesting.performancetesting.PerformanceTester;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

public class PerformanceTesterTest {
    private PerformanceTester performanceTester;

    @BeforeEach
    public void setUp() {
        performanceTester = new PerformanceTester();
    }

    // Test for the longRunningTask method with a timeout of 2 seconds
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void testLongRunningTask() {
        assertEquals("Task Completed", performanceTester.longRunningTask());
    }
}