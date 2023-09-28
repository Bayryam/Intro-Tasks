package SummingLargeNumbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargeNumbersClassTest {

    @Test
    public void sumNumbers_FirstNumberWithMoreDigits_True()
    {
        assertEquals("1246", LargeNumbersClass.sumNumbers("1234","12"));
    }

    @Test
    public void sumNumbers_SecondNumberWithMoreDigits_True()
    {
        assertEquals("1246", LargeNumbersClass.sumNumbers("12","1234"));
    }

    @Test
    public void sumNumbers_sumOfTheNumbersIsWithMoreDigitsThanTheInput_True()
    {
        assertEquals("1000", LargeNumbersClass.sumNumbers("999", "1"));
    }

    @Test
    public void sumNumbers_NullTest_True()
    {
        assertEquals(null, LargeNumbersClass.sumNumbers(null,"12"));
    }

    @Test
    public void sumNumbers_LargeNumbers_True()
    {
        assertEquals("357357357", LargeNumbersClass.sumNumbers("123123123","234234234"));
    }
}