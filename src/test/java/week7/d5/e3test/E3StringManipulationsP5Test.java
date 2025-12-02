package week7.d5.e3test;

import org.example.week7.d5.e3.E3StringManipulationsP5;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E3StringManipulationsP5Test {

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
    void testPhoneNumberFormatting() {
        E3StringManipulationsP5.main(new String[]{});

        String expectedOutput = "1234567890" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for formatting phone numbers.\n" +
                "Please ensure that your program correctly uses the replaceAll method and formats the numbers as specified.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}