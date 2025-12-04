package week5.d3.e1test;


import org.example.week5.d3.e1.E1EnhancedForLoop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E1EnhancedForLoopTest {

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
    void testArrayValues() {
        E1EnhancedForLoop.main(new String[]{});
        String expectedOutput = "2025" + System.lineSeparator() +
                                "2026" + System.lineSeparator() +
                                "2027" + System.lineSeparator() +
                                "2028" + System.lineSeparator() +
                                "2029" + System.lineSeparator() +
                                "2030" + System.lineSeparator() +
                                "2031" + System.lineSeparator() +
                                "2032" + System.lineSeparator() +
                                "2033" + System.lineSeparator() +
                                "2034" + System.lineSeparator() +
                                "2035" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the array.\n" +
                "Please ensure that your program correctly creates the array and prints all values.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
