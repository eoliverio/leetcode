package test.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import main.array.ThreeSum;

public class ThreeSumTest {
    private ThreeSum ts = new ThreeSum();

    @Test
    public void leetcodeSample() {
        int[] nums = new int[] { -1, 0, 1, 2, -1, -4 };
        assertEquals(ts.threeSumBruteForce(nums), ts.threeSum(nums));
    }

    @Test
    public void emptyArray() {
        int[] nums = new int[] {};
        assertEquals(ts.threeSumBruteForce(nums), ts.threeSum(nums));
    }

    @Test
    public void allZeroes() {
        int[] nums = new int[] { 0, 0, 0 };
        assertEquals(ts.threeSumBruteForce(nums), ts.threeSum(nums));
    }

    @Test
    public void noResult() {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6 };
        assertEquals(ts.threeSumBruteForce(nums), ts.threeSum(nums));
    }

    @Test
    public void longerSample() {
        int[] nums = new int[] { -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals(ts.threeSumBruteForce(nums), ts.threeSum(nums));
    }
}
