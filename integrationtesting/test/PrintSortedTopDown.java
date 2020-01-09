import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class PrintSortedTopDown {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;


    public void printSorted(int[] arr) {
        if (arr==null)
            System.out.println("No array");
        printArrStub(arr);
        arr = sortArrayStub(arr);
        printArrStub(sortArrayStub(arr));
        printArrStub(arr);
    }

    private int[] sortArrayStub(int[] arr) {
        if (arr == null) return null;
        int[] res = new int[arr.length];
        for(int i =0; i< arr.length; i++){
            res[i] = arr[i];
        }
        for(int i=0; i<arr.length; i++)
            for (int j=0; j<arr.length-i-1; j++)
                if (res[j]>res[j+1]) {
                    int temp = res[j];
                    res[j] = res[j+1];
                    res[j+1] = temp;
                }
        return res;

    }

    private void printArrStub(int[] arr) {
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void printSortedDriver(int[] arr){
        printSorted(arr);
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
        test to see if printSorted handle null array
     */
    @Test
    public void nullArr() {
        int[] arr = null;
        String output = "No array\r\n";
        printSortedDriver(arr);
        assertEquals(output, outContent.toString());
    }
    /*
        test to see if printSorted sorts the array
     */
    @Test
    public void unsortedArr() {
        int[] arr = {3,1,4,2};
        String output = "3 1 4 2 \r\n1 2 3 4 \r\n1 2 3 4 \r\n";
        printSortedDriver(arr);
        assertEquals(output, outContent.toString());

    }
    /*
        test to see if printSorted sorts the array
     */
    @Test
    public void emptyArr() {
        int[] arr = new int[0];
        String output = "\r\n\r\n\r\n";
        printSortedDriver(arr);
        assertEquals(output, outContent.toString());

    }
    /*
        test to see if printSorted sorts the array
     */
    @Test
    public void sortedArr() {
        int[] arr = {1,2,3,4};
        String output = "1 2 3 4 \r\n1 2 3 4 \r\n1 2 3 4 \r\n";
        printSortedDriver(arr);
        assertEquals(output, outContent.toString());

    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}
