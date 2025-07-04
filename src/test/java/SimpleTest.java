import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * A simple test class to demonstrate JUnit functionality.
 * This class contains basic tests that will always pass.
 */
public class SimpleTest {

    @Test
    public void testAddition() {
        // Simple arithmetic test
        assertEquals(4, 2 + 2);
        System.out.println("Addition test passed!");
    }

    @Test
    public void testString() {
        // String comparison test
        String expected = "Hello, Jenkins!";
        String actual = "Hello, " + "Jenkins!";
        assertEquals(expected, actual);
        System.out.println("String test passed!");
    }

    @Test
    public void testBoolean() {
        // Boolean test
        assertTrue(true);
        assertFalse(false);
        System.out.println("Boolean test passed!");
    }
}
