package test.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import main.array.MaximumProductSubarray;

public class MaximumProductSubarrayTest {
    private MaximumProductSubarray mps = new MaximumProductSubarray();

    @Test
    public void leetcodeSample() {
        int[] nums = new int[] { 2, 3, -2, 4, -1 };
        assertEquals(mps.maxProductBruteForce(nums), mps.maxProduct(nums));
    }

    @Test
    public void negativesWithZero() {
        int[] nums = new int[] { -2, 0, -1 };
        assertEquals(mps.maxProductBruteForce(nums), mps.maxProduct(nums));
    }

    @Test
    public void oneItemArray() {
        int[] nums = new int[] { 2 };
        assertEquals(mps.maxProductBruteForce(nums), mps.maxProduct(nums));
    }

    @Test
    public void twoNegatives() {
        int[] nums = new int[] { -2, -3 };
        assertEquals(mps.maxProductBruteForce(nums), mps.maxProduct(nums));
    }

    @Test
    public void threeNegatives() {
        int[] nums = new int[] { -3, -2, -1 };
        assertEquals(mps.maxProductBruteForce(nums), mps.maxProduct(nums));
    }

    @Test
    public void fourNegatives() {
        int[] nums = new int[] { -2, -3, -1, -2 };
        assertEquals(mps.maxProductBruteForce(nums), mps.maxProduct(nums));
    }

    @Test
    public void allPositive() {
        int[] nums = new int[] { 2, 3, 4, 1 };
        assertEquals(mps.maxProductBruteForce(nums), mps.maxProduct(nums));
    }

    @Test
    public void negateLastItem() {
        int[] nums = new int[] { 2, 3, 4, -1 };
        assertEquals(mps.maxProductBruteForce(nums), mps.maxProduct(nums));
    }
}
