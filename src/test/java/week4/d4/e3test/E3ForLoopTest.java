package week4.d4.e3test;

import org.junit.jupiter.api.AfterEach;
import org.example.week4.d4.e3.E3ForLoop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E3ForLoopTest {

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
    void testForLoop() {
        E3ForLoop.main(new String[]{});
        String expectedOutput = "Hey, it is year:" + System.lineSeparator() +
                "2025" + System.lineSeparator() +
                "Hey, it is year:" + System.lineSeparator() +
                "2026" + System.lineSeparator() +
                "Hey, it is year:" + System.lineSeparator() +
                "2027" + System.lineSeparator() +
                "Hey, it is year:" + System.lineSeparator() +
                "2028" + System.lineSeparator() +
                "Hey, it is year:" + System.lineSeparator() +
                "2029" + System.lineSeparator() +
                "Hey, it is year:" + System.lineSeparator() +
                "2030" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the for loop.\n" +
                "Please ensure that your program correctly uses the for loop to print 'Hey, it is year:' followed by the year.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}