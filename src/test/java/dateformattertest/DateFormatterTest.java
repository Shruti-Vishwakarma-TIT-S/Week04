package dateformattertest;

import com.junittesting.dateformatter.DateFormatter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.text.ParseException;

public class DateFormatterTest {
    private DateFormatter formatter = new DateFormatter();

    // Test for valid date format conversion
    @Test
    public void testValidDateFormat() throws ParseException {
        String inputDate = "2025-02-16";
        String expectedDate = "16-02-2025";
        assertEquals(expectedDate, formatter.formatDate(inputDate));
    }

    // Test for invalid date format
    @Test
    public void testInvalidDateFormat() {
        String inputDate = "16-02-2025";
        assertThrows(ParseException.class, () -> {
            formatter.formatDate(inputDate);
        });
    }
}
