package week8.d4.e2test;

import org.example.week8.d4.e2.E2AccessModifiers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E2AccessModifiersTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        // Redirect System.out to capture console output for verification
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Restore original System.out after the test completes
        System.setOut(originalOut);
    }

    @Test
    public void testMainMethodOutput() {
        // Invoke the main method of E2AccessModifiers, which creates an AccessTester and calls display()
        E2AccessModifiers.main(new String[]{});
        // Build the expected output string matching the display() method format
        String expectedOutput = "My name is John and I live in Miami. I study at Syntax in batch 9."
                + System.lineSeparator();
        // Verify that the captured console output matches the expected output
        assertEquals("Console output does not match expected details",
                expectedOutput.trim(),
                outContent.toString().trim());
    }
}