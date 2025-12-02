package week7.d5.e2test;

import org.example.week7.d5.e2.E2StringManipulationsP4;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E2StringManipulationsP4Test {

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
    void testTextMessageReplacement() {
        E2StringManipulationsP4.main(new String[]{});

        // Expected output: The program should replace "LMK" with "Let me know"
        // and then print the modified message.
        String expectedOutput = "Hey! Let me know if you are free." + System.lineSeparator();
        String failureMessage = "The output does not match the expected result.\n" +
                "Ensure that your program replaces 'LMK' with 'Let me know' and prints the modified message.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}