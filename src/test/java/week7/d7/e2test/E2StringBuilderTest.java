package week7.d7.e2test;

import org.example.week7.d7.e2.E2StringBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E2StringBuilderTest {

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
    void testTimeFormatter() {
        E2StringBuilder.main(new String[]{});

        String expectedOutput = "Original: 1200, Formatted: 12:00" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for the time formatter.\n" +
                "Please ensure that your program correctly uses StringBuilder's insert method and formats the times as specified.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}