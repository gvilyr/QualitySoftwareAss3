import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class IsSortedBottomUp {

    /*
    checks the function with 2 null arrays.
 */
    @Test
    public void fullUnsortedArray() {
        int[] arr1 = {3,1,2,4};
        boolean sorted = Program.isSorted(arr1);
        assertFalse(sorted);
    }
    /*
        checks the function with different length arrays
     */
    @Test
    public void fullSortedDescArray() {
        int[] arr1 = {4,3,2,1};
        boolean sorted = Program.isSorted(arr1);
        assertFalse(sorted);
    }
    /*
        checks the function with 2 arrays with same length
     */
    @Test
    public void fullSortedASCArray() {
        int[] arr1 = {1,2,3,4};
        boolean sorted = Program.isSorted(arr1);
        assertTrue(sorted);

    }
    /*
       checks the function with null array and full array
    */
    @Test
    public void nullArray() {
        int[] arr1 = null;
        boolean sorted = Program.isSorted(arr1);
        assertFalse(sorted);

    }
    /*
        checks the function with 2 empty array
     */
    @Test
    public void emptyArray() {
        int[] arr1 = new int[0];
        boolean sorted = Program.isSorted(arr1);
        assertTrue(sorted);
    }
}
