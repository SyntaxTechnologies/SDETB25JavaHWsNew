package week7.d5.e4test;

import org.example.week7.d5.e4.E4StringManipulationsP5;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E4StringManipulationsP5Test {

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
    void testCSVDataSplitting() {
        E4StringManipulationsP5.main(new String[]{});

        String expectedOutput = "John Doe" + System.lineSeparator() +
                "22" + System.lineSeparator() +
                "Computer Science" + System.lineSeparator() +
                "3.8" + System.lineSeparator() +
                "2025" + System.lineSeparator();

        String failureMessage = "The output does not match the expected result.\n" +
                "Please ensure that your program splits the CSV string and prints each field on a new line.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}