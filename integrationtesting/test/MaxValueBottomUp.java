import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MaxValueBottomUp {

    public int swapMinMaxDriver(int[] arr){
        return Program.maxValue(arr);
    }
    /*
        checks if the function returns the max element
     */

    @Test
    public void fullArr() {
        int[] arr = {1,2,3,4};
        int max = swapMinMaxDriver(arr);
        assertEquals(4, max);
    }
    /*
        checks how the function handles an empty array
     */
    @Test
    public void emptyArr() {
        int[] arr = {};
        int max = swapMinMaxDriver(arr);
        assertEquals(-1, max);

    }
    /*
        checks how the function handles null
     */
    @Test
    public void nullArr() {
        int[] arr = null;
        int max = swapMinMaxDriver(arr);
        assertEquals(-1, max);
    }


}
