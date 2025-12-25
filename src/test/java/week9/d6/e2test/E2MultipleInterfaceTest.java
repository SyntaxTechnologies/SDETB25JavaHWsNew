package week9.d6.e2test;



import org.example.week9.d6.e2.E2MultipleInterface;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E2MultipleInterfaceTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        // Redirect System.out to capture the console output
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Restore System.out after the test
        System.setOut(originalOut);
    }

    @Test
    public void testMultipleInterfaceImplementation() {
        // Execute the main method from E157SuperKeyword class to generate output
        E2MultipleInterface.main(new String[]{});

        // Construct the expected output string
        String expectedOutput =
                "Turning on Smart Home Device" + System.lineSeparator() +
                "Configuring Smart Home Device settings";

        // Assert that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output.", expectedOutput, outContent.toString().trim());
    }
}
