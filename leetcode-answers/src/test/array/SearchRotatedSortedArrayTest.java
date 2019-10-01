package test.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import main.array.SearchRotatedSortedArray;

public class SearchRotatedSortedArrayTest {
    private SearchRotatedSortedArray srsa = new SearchRotatedSortedArray();

    @Test
    public void sortedSample() {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i = 1; i < nums.length + 1; i++) {
            assertEquals(srsa.searchBruteForce(nums, i), srsa.search(nums, i));
        }
    }

    @Test
    public void rotatedSampleLeftHalfSorted() {
        int[] nums = new int[] { 3, 4, 5, 6, 7, 8, 9, 1, 2 };
        for (int i = 1; i < nums.length + 1; i++) {
            assertEquals(srsa.searchBruteForce(nums, i), srsa.search(nums, i));
        }
    }

    @Test
    public void rotatedSampleRightHalfSorted() {
        int[] nums = new int[] { 8, 9, 1, 2, 3, 4, 5, 6, 7 };
        for (int i = 1; i < nums.length + 1; i++) {
            assertEquals(srsa.searchBruteForce(nums, i), srsa.search(nums, i));
        }
    }

    @Test
    public void fourItemsSorted() {
        int[] nums = new int[] { 1, 2, 3, 4 };
        for (int i = 1; i < nums.length + 1; i++) {
            assertEquals(srsa.searchBruteForce(nums, i), srsa.search(nums, i));
        }
    }

    @Test
    public void fourItemsRotated() {
        int[] nums = new int[] { 3, 4, 1, 2 };
        for (int i = 1; i < nums.length + 1; i++) {
            assertEquals(srsa.searchBruteForce(nums, i), srsa.search(nums, i));
        }
    }

    @Test
    public void twoItemsSorted() {
        int[] nums = new int[] { 1, 3 };
        assertEquals(srsa.searchBruteForce(nums, 1), srsa.search(nums, 1));
        assertEquals(srsa.searchBruteForce(nums, 3), srsa.search(nums, 3));
    }

    @Test
    public void twoItemsRotated() {
        int[] nums = new int[] { 3, 1 };
        assertEquals(srsa.searchBruteForce(nums, 3), srsa.search(nums, 3));
        assertEquals(srsa.searchBruteForce(nums, 1), srsa.search(nums, 1));
    }
}
