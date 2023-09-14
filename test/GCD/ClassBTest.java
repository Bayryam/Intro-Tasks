package GCD;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClassBTest {

    @Test
    public void testFindLeastCommonMultiple()
    {
        assertEquals(0,ClassB.findLeastCommonMultiple(0,3));
        assertEquals(0,ClassB.findLeastCommonMultiple(3,0));
        assertEquals(0,ClassB.findLeastCommonMultiple(0,0));
        assertEquals(9,ClassB.findLeastCommonMultiple(9,3));
        assertEquals(144,ClassB.findLeastCommonMultiple(36,48));
        assertEquals(7*31,ClassB.findLeastCommonMultiple(7,31));
        assertEquals(274288014,ClassB.findLeastCommonMultiple(234234,2342));
    }
}