package basiclevel;
import com.reflection.basiclevel.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.*;

class StudentTest {
    @Test
    void testDynamicallyCreateObjects() {
        try {
            Class<?> cls = Class.forName("Student");
            Constructor<?> constructor = cls.getConstructor();
            Object studentInstance = constructor.newInstance();

            // Check if the instance is created
            assertNotNull(studentInstance);
            assertTrue(studentInstance instanceof Student);
        }
        catch (Exception e) {
            fail("Exception: " + e.getMessage());
        }
    }
}
