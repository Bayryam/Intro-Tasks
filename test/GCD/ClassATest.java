package GCD;

import junit.framework.TestCase;
import org.junit.Test;

public class ClassATest extends TestCase {
@Test
    public void testFindGCD()
    {
        assertEquals(3,ClassA.findGCD(0,3));
        assertEquals(3,ClassA.findGCD(3,0));
        assertEquals(0,ClassA.findGCD(0,0));
        assertEquals(3,ClassA.findGCD(9,3));
        assertEquals(3,ClassA.findGCD(3,9));
        assertEquals(12,ClassA.findGCD(36,48));
        assertEquals(1,ClassA.findGCD(7,31));
    }
}