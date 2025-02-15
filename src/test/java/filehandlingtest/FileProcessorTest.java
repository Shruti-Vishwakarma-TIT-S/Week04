package filehandlingtest;

import com.junittesting.filehandling.FileProcessor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.File;
import java.io.IOException;

public class FileProcessorTest {
    private FileProcessor fileProcessor;
    private String filename = "testfile.txt";

    @BeforeEach
    public void setUp() {
        fileProcessor = new FileProcessor();
    }

    @AfterEach
    public void tearDown() {
        File file = new File(filename);
        if (file.exists()) {
            file.delete();
        }
    }

    // Test to check if the content is written and read correctly
    @Test
    public void testWriteAndReadFile() throws IOException {
        String content = "Hello, this is a test file.";
        fileProcessor.writeToFile(filename, content);
        String readContent = fileProcessor.readFromFile(filename);
        assertEquals(content, readContent);
    }

    // Test to check if the file exists after writing
    @Test
    public void testFileExistsAfterWriting() throws IOException {
        String content = "Hello, this is a test file.";
        fileProcessor.writeToFile(filename, content);
        File file = new File(filename);
        assertTrue(file.exists());
    }

    // Test to handle IOException when the file does not exist
    @Test
    public void testReadFileIOException() {
        assertThrows(IOException.class, () -> {
            fileProcessor.readFromFile("nonexistentfile.txt");
        });
    }
}
