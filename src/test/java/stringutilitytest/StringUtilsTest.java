package stringutilitytest;

import com.junittesting.stringutility.StringUtils;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    private StringUtils stringUtils;

    @BeforeEach
    public void setUp() {
        stringUtils = new StringUtils();
    }

    // Test for the reverse method
    @Test
    public void testReverse() {
        assertEquals("olleh", stringUtils.reverse("hello"));
        assertEquals("madam", stringUtils.reverse("madam"));
    }

    // Test for the isPalindrome method
    @Test
    public void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("madam"));
        assertFalse(stringUtils.isPalindrome("hello"));
    }

    // Test for the toUpperCase method
    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
        assertEquals("JAVA", stringUtils.toUpperCase("java"));
    }
}
