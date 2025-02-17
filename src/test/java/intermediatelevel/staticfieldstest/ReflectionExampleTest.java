package intermediatelevel.staticfieldstest;

import com.reflection.intermediatelevel.staticfields.Configuration;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReflectionExampleTest {

    @Test
    public void testModifyStaticField() throws Exception {
        // Use the fully qualified name of the Configuration class
        Class<?> configClass = Class.forName("com.reflection.intermediatelevel.staticfields.Configuration");

        Field apiKeyField = configClass.getDeclaredField("API_KEY");
        apiKeyField.setAccessible(true);

        // Modify the value
        apiKeyField.set(null, "new_api_key");

        // Check the modified value
        String apiKey = (String) apiKeyField.get(null);
        assertEquals("new_api_key", apiKey);
    }
}
