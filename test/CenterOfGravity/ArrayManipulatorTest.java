package CenterOfGravity;

import ArrayProcessing.ArrayProcessor;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayManipulatorTest {

    @Test
    public void testFindCenterOfGravity()
    {
        assertEquals(-1, ArrayManipulator.findCenterOfGravity(null));
        assertEquals(-1,ArrayManipulator.findCenterOfGravity(new int[]{}));
        assertEquals(0,ArrayManipulator.findCenterOfGravity(new int[] {2}));
        assertEquals(1,ArrayManipulator.findCenterOfGravity(new int[] {2,5,-3,2}));
        assertEquals(3,ArrayManipulator.findCenterOfGravity(new int[] {1,2,3,45,5}));
        assertEquals(2,ArrayManipulator.findCenterOfGravity(new int[] {4,5,99,-1,5,6}));

    }
}