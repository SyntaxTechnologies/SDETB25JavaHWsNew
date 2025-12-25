package week10.d5.e3test;


import org.example.week10.d5.e3.E3Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E3MapTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        // Redirect System.out to capture output for testing
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Restore the original System.out after tests
        System.setOut(originalOut);
    }

    @Test
    public void testTreeMapOutput() {
        // Execute the main method from E3Map to perform map operations
        E3Map.main(new String[]{});

        // Build the expected output string based on product details added to the TreeMap
        String expectedOutput =
                "Product ID: A001, Product Name: Apple" + System.lineSeparator() +
                        "Product ID: A002, Product Name: Banana" + System.lineSeparator() +
                        "Product ID: A003, Product Name: Pear" + System.lineSeparator() +
                        "Product ID: A004, Product Name: Tomato" + System.lineSeparator() +
                        "Product ID: A005, Product Name: Mango" + System.lineSeparator();

        // Assert that the captured output matches the expected output
        assertEquals("The output does not match the expected product details.", expectedOutput, outContent.toString());
    }
}