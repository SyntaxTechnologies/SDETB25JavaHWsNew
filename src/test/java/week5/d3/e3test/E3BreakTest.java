package week5.d3.e3test;


import org.example.week5.d3.e3.E3Break;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E3BreakTest {

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
    void testTemperatureMonitoring() {
        E3Break.main(new String[]{});
        String expectedOutput = "Temperature is normal: 36.5°C" + System.lineSeparator() +
                                "Temperature is normal: 37.0°C" + System.lineSeparator() +
                                "Temperature is normal: 37.5°C" + System.lineSeparator() +
                                "Temperature is normal: 38.0°C" + System.lineSeparator() +
                                "Critical temperature reached: 39.5°C. Stopping monitoring." + System.lineSeparator();

        String failureMessage = "The output does not match the expected monitoring sequence.\n" +
                "Please ensure that your program correctly processes temperatures and stops when a critical temperature is reached.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
