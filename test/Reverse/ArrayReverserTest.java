package Reverse;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayReverserTest {

    @Test
    public void testReverseArray()
    {
        int[] oddLenArr = {1,2,3};
        int[] oddRevArr = {3,2,1};
        int[] newOddArr = ArrayReverser.reverseArray(oddRevArr);

        int[] evenLenArr = {1,2,3,4};
        int[] evenRevArr = {4,3,2,1};
        int[] newEvenArr = ArrayReverser.reverseArray(evenRevArr);

        int[] nullArr = ArrayReverser.reverseArray(null);
        int[] oneElArr = ArrayReverser.reverseArray(new int[]{2});

        assertTrue(Arrays.equals(oddLenArr,newOddArr));
        assertTrue(Arrays.equals(evenLenArr,newEvenArr));
        assertTrue(nullArr == null);
        assertTrue(Arrays.equals(oneElArr,new int[]{2}));


    }
}