import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class SwapMinMaxTopDown {

    public int[] swapMinMax(int[] arr) {
        int[] res = copyArrStub(arr);
        int minInd = minValueIndexStub(arr);
        int maxInd = maxValueStub(arr);
        if (minInd <0 || maxInd <0) return null;
        res[minInd] = arr[maxInd];
        res[maxInd] = arr[minInd];
        return res;
    }

    private int maxValueStub(int[] arr){
        int max = 0;
        if(arr.length > 0){
            max = arr[0];
        }
        for(int i=0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    private int minValueIndexStub(int[] arr) {
        int min = 0;
        int index = -1;
        if(arr.length > 0){
            min = arr[0];
            index = 0;
        }
        for(int i=0; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                index=i;
            }
        }
        return index;
    }

    private int[] copyArrStub(int[] arr) {
        if(arr != null){
            int[] copy = new int[arr.length];
            for(int i =0; i< arr.length; i++){
                copy[i] = arr[i];
            }
            return copy;
        }
        return null;
    }

    public int[] swapMinMaxDriver(int[] arr){
        return swapMinMax(arr);
    }

     /*
        checks if the function returns the max element
     */

    @Test
    public void fullArr() {
        int[] arr = {1,2,3,4};
        int[] expected = {4,2,3,1};
        int[] swap = swapMinMaxDriver(arr);
        assertTrue(Arrays.equals(expected, swap));
    }
    /*
        checks how the function handles an empty array
     */
    @Test
    public void emptyArr() {
        int[] arr = {};
        int[] expected = {};
        int[] swap = swapMinMaxDriver(arr);
        assertTrue(Arrays.equals(expected, swap));

    }
    /*
        checks how the function handles null
     */
    @Test
    public void nullArr() {
        int[] arr = null;
        int[] swap = swapMinMaxDriver(arr);
        assertTrue(Arrays.equals(null, swap));
    }

}
