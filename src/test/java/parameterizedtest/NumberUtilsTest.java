package parameterizedtest;
import com.junittesting.parameterized.NumberUtils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NumberUtilsTest {
    private NumberUtils numberUtils;

    @BeforeEach
    public void setUp() {
        numberUtils = new NumberUtils();
    }

    // Test for 2
    @Test
    public void testIsEven_2() {
        assertTrue(numberUtils.isEven(2));
    }

    // Test for 4
    @Test
    public void testIsEven_4() {
        assertTrue(numberUtils.isEven(4));
    }

    // Test for 6
    @Test
    public void testIsEven_6() {
        assertTrue(numberUtils.isEven(6));
    }

    // Test for 7
    @Test
    public void testIsEven_7() {
        assertFalse(numberUtils.isEven(7));
    }

    // Test for 9
    @Test
    public void testIsEven_9() {
        assertFalse(numberUtils.isEven(9));
    }
}
