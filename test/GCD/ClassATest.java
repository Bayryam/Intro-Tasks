package GCD;

import junit.framework.TestCase;
import org.junit.Test;

public class ClassATest extends TestCase {
    @Test
    public void findGCD_ZeroAndNonZeroNumber_TheNonZeroNumber()
    {
        assertEquals(3,ClassA.findGCD(0,3));

    }

    @Test
    public void findGCD_NonZeroNumberAndZero_TheNonZeroNumber()
    {
        assertEquals(3,ClassA.findGCD(3,0));
    }

    @Test
    public void findGCD_TwoZeros_Zero()
    {
        assertEquals(0,ClassA.findGCD(0,0));
    }

    @Test
    public void findGCD_OneOfTheNumbersIsTheGcd_TheLargerNumber()
    {
        assertEquals(3,ClassA.findGCD(3,9));
    }

    @Test
    public void findGCD_NumbersWithCommonDivisor_True()
    {
        assertEquals(12,ClassA.findGCD(36,48));
    }

    @Test
    public void findGCD_TwoPrimeNumbers_One()
    {
        assertEquals(1,ClassA.findGCD(7,31));
    }
}