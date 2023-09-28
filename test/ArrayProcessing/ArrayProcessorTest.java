package ArrayProcessing;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayProcessorTest {

    @Test
    public void getMinElementIndex_NullTest_NegativeIndex()
    {
        assertEquals(-1,ArrayProcessor.getMinElementIndex(null));
    }

    @Test
    public void getMinElementIndex_EmptyArray_NegativeIndex()
    {
        assertEquals(-1,ArrayProcessor.getMinElementIndex(new int[]{}));
    }

    @Test
    public void getMinElementIndex_SingleElement_ZeroIndex()
    {
        assertEquals(0,ArrayProcessor.getMinElementIndex(new int[] {2}));

    }

    @Test
    public void getMinElementIndex_MultipleElementsArray_SecondIndex()
    {
        assertEquals(2,ArrayProcessor.getMinElementIndex(new int[] {2,5,-3,2}));
    }

    @Test
    public void getSum_NullTest_ZeroSum()
    {
        assertEquals(0,ArrayProcessor.getSum(null));
    }

    @Test
    public void getSum_EmptyArray_ZeroSum()
    {
        assertEquals(0,ArrayProcessor.getSum(new int[]{}));
    }

    @Test
    public void getSum_SingleElementArray_SumIsTwo()
    {
        assertEquals(2,ArrayProcessor.getSum(new int[] {2}));
    }

    @Test
    public void getSum_MultipleElementsArray_SumIsTwo()
    {
        assertEquals(6,ArrayProcessor.getSum(new int[] {2,5,-3,2}));
    }

    @Test
    public void convertToString_NullTest_BracketsDividedBySpace()
    {
        assertEquals("[ ]",ArrayProcessor.convertToString(null));
    }
    @Test
    public void convertToString_EmptyArray_BracketsDividedBySpace()
    {
        assertEquals("[ ]",ArrayProcessor.convertToString(new int[]{}));
    }
    @Test
    public void convertToString_SingleElementArray_TheElementBetweenBrackets()
    {
        assertEquals("[ 2 ]",ArrayProcessor.convertToString(new int[] {2}));
    }
    @Test
    public void convertToString_MultipleElementsArray_ElementsDividedBySpacesInsideBrackets()
    {
        assertEquals("[ ]",ArrayProcessor.convertToString(null));
        assertEquals("[ ]",ArrayProcessor.convertToString(new int[]{}));
        assertEquals("[ 2 ]",ArrayProcessor.convertToString(new int[] {2}));
        assertEquals("[ 2 5 -3 2 ]",ArrayProcessor.convertToString(new int[] {2,5,-3,2}));
    }
}