import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class IsSortedTopDown {

    public boolean isSorted(int[] arr) {
        int[] sorted = sortArrayStub(arr);
        return equalArraysStub(arr, sorted);
    }

    private boolean equalArraysStub(int[] arr1, int[] arr2) {
        if (arr1==null && arr2 == null) return false;
        if (arr1==null || arr2 == null) return false;
        if (arr1.length !=arr2.length) return false;
        for (int i=0; i<arr1.length; i++)
            if (arr1[i]!=arr2[i]) return false;
        return true;
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
    public boolean isSortedDriver(int[] arr){
        return isSorted(arr);
    }
    /*
    checks the function with 2 null arrays.
 */
    @Test
    public void fullUnsortedArray() {
        int[] arr1 = {3,1,2,4};
        boolean sorted = isSortedDriver(arr1);
        assertFalse(sorted);
    }
    /*
        checks the function with different length arrays
     */
    @Test
    public void fullSortedDescArray() {
        int[] arr1 = {4,3,2,1};
        boolean sorted = isSortedDriver(arr1);
        assertFalse(sorted);
    }
    /*
        checks the function with 2 arrays with same length
     */
    @Test
    public void fullSortedASCArray() {
        int[] arr1 = {1,2,3,4};
        boolean sorted = isSortedDriver(arr1);
        assertTrue(sorted);

    }
    /*
       checks the function with null array.
       we assume that null array is not a sorted array
    */
    @Test
    public void nullArray() {
        int[] arr1 = null;
        boolean sorted = isSortedDriver(arr1);
        assertFalse(sorted);

    }
    /*
        checks the function with 2 empty array
     */
    @Test
    public void emptyArray() {
        int[] arr1 = new int[0];
        boolean sorted = isSortedDriver(arr1);
        assertTrue(sorted);
    }
}
