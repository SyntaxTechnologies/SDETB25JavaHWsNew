package week10.d1.e3test;

import org.example.week10.d1.e3.E3ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E3ArrayListTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testArrayListPrinting() {
        // Call the main method to produce the output
        E3ArrayList.main(new String[]{});

        // Build the expected output string based on the simplified exercise:
        // Expected order quantities: 10, 20, 15, 30, 25 (each on a new line)
        String expectedOutput = "10" + System.lineSeparator() +
                "20" + System.lineSeparator() +
                "15" + System.lineSeparator() +
                "30" + System.lineSeparator() +
                "25" + System.lineSeparator();

        // Assert that the actual output matches the expected output
        assertEquals("The output from the main method does not match the expected output.",
                expectedOutput, outContent.toString());
    }
}