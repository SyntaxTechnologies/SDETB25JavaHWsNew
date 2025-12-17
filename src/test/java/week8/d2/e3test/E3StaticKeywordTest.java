package week8.d2.e3test;

import org.example.week8.d2.e3.E3StaticKeyword;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E3StaticKeywordTest {

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

    @org.junit.jupiter.api.Test
    public void testMethodOutputs() {
        E3StaticKeyword.main(new String[]{});
        String expectedOutput = "Programming is amazing." + System.lineSeparator()+
        "Java is awesome."+ System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
