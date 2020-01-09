import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MinValueBottomUp {

    public int swapMinMaxDriver(int[] arr){
        return Program.minValue(arr);
    }
    /*
        checks if the function returns the max element
     */

    @Test
    public void fullArr() {
        int[] arr = {1,2,3,4};
        int min = swapMinMaxDriver(arr);
        assertEquals(1, min);
    }
    /*
        checks how the function handles an empty array
     */
    @Test
    public void emptyArr() {
        int[] arr = {};
        int min = swapMinMaxDriver(arr);
        assertEquals(-1, min);

    }
    /*
        checks how the function handles null
     */
    @Test
    public void nullArr() {
        int[] arr = null;
        int min = swapMinMaxDriver(arr);
        assertEquals(-1, min);
    }

}
