package week7.d3.e2test;

import org.example.week7.d3.e2.E2StringManipulationsP1;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E2StringManipulationsP1Test {

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
    void testStringOperations() {
        E2StringManipulationsP1.main(new String[]{});
        String expectedOutput = "Length of Timmy: 5" + System.lineSeparator() +
                "Uppercase: TIMMY" + System.lineSeparator() +
                "Lowercase: timmy" + System.lineSeparator();
        String failureMessage = "The output does not match the expected results.\n" +
                "Please ensure that your program correctly assigns the string value, " +
                "calculates its length, and performs the case conversions.";
        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}