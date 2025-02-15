package userregistrationtest;

import com.junittesting.userregistration.UserRegistration;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    private UserRegistration registration;

    @BeforeEach
    public void setUp() {
        registration = new UserRegistration();
    }

    // Test for valid user registration
    @Test
    public void testValidUserRegistration() {
        assertDoesNotThrow(() -> {
            registration.registerUser("user123", "user@example.com", "password123");
        });
    }

    // Test for invalid user registration (invalid email)
    @Test
    public void testInvalidUserRegistration_InvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("user123", "userexample.com", "password123");
        });
    }

    // Test for invalid user registration (short password)
    @Test
    public void testInvalidUserRegistration_ShortPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("user123", "user@example.com", "pass");
        });
    }

    // Test for invalid user registration (empty username)
    @Test
    public void testInvalidUserRegistration_EmptyUsername() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("", "user@example.com", "password123");
        });
    }
}
