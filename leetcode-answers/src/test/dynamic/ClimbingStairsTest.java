package test.dynamic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.dynamic.ClimbingStairs;

public class ClimbingStairsTest {
    private ClimbingStairs cs = new ClimbingStairs();
    
    @Test
    public void leetcodeSample() {
        assertEquals(cs.climbStairsMemoization(2), cs.climbStairsDynamic(2));
        assertEquals(cs.climbStairsMemoization(3), cs.climbStairsDynamic(3));
    }
    
    @Test
    public void caseZero() {
        assertEquals(cs.climbStairsMemoization(0), cs.climbStairsDynamic(0));
    }
    
    @Test
    public void caseOne() {
        assertEquals(cs.climbStairsMemoization(1), cs.climbStairsDynamic(1));
    }
    
    @Test
    public void case44() {
        assertEquals(cs.climbStairsMemoization(44), cs.climbStairsDynamic(44));
    }
    
    @Test
    public void hugeNumber() {
        assertEquals(cs.climbStairsMemoization(999), cs.climbStairsDynamic(999));
    }
}
