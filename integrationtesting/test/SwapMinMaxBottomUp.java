import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;

public class SwapMinMaxBottomUp {
    /*
        checks if the function returns the max element
     */

    @Test
    public void fullArr() {
        int[] arr = {1,2,3,4};
        int[] expected = {4,2,3,1};
        int[] swaped = Program.swapMinMax(arr);
        assertTrue(Arrays.equals(expected,swaped));
    }
    /*
        checks how the function handles an empty array
     */
    @Test
    public void emptyArr() {
        int[] arr = {};
        int[] expected = {};
        int[] swaped = Program.swapMinMax(arr);
        assertTrue(Arrays.equals(expected,swaped));

    }
    /*
        checks how the function handles null
     */
    @Test
    public void nullArr() {
        int[] arr = null;
        int[] swaped = Program.swapMinMax(arr);
        assertTrue(Arrays.equals(null,swaped));
    }
}
