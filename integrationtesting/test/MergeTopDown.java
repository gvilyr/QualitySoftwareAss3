import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;

public class MergeTopDown {

    public int[] merge(int[] ar1, int[] ar2) {
        if (ar1==null && ar2==null) return null;
        if (ar1==null) return sortArrayStub(ar2);
        if (ar2==null) return sortArrayStub(ar1);
        int[] res = new int[ar1.length+ar2.length];
        int i = 0;
        for(int j=0; j<ar1.length; j++)
            res[i++] = ar1[j];
        for(int j=0; j<ar2.length; j++)
            res[i++] = ar2[j];
        return sortArrayStub(res);
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
    public int[] mergeDriver(int[] arr1,int[] arr2){
        return merge(arr1,arr2);
    }

    /*
        checks the function with 2 null arrays.
     */
    @Test
    public void nullsArraysMerge() {
        int[] arr1 = null;
        int[] arr2 = null;
        int[] res = mergeDriver(arr1,arr2);
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
        int[] res = mergeDriver(arr1,arr2);
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
        int[] res = mergeDriver(arr1,arr2);
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
        int[] res = mergeDriver(arr1,arr2);
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
        int[] res = mergeDriver(arr1,arr2);
        assertTrue(Arrays.equals(res,expected));
    }
}
