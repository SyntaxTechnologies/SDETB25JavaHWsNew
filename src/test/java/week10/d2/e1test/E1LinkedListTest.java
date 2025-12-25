package week10.d2.e1test;


import org.example.week10.d2.e1.E1LinkedList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E1LinkedListTest {

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
    public void testLinkedListAfterRemovals() {
        // Execute the main method to produce the output
        E1LinkedList.main(new String[]{});
        // Build the expected output string
        String expectedOutput = "[51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]"+System.lineSeparator();
        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, outContent.toString());
    }
}
