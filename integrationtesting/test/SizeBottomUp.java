import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SizeBottomUp {

    public int functionsThatCallsSizeDriver(int[] arr){
        return Program.size(arr);
    }
    /*
        checks how the function handles null array
     */
    @Test
    public void nullArr() {
        int[] arr = null;
        int size = functionsThatCallsSizeDriver(arr);
        assertEquals(0, size);
    }
    /*
        checks if the function returns the length of the array when he is empty
     */
    @Test
    public void emptyArr() {
        int[] arr = new int[0];
        int size = functionsThatCallsSizeDriver(arr);
        assertEquals(0, size);
    }
    /*
        checks if the function returns the length of the array when he is full
     */
    @Test
    public void fullArr() {
        int[] arr = {10,14,3,23,6,5,8,1,64};
        int size = functionsThatCallsSizeDriver(arr);
        assertEquals( 9, size);

    }
}
