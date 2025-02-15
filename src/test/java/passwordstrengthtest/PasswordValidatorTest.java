package passwordstrengthtest;

import com.junittesting.passwordstrength.PasswordValidator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    private PasswordValidator validator;

    @BeforeEach
    public void setUp() {
        validator = new PasswordValidator();
    }

    // Test for valid passwords
    @Test
    public void testValidPasswords() {
        assertTrue(validator.validate("Password123"));
        assertTrue(validator.validate("HelloWorld1"));
    }

    // Test for invalid passwords
    @Test
    public void testInvalidPasswords() {
        assertFalse(validator.validate("password"));
        assertFalse(validator.validate("Password"));
        assertFalse(validator.validate("12345678"));
        assertFalse(validator.validate("Pass12"));
    }
}
