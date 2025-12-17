package week9.d4.e2test;

import org.example.week9.d4.e2.E2PolyMorphism;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E2PolyMorphismTest {

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
    public void testPolymorphismOutput() {
        // Execute the main method from E2PolyMorphism to generate output
        E2PolyMorphism.main(new String[]{});

        // Construct the expected output string
        String expectedOutput = "78.54" + System.lineSeparator() +
                "24.00" + System.lineSeparator();

        String failureMessage = "The output from the main method does not match the expected output.\n" +
                "Ensure that your program prints:" + System.lineSeparator() +
                "78.54" + System.lineSeparator() +
                "24.00";

        // Assert that the captured output matches the expected output
        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}