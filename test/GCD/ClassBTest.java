package GCD;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClassBTest {

    @Test
    public void findLeastCommonMultiple_ZeroAndNonZeroNumber_TheNonZeroNumber()
    {
        assertEquals(0,ClassB.findLeastCommonMultiple(0,3));

    }

    @Test
    public void findLeastCommonMultiple_NonZeroNumberAndZero_TheNonZeroNumber()
    {
        assertEquals(0,ClassB.findLeastCommonMultiple(3,0));
    }

    @Test
    public void findLeastCommonMultiple_TwoZeros_Zero()
    {
        assertEquals(0,ClassB.findLeastCommonMultiple(0,0));
    }

    @Test
    public void findLeastCommonMultiple_OneOfTheNumbersIsTheGcd_TheLargerNumber()
    {
        assertEquals(9,ClassB.findLeastCommonMultiple(9,3));
    }

    @Test
    public void findLeastCommonMultiple_NumbersWithCommonDivisor_True()
    {
        assertEquals(144,ClassB.findLeastCommonMultiple(36,48));
    }

    @Test
    public void findLeastCommonMultiple_TwoPrimeNumbers_TheirMultiplicationResult()
    {
        assertEquals(7*31,ClassB.findLeastCommonMultiple(7,31));
    }
}