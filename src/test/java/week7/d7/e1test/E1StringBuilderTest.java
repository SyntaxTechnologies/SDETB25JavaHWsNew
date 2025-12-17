package week7.d7.e1test;

import org.example.week7.d7.e1.E1StringBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E1StringBuilderTest {

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
    void testPalindromeChecker() {
        E1StringBuilder.main(new String[]{});

        String expectedOutput = "Reversed: rac" + System.lineSeparator();


        String failureMessage = "The output does not match the expected results for the palindrome checker.\n" +
                "Please ensure that your program correctly uses StringBuilder methods and checks for palindromes as specified.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}