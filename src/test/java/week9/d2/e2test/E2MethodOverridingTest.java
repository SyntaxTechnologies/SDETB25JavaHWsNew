package week9.d2.e2test;

import org.example.week9.d2.e1.E1MethodOverloading;
import org.example.week9.d2.e2.E2MethodOverriding;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E2MethodOverridingTest {

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
    public void testMethodOverriding() {
        // Execute the main method from E1MethodOverriding, which should demonstrate method overriding
        E2MethodOverriding.main(new String[]{});

        // The expected output is that the overridden method in Dog prints "Bark."
        String expectedOutput = "Bark." + System.lineSeparator();
        String failureMessage = "The output does not match the expected result.\n" +
                "Ensure that the Dog class correctly overrides the makeSound() method to print 'Bark.'";

        // Compare the expected output with the actual captured output
        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}