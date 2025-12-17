package week9.d4.e1test;

import org.example.week9.d4.e1.E1ObjectTypeCasting;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E1ObjectTypeCastingTest {

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
    public void testTypeCastingOutput() {
        // Execute the main method from E1ObjectTypeCasting to generate output
        E1ObjectTypeCasting.main(new String[]{});

        // Construct the expected output string
        String expectedOutput = "Woof!" + System.lineSeparator() +
                "Fetching the ball!" + System.lineSeparator();

        String failureMessage = "The output from the main method does not match the expected output.\n" +
                "Ensure that your program prints:" + System.lineSeparator() +
                "Woof!" + System.lineSeparator() +
                "Fetching the ball!";

        // Assert that the captured output matches the expected output
        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}