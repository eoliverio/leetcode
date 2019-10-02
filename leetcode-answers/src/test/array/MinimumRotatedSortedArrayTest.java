package test.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import main.array.MinimumRotatedSortedArray;

public class MinimumRotatedSortedArrayTest {
    private MinimumRotatedSortedArray mrsa = new MinimumRotatedSortedArray();

    @Test
    public void sortedSample() {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        assertEquals(mrsa.findMinBruteForce(nums), mrsa.findMin(nums));
    }

    @Test
    public void rotatedRightOnce() {
        int[] nums = new int[] { 9, 1, 2, 3, 4, 5, 6, 7, 8 };
        assertEquals(mrsa.findMinBruteForce(nums), mrsa.findMin(nums));
    }

    @Test
    public void rotatedLeftOnce() {
        int[] nums = new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 1 };
        assertEquals(mrsa.findMinBruteForce(nums), mrsa.findMin(nums));
    }

    @Test
    public void rotatedRightTwice() {
        int[] nums = new int[] { 8, 9, 1, 2, 3, 4, 5, 6, 7 };
        assertEquals(mrsa.findMinBruteForce(nums), mrsa.findMin(nums));
    }

    @Test
    public void rotatedLeftTwice() {
        int[] nums = new int[] { 3, 4, 5, 6, 7, 8, 9, 1, 2 };
        assertEquals(mrsa.findMinBruteForce(nums), mrsa.findMin(nums));
    }

    @Test
    public void rotatedHalfway() {
        int[] nums = new int[] { 6, 7, 8, 9, 1, 2, 3, 4, 5 };
        assertEquals(mrsa.findMinBruteForce(nums), mrsa.findMin(nums));
    }
}
