package week8.d6.e2test;

import org.example.week8.d6.e2.E2Inheritance;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E2InheritanceTest {

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
    public void testInheritanceOutput() {
        // Execute the main method from E2Inheritance, which should print the inheritance messages
        E2Inheritance.main(new String[]{});

        // Expected output for the multi-level inheritance exercise:
        // I am an animal.
        // I am a mammal.
        // I am a dog.
        String expectedOutput = "I am an animal." + System.lineSeparator() +
                "I am a mammal." + System.lineSeparator() +
                "I am a dog." + System.lineSeparator();

        String failureMessage = "The output does not match the expected inheritance output.\n" +
                "Please ensure that your program prints the following lines exactly:" + System.lineSeparator() +
                "I am an animal." + System.lineSeparator() +
                "I am a mammal." + System.lineSeparator() +
                "I am a dog.";

        // Compare the expected output with the actual captured output
        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}