package testinglistoperationstest;

import com.junittesting.testinglistoperations.ListManager;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {
    private ListManager listManager;
    private List<Integer> list;

    @BeforeEach
    public void setUp() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    // Test for the addElement method
    @Test
    public void testAddElement() {
        listManager.addElement(list, 1);
        assertEquals(1, list.size());
        assertTrue(list.contains(1));
    }

    // Test for the removeElement method
    @Test
    public void testRemoveElement() {
        listManager.addElement(list, 1);
        listManager.removeElement(list, 1);
        assertEquals(0, list.size());
        assertFalse(list.contains(1));
    }

    // Test for the getSize method
    @Test
    public void testGetSize() {
        listManager.addElement(list, 1);
        listManager.addElement(list, 2);
        assertEquals(2, listManager.getSize(list));
    }
}
