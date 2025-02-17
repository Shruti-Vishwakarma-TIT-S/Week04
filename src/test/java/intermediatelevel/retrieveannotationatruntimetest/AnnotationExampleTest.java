package intermediatelevel.retrieveannotationatruntimetest;

import com.reflection.intermediatelevel.retrieveannotationatruntime.*;
import org.junit.jupiter.api.Test;
import java.lang.annotation.Annotation;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnnotationExampleTest {

    @Test
    public void testAuthorAnnotation() throws Exception {
        // Use the fully qualified name of the AnnotatedClass
        Class<?> annotatedClass = Class.forName("com.reflection.intermediatelevel.retrieveannotationatruntime.AnnotatedClass");
        Annotation annotation = annotatedClass.getAnnotation(Author.class);

        if (annotation instanceof Author) {
            Author author = (Author) annotation;
            assertEquals("Shruti Vishwakarma", author.name());
        }
    }
}
