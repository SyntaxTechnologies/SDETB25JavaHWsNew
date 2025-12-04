package week5.d4.e2test;

import org.example.week5.d4.e2.E2NestedForLoops;
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
    void testPatternOutput() {
        E2NestedForLoops.main(new String[]{});
        String expectedOutput = "SDLC" + System.lineSeparator() +
                "Java" + System.lineSeparator() +
                "Java" + System.lineSeparator() +
                "Java" + System.lineSeparator() +
                "SDLC" + System.lineSeparator() +
                "Java" + System.lineSeparator() +
                "Java" + System.lineSeparator() +
                "Java" + System.lineSeparator();

        String failureMessage = "The output does not match the expected pattern.\n" +
                "Please ensure that your program correctly prints the pattern using nested loops.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}