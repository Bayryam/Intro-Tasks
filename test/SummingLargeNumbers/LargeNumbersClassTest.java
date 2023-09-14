package SummingLargeNumbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargeNumbersClassTest {

    @Test
    public void testSumNumbers()
    {
        assertEquals("1246", LargeNumbersClass.sumNumbers("1234","12"));
        assertEquals("1246", LargeNumbersClass.sumNumbers("12","1234"));
        assertEquals("1000", LargeNumbersClass.sumNumbers("999","1"));
        assertEquals(null, LargeNumbersClass.sumNumbers(null,"12"));
        assertEquals("357357357", LargeNumbersClass.sumNumbers("123123123","234234234"));
    }
}