package test.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.array.ContainerWithMostWater;

public class ContainerWithMostWaterTest {
    private ContainerWithMostWater cwmw = new ContainerWithMostWater();

    @Test
    void leetcodeSample() {
        int[] heights = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        assertEquals(cwmw.maxAreaBruteForce(heights), cwmw.maxArea(heights));
    }

    @Test
    void centerHigher() {
        int[] heights = new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        assertEquals(cwmw.maxAreaBruteForce(heights), cwmw.maxArea(heights));
    }

    @Test
    void centerLower() {
        int[] heights = new int[] { 5, 4, 3, 2, 1, 2, 3, 4, 5 };
        assertEquals(cwmw.maxAreaBruteForce(heights), cwmw.maxArea(heights));
    }

    @Test
    void upwardStairs() {
        int[] heights = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        assertEquals(cwmw.maxAreaBruteForce(heights), cwmw.maxArea(heights));
    }

    @Test
    void downwardStairs() {
        int[] heights = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        assertEquals(cwmw.maxAreaBruteForce(heights), cwmw.maxArea(heights));
    }

    @Test
    void randomSpikeRightSide() {
        int[] heights = new int[] { 10, 8, 22, 3, 99, 99, 2 };
        assertEquals(cwmw.maxAreaBruteForce(heights), cwmw.maxArea(heights));
    }

    @Test
    void randomSpikeLeftSide() {
        int[] heights = new int[] { 2, 99, 99, 3, 22, 8, 10 };
        assertEquals(cwmw.maxAreaBruteForce(heights), cwmw.maxArea(heights));
    }

    @Test
    void wavyPail() {
        int[] heights = new int[] { 100, 22, 30, 23, 33, 20, 100 };
        assertEquals(cwmw.maxAreaBruteForce(heights), cwmw.maxArea(heights));
    }
}
