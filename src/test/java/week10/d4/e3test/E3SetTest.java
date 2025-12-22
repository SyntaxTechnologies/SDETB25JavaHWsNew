package week10.d4.e3test;


import org.example.week10.d4.e3.E3Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E3SetTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        // Redirect System.out to capture the output for testing
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Restore System.out after the test
        System.setOut(originalOut);
    }

    @Test
    public void testEmailListOutput() {
        // Execute the main method from E197EmailCollectionLinkedHashSet
        E3Set.main(new String[]{});

        // Build the expected output string
        String expectedOutput = "Email List using For-Each:" + System.lineSeparator() +
                "null" + System.lineSeparator() +
                "john.doe@example.com" + System.lineSeparator() +
                "jane.smith@example.com" + System.lineSeparator() +
                "admin@event.com" + System.lineSeparator() +
                "info@company.com";

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }
}