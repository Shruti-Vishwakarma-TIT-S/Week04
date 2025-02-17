package advancedleveltest;

import com.reflection.advancedlevel.*;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomObjectMapperTest {

    @Test
    public void testToObject() {
        // Create a map of properties
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Anjali");
        properties.put("age", 30);

        // Map the properties to the Person object
        Person person = CustomObjectMapper.toObject(Person.class, properties);

        // Assert the field values
        assertEquals("Alice", person.getName());
        assertEquals(30, person.getAge());
    }
}
