import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class MergeBottomUp {

    /*
        checks the function with 2 null arrays.
     */
    @Test
    public void nullsArraysMerge() {
        int[] arr1 = null;
        int[] arr2 = null;
        int[] res = Program.merge(arr1,arr2);
        assertTrue(Arrays.equals(res,null));
    }
    /*
        checks the function with different length arrays
     */
    @Test
    public void diffLenArraysMerge() {
        int[] arr1 = new int[0];
        int[] arr2 = {3,1,2,4};
        int[] expected = {1,2,3,4};
        int[] res = Program.merge(arr1,arr2);
        assertTrue(Arrays.equals(res,expected));
    }
    /*
        checks the function with 2 arrays with same length
     */
    @Test
    public void diffElemenetsArraysMerge() {
        int[] arr1 = {3,4};
        int[] arr2 = {1,2};
        int[] expected = {1,2,3,4};
        int[] res = Program.merge(arr1,arr2);
        assertTrue(Arrays.equals(res,expected));

    }
    /*
       checks the function with null array and full array
    */
    @Test
    public void nullAndFullArraysMerge() {
        int[] arr1 = null;
        int[] arr2 = {3,1,2,4};
        int[] expected = {1,2,3,4};
        int[] res = Program.merge(arr1,arr2);
        assertTrue(Arrays.equals(res,expected));

    }
    /*
        checks the function with 2 empty array
     */
    @Test
    public void emptyArraysMerge() {
        int[] arr1 = new int[0];
        int[] arr2 = new int[0];
        int[] expected = {};
        int[] res = Program.merge(arr1,arr2);
        assertTrue(Arrays.equals(res,expected));
    }
}
