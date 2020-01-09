import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MaxValueIndexBottomUp {

    public int MaxValueDriver(int[] arr){
        return Program.maxValueIndex(arr);
    }
    /*
        checks if the function returns the right index
     */

    @Test
    public void MaxIndex() {
        int[] arr = {1,2,3,4};
        int index = MaxValueDriver(arr);
        assertEquals(3, index);
    }
    /*
        checks how the function handles an empty array
     */
    @Test
    public void emptyArrIndex() {
        int[] arr = {};
        int index = MaxValueDriver(arr);
        assertEquals(-1, index);

    }
    /*
        checks how the function handles null
     */
    @Test
    public void nullArr() {
        int[] arr = null;
        int index = MaxValueDriver(arr);
        assertEquals(-1, index);
    }

}
