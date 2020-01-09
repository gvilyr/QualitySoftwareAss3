import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class PrintSortedBottomUp {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }
    /*
        test to see if printSorted handle null array
     */
    @Test
    public void nullArr() {
        int[] arr = null;
        String output = "No array\r\n";
        Program.printSorted(arr);
        assertEquals(output, outContent.toString());
    }
    /*
        test to see if printSorted sorts the array
     */
    @Test
    public void unsortedArr() {
        int[] arr = {3,1,4,2};
        String output = "3 1 4 2 \r\n1 2 3 4 \r\n1 2 3 4 \r\n";
        Program.printSorted(arr);
        assertEquals(output, outContent.toString());

    }
    /*
        test to see if printSorted sorts the array
     */
    @Test
    public void emptyArr() {
        int[] arr = new int[0];
        String output = "\r\n\r\n\r\n";
        Program.printSorted(arr);
        assertEquals(output, outContent.toString());

    }
    /*
        test to see if printSorted sorts the array
     */
    @Test
    public void sortedArr() {
        int[] arr = {1,2,3,4};
        String output = "1 2 3 4 \r\n1 2 3 4 \r\n1 2 3 4 \r\n";
        Program.printSorted(arr);
        assertEquals(output, outContent.toString());

    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}
