package basiclevel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.*;

class ClassInfoTest {
    @Test
    void testGetClassInfo() {
        try {
            String className = "java.util.ArrayList";
            Class<?> cls = Class.forName(className);

            // Check class name
            assertEquals("java.util.ArrayList", cls.getName());

            // Check method count
            Method[] methods = cls.getDeclaredMethods();
            assertTrue(methods.length > 0);

            // Check field count (ArrayList has some private fields)
            Field[] fields = cls.getDeclaredFields();
            assertTrue(fields.length > 0);

            // Check constructor count (ArrayList has multiple constructors)
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            assertTrue(constructors.length > 0);
        } catch (ClassNotFoundException e) {
            fail("Class not found: " + e.getMessage());
        }
    }
}

