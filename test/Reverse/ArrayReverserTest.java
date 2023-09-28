package Reverse;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayReverserTest {

    @Test
    public void reverseArray_EvenLengthArray_True()
    {
        int[] arr = {1,2,3,4};
        int[] revArr = {4,3,2,1};
        int[] newArr = ArrayReverser.reverseArray(revArr);

        assertTrue(Arrays.equals(arr,newArr));
    }
    @Test
    public void reverseArray_OddLengthArray_True()
    {
        int[] arr = {1,2,3};
        int[] revArr = {3,2,1};
        int[] newArr = ArrayReverser.reverseArray(revArr);

        assertTrue(Arrays.equals(arr,newArr));
    }
    @Test
    public void reverseArray_NullTest_True()
    {
        int[] nullArr = ArrayReverser.reverseArray(null);
        assertTrue(nullArr == null);
    }
    @Test
    public void reverseArray_OneElementArray_True()
    {
        int[] oneElArr = ArrayReverser.reverseArray(new int[]{2});
        assertTrue(Arrays.equals(oneElArr,new int[]{2}));
    }
}