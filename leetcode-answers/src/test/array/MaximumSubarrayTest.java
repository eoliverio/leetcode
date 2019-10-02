package test.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import main.array.MaximumSubarray;

public class MaximumSubarrayTest {
    private MaximumSubarray ms = new MaximumSubarray();

    @Test
    public void leetcodeSample() {
        int[] nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        assertEquals(ms.maxSubArrayBruteForce(nums), ms.maxSubArray(nums));
    }

    @Test
    public void oneItemArray() {
        int[] nums = new int[] { -1 };
        assertEquals(ms.maxSubArrayBruteForce(nums), ms.maxSubArray(nums));
    }

    @Test
    public void twoItemsNegToPos() {
        int[] nums = new int[] { -2, 1 };
        assertEquals(ms.maxSubArrayBruteForce(nums), ms.maxSubArray(nums));
    }

    @Test
    public void twoItemsBothNegative() {
        int[] nums = new int[] { -2, -1 };
        assertEquals(ms.maxSubArrayBruteForce(nums), ms.maxSubArray(nums));
    }

    @Test
    public void negativesWithZero() {
        int[] nums = new int[] { -2, -1 };
        assertEquals(ms.maxSubArrayBruteForce(nums), ms.maxSubArray(nums));
    }
}
