package advancedleveltest;
import com.reflection.advancedlevel.*;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DependencyInjectorTest {

    @Test
    public void testInjectDependencies() throws Exception {
        // Create a client instance
        Client client = new Client();

        // Perform dependency injection
        DependencyInjector.injectDependencies(client);

        // Use reflection to access the private service field
        Field serviceField = Client.class.getDeclaredField("service");
        serviceField.setAccessible(true);

        // Assert that the service was injected
        assertNotNull(serviceField.get(client));

        // Call a method on the client to demonstrate that the dependency was injected
        client.doWork();
    }
}
