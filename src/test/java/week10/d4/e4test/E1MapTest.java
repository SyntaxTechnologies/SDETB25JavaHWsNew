package week10.d4.e4test;

import org.example.week10.d4.e4.E1Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E1MapTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        // Redirect System.out to capture output for testing
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Restore the original System.out after tests
        System.setOut(originalOut);
    }

    @Test
    public void testLinkedHashMapOperations() {
        // Execute the main method from E1Map to perform the map operations
     E1Map.main(new String[]{});

        // Build the expected output string
        String expectedOutput = "Size: 5" + System.lineSeparator() +
                "Is map empty? false" + System.lineSeparator() +
                "City: Vienna" + System.lineSeparator() +
                "After clearing, is map empty? true" + System.lineSeparator();

        // Assert that the captured output matches the expected output
        assertEquals("The output does not match the expected output.", expectedOutput, outContent.toString());
    }
}