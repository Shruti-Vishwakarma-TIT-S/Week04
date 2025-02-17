package intermediatelevel.dynamicmethodinvocationtest;

import com.reflection.intermediatelevel.dynamicmethodinvocation.MathOperations;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicInvocationExampleTest {

    @Test
    public void testAddMethod() throws Exception {
        // Use the fully qualified name of the MathOperations class
        Class<?> mathOpsClass = Class.forName("com.reflection.intermediatelevel.dynamicmethodinvocation.MathOperations");
        Object mathOpsInstance = mathOpsClass.getDeclaredConstructor().newInstance();

        Method addMethod = mathOpsClass.getMethod("add", int.class, int.class);
        int result = (int) addMethod.invoke(mathOpsInstance, 5, 3);

        assertEquals(8, result);
    }

    @Test
    public void testSubtractMethod() throws Exception {
        Class<?> mathOpsClass = Class.forName("com.reflection.intermediatelevel.dynamicmethodinvocation.MathOperations");
        Object mathOpsInstance = mathOpsClass.getDeclaredConstructor().newInstance();

        Method subtractMethod = mathOpsClass.getMethod("subtract", int.class, int.class);
        int result = (int) subtractMethod.invoke(mathOpsInstance, 5, 3);

        assertEquals(2, result);
    }

    @Test
    public void testMultiplyMethod() throws Exception {
        Class<?> mathOpsClass = Class.forName("com.reflection.intermediatelevel.dynamicmethodinvocation.MathOperations");
        Object mathOpsInstance = mathOpsClass.getDeclaredConstructor().newInstance();

        Method multiplyMethod = mathOpsClass.getMethod("multiply", int.class, int.class);
        int result = (int) multiplyMethod.invoke(mathOpsInstance, 5, 3);

        assertEquals(15, result);
    }
}
