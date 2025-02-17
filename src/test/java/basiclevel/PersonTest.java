package basiclevel;
import com.reflection.basiclevel.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.*;

class PersonTest {
    @Test
    void testAccessPrivateField() {
        try {
            Person person = new Person();
            Class<?> cls = person.getClass();
            Field field = cls.getDeclaredField("age");
            field.setAccessible(true);

            // Check initial value
            int ageValue = (int) field.get(person);
            assertEquals(25, ageValue);

            // Modify the value and check
            field.set(person, 30);
            ageValue = (int) field.get(person);
            assertEquals(30, ageValue);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            fail("Exception: " + e.getMessage());
        }
    }
}
