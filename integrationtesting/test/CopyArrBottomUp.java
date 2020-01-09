import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class CopyArrBottomUp {

    public int[] functionsThatCallsCopyArrDriver(int[] arr){
        return Program.copyArr(arr);
    }
    /*
        checks how the function copy null array
     */
    @Test
    public void nullArr() {
        int[] arr = null;
        int[] arrCopy = functionsThatCallsCopyArrDriver(arr);
        assertEquals(true, Arrays.equals(arr,arrCopy));
    }
    /*
        checks if the function copy an empty array
     */
    @Test
    public void emptyArr() {
        int[] arr = new int[0];
        int[] arrCopy= functionsThatCallsCopyArrDriver(arr);
        assertEquals(true, Arrays.equals(arr,arrCopy));
    }
    /*
        checks if the function copy an full array
     */
    @Test
    public void fullArr() {
        int[] arr = {10,14,3,23,6,5,8,1,64};
        int[] arrCopy = functionsThatCallsCopyArrDriver(arr);
        assertEquals( true, Arrays.equals(arr,arrCopy));

    }
}
