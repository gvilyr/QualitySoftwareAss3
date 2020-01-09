import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SumMinMaxTopDown {

    public int sumMinMax(int[] arr) {
        return minValueStub(arr) + maxValueStub(arr);
    }

    public int sumMinMaxDriver(int[] arr){
        return sumMinMax(arr);
    }
    private int minValueStub(int[] arr){
        int min = 0;
        if(arr.length > 0){
            min = arr[0];
        }
        for(int i=0; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
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


    /*
        checks if the function returns the max element
     */

    @Test
    public void fullArr() {
        int[] arr = {1,2,3,4};
        int[] expected = {4,2,3,1};
        int sum = sumMinMaxDriver(arr);
        assertEquals(5,sum);
    }
    /*
        checks how the function handles an empty array
     */
    @Test
    public void emptyArr() {
        int[] arr = {};
        int sum = sumMinMaxDriver(arr);
        assertEquals(0,sum);

    }
    /*
        checks how the function handles null
     */
    @Test
    public void nullArr() {
        int[] arr = null;
        int sum = sumMinMaxDriver(arr);
        assertEquals(0,sum);
    }
    /*
        checks if the function returns the max element
     */

    @Test
    public void sameElementsArr() {
        int[] arr = {1,1,1,1};
        int sum = sumMinMaxDriver(arr);
        assertEquals(2,sum);
    }

}
