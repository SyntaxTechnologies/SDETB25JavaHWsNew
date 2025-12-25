package week9.d6.e1test;



import org.example.week9.d6.e1.E1Interface;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E1InterfaceTest {

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
    public void testInterfaceImplementation() {
        // Execute the main method from E157SuperKeyword class to generate output
        E1Interface.main(new String[]{});

        // Construct the expected output string
        String expectedOutput =
                "Smartphone is turning on" + System.lineSeparator() +
                "Smartphone is turning off" + System.lineSeparator() +
                "Laptop is turning on" + System.lineSeparator() +
                "Laptop is turning off";

        // Assert that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output.", expectedOutput, outContent.toString().trim());
    }
}
