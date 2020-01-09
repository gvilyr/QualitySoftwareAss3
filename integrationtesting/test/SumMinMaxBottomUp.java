import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class SumMinMaxBottomUp {

    /*
        checks if the function returns the max element
     */

    @Test
    public void fullArr() {
        int[] arr = {1,2,3,4};
        int[] expected = {4,2,3,1};
        int sum = Program.sumMinMax(arr);
        assertEquals(sum,5);
    }
    /*
        checks how the function handles an empty array
     */
    @Test
    public void emptyArr() {
        int[] arr = {};
        int sum = Program.sumMinMax(arr);
        assertEquals(sum,0);

    }
    /*
        checks how the function handles null
     */
    @Test
    public void nullArr() {
        int[] arr = null;
        int sum = Program.sumMinMax(arr);
        assertEquals(sum,0);
    }
}
