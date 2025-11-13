package week2.d5.e3test;



import org.example.week2.d5.e3.E3ElseIf;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E3ElseIfTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final java.io.InputStream originalIn = System.in;

    @BeforeEach
    void setUpStreams() {
        // Redirect System.out to capture outputs
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        // Restore original System.out and System.in
        System.setOut(originalOut);
        System.setIn(originalIn);
    }




    @Test
    void testAddition() {
        // Run the SimpleCalculator program
        E3ElseIf.main(new String[]{});

        // Define expected output
        String expectedOutput = "The product is: 50.0" + System.lineSeparator();

        // Assert the output
        assertEquals(expectedOutput, outContent.toString(),
                "The product operation did not produce the expected output.");
    }








}
