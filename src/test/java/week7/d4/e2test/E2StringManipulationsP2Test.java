package week7.d4.e2test;

import org.example.week7.d4.e2.E2StringManipulationsP2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E2StringManipulationsP2Test {

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
    void testEmailProcessing() {
        E2StringManipulationsP2.main(new String[]{});

        String expectedOutput = "true" + System.lineSeparator() +
                "false" + System.lineSeparator() +
                "true" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for the email string method checks.\n" +
                "Please ensure that your program correctly assigns the email address, performs the checks (contains, startsWith, endsWith), and prints the boolean results.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}