import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class EqualArraysBottomUp {

    public boolean isSortedDriver(int[] arr1, int[] arr2){
        return Program.equalArrays(arr1,arr2);
    }
    /*
        checks the function with 2 null arrays.
        we assume that 2 null arrays are equal
     */
    @Test
    public void nullsArrays() {
        int[] arr1 = null;
        int[] arr2 = null;
        boolean isEqual = isSortedDriver(arr1,arr2);
        assertEquals(true, isEqual);
    }
    /*
        checks the function with different length arrays
     */
    @Test
    public void diffLenArr() {
        int[] arr1 = new int[0];
        int[] arr2 = {1,2,3,4};
        boolean isEqual= isSortedDriver(arr1,arr2);
        assertEquals(false, isEqual);
    }
    /*
        checks the function with 2 arrays that the 2 last elements are different
     */
    @Test
    public void diffElemenetsArr() {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,5,6};
        boolean isEqual = isSortedDriver(arr1,arr2);
        assertEquals( false, isEqual);

    }
    /*
       checks the function with 2 equal arrays
    */
    @Test
    public void equalArr() {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4};
        boolean isEqual = isSortedDriver(arr1,arr2);
        assertEquals( true, isEqual);

    }
    /*
        checks the function with a null array and array with elements
     */
    @Test
    public void nullAndFullArr() {
        int[] arr1 = null;
        int[] arr2 = {1,2,3,4};
        boolean isEqual = isSortedDriver(arr1,arr2);
        assertEquals(false, isEqual);
    }
}
