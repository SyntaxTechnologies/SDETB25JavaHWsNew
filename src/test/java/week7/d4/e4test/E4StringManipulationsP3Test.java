package week7.d4.e4test;

import org.example.week7.d4.e4.E4StringManipulationsP3;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E4StringManipulationsP3Test {

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
    void testIndexOfOperations() {
        E4StringManipulationsP3.main(new String[]{});

        String expectedOutput = "Position of first 'o': 4" + System.lineSeparator() +
                "Position of 'j': -1" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for the indexOf operations.\n" +
                "Please ensure that your program correctly uses the indexOf method and prints the correct results.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}