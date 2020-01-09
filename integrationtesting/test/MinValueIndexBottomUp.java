import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MinValueIndexBottomUp {

    public int swapMinMaxDriver(int[] arr){
        return Program.minValueIndex(arr);
    }
    /*
        checks if the function returns the right index
     */

    @Test
    public void minIndex() {
        int[] arr = {6,4,20,8,3,78,573};
        int index = swapMinMaxDriver(arr);
        assertEquals(4, index);
    }
    /*
        checks how the function handles an empty array
     */
    @Test
    public void emptyArrIndex() {
        int[] arr = {};
        int index = swapMinMaxDriver(arr);
        assertEquals(-1, index);

    }
    /*
        checks how the function handles null
     */
    @Test
    public void nullArr() {
        int[] arr = null;
        int index = swapMinMaxDriver(arr);
        assertEquals(-1, index);
    }

}
