package advancedleveltest;

import com.reflection.advancedlevel.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObjectToJsonConverterTest {

    @Test
    public void testToJson() {
        // Create a sample object
        Person person = new Person("Bob", 25);

        // Convert the object to JSON string
        String json = ObjectToJsonConverter.toJson(person);

        // Assert the JSON string
        assertEquals("{\"name\":\"Bob\",\"age\":\"25\"}", json);
    }
}
