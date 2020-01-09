import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class PrintArrBottomUp {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    public void printSortedDriver(int[] arr){
        Program.printArr(arr);
    }
    /*
        sets the variables that listen to the screen for prints
     */
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }
    /*
        test to see if printArr prints the arr as expected
     */
    @Test
    public void fullArr() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        String output = "1 2 3 4 5 6 7 8 9 10 \r\n";
        printSortedDriver(arr);
        assertEquals(output, outContent.toString());

    }
    /*
        test to see if printArr prints the empty arr as expected
     */
    @Test
    public void emptyArr() {
        int[] arr = {};
        String output = "\r\n";
        printSortedDriver(arr);
        assertEquals(output, outContent.toString());

    }
    @Test
    public void nullException() {
        int[] arr = null;
        printSortedDriver(arr);


    }
    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}
