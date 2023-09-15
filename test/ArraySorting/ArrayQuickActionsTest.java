package ArraySorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayQuickActionsTest {

    @Test
    public void testQuickSort()
    {
        int[] ar = {3,2,54,1};
        ArrayQuickActions.quickSort(ar,0,3);
        assertTrue(Arrays.compare(ar,new int[]{1,2,3,54}) == 0);
    }
}