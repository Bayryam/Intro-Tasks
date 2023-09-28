package CenterOfGravity;

import ArrayProcessing.ArrayProcessor;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayManipulatorTest {

    @Test
    public void findCenterOfGravity_NullTest_NegativeIndex()
    {
        assertEquals(-1, ArrayManipulator.findCenterOfGravity(null));
    }

    @Test
    public void findCenterOfGravity_EmptyArray_NegativeIndex()
    {
        assertEquals(-1,ArrayManipulator.findCenterOfGravity(new int[]{}));
    }

    @Test
    public void findCenterOfGravity_SingleElementArray_ZeroIndex()
    {
        assertEquals(0,ArrayManipulator.findCenterOfGravity(new int[] {2}));
    }

    @Test
    public void findCenterOfGravity_MultipleElementsArray_FirstIndex()
    {
        assertEquals(1,ArrayManipulator.findCenterOfGravity(new int[] {2,5,-3,2}));
    }
}