package test.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import main.array.TwoSum;

public class TwoSumTest {
    private TwoSum ts = new TwoSum();

    @Test
    public void leetcodeSample() {
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;
        assertArrayEquals(ts.twoSumBruteForce(nums, target), ts.twoSum(nums, target));
    }

    @Test
    public void test1() {
        int[] nums = new int[] { 4, 3, 2, 1 };
        int target = 6;
        assertArrayEquals(ts.twoSumBruteForce(nums, target), ts.twoSum(nums, target));
    }

    @Test
    public void test2() {
        int[] nums = new int[] { 1, 9, 2, 8, 3, 7, 4, 6, 5 };
        int target = 16;
        assertArrayEquals(ts.twoSumBruteForce(nums, target), ts.twoSum(nums, target));
    }

    @Test
    public void test3() {
        int[] nums = new int[] { 10, 10, 20, 30 };
        int target = 50;
        assertArrayEquals(ts.twoSumBruteForce(nums, target), ts.twoSum(nums, target));
    }
}
