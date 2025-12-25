package week9.d6.e3test;


import org.example.week9.d6.e3.E3Encapsulation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E3EncapsulationTest {

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
    public void testEmployeeEncapsulation() {
        // Execute the main method from HumanResources class to generate output
        E3Encapsulation.main(new String[]{});

        // Construct the expected output string
        String expectedOutput =
                "Employee Name: John" + System.lineSeparator() +
                "Employee Age: 30";

        // Assert that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output.", expectedOutput, outContent.toString().trim());
    }
}
