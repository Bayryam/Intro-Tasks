package ArrayProcessing;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayProcessorTest {

    @Test
    public void testGetMinElementIndex()
    {
        assertEquals(-1,ArrayProcessor.getMinElementIndex(null));
        assertEquals(-1,ArrayProcessor.getMinElementIndex(new int[]{}));
        assertEquals(0,ArrayProcessor.getMinElementIndex(new int[] {2}));
        assertEquals(2,ArrayProcessor.getMinElementIndex(new int[] {2,5,-3,2}));
    }

    @Test
    public void testGetSum()
    {
        assertEquals(0,ArrayProcessor.getSum(null));
        assertEquals(0,ArrayProcessor.getSum(new int[]{}));
        assertEquals(2,ArrayProcessor.getSum(new int[] {2}));
        assertEquals(6,ArrayProcessor.getSum(new int[] {2,5,-3,2}));
    }

    @Test
    public void testConvertToString()
    {
        assertEquals("[ ]",ArrayProcessor.convertToString(null));
        assertEquals("[ ]",ArrayProcessor.convertToString(new int[]{}));
        assertEquals("[ 2 ]",ArrayProcessor.convertToString(new int[] {2}));
        assertEquals("[ 2 5 -3 2 ]",ArrayProcessor.convertToString(new int[] {2,5,-3,2}));
    }
}