package week5.d5.e1test;

import org.example.week5.d5.e1.E1NestedForLoops;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E1NestedForLoopsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testPrintAllElements() {
        E1NestedForLoops.main(new String[]{});
        String expectedOutput = "1 2 3 4 " + System.lineSeparator() +
                "5 6 7 8 " + System.lineSeparator() +
                "9 10 11 12 " + System.lineSeparator();
        String failureMessage = "The output does not match the expected matrix format.\n" +
                "Please ensure that your program correctly prints all elements of the 2D array with proper spacing and newlines.";
        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}