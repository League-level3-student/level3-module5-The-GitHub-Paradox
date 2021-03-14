package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        assertEquals(20, RecursionMath.recursiveMultiplication(4, 5));
        assertEquals(30, RecursionMath.recursiveMultiplication(5, 6));
        assertEquals(42, RecursionMath.recursiveMultiplication(6, 7));
        
    }

    @Test
    public void testDivision() {
        assertEquals(1, RecursionMath.recursiveDivision(3, 3));
        assertEquals(2, RecursionMath.recursiveDivision(4, 2));
        assertEquals(5, RecursionMath.recursiveDivision(5, 1));
        assertEquals(10, RecursionMath.recursiveDivision(20, 2));
        assertEquals(20, RecursionMath.recursiveDivision(60, 3));
    }

    @Test 
    public void testPower() {
    	assertEquals(1, RecursionMath.recursivePower(1, 1));
    	assertEquals(4, RecursionMath.recursivePower(2, 2));
    	assertEquals(9, RecursionMath.recursivePower(3, 3));
    	assertEquals(16, RecursionMath.recursivePower(4, 4));
    	assertEquals(25, RecursionMath.recursivePower(5, 5));
    }
}
