package week9.d5.e2test;


import org.example.week9.d5.e2.E2AbstractClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E2AbstractClassTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        // Redirect System.out to capture the console output
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Restore System.out after the test
        System.setOut(originalOut);
    }

    @Test
    public void testAbstractAndOverloadedMethods() {
        // Execute the main method from E164AbstractClass class to generate output
        E2AbstractClass.main(new String[]{});

        // Construct the expected output string
        String expectedOutput =
                "The name of the shape is: Rectangle" + System.lineSeparator() +
                "Area of Rectangle is 24.00" + System.lineSeparator() +
                "Perimeter of Rectangle is 20.00"+ System.lineSeparator() +
                        "The name of the shape is: Circle"+ System.lineSeparator() +
                        "Area of Circle is 78.54"+ System.lineSeparator() +
                        "Perimeter of Circle is 31.42"
                ;

        // Assert that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output.", expectedOutput, outContent.toString().trim());
    }
}
