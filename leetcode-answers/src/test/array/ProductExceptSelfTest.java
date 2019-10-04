package test.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.array.ProductExceptSelf;

public class ProductExceptSelfTest {
    private ProductExceptSelf pes = new ProductExceptSelf();

    @Test
    void leetcodeSample() {
        int[] nums = new int[] { 1, 2, 3, 4 };
        assertArrayEquals(pes.productExceptSelf2(nums), pes.productExceptSelf(nums));
    }

    @Test
    void allOnes() {
        int[] nums = new int[] { 1, 1, 1, 1 };
        assertArrayEquals(pes.productExceptSelf2(nums), pes.productExceptSelf(nums));
    }

    @Test
    void allZeroes() {
        int[] nums = new int[] { 0, 0, 0, 0 };
        assertArrayEquals(pes.productExceptSelf2(nums), pes.productExceptSelf(nums));
    }

    @Test
    void withNegatives() {
        int[] nums = new int[] { -2, 1, -1, 2 };
        assertArrayEquals(pes.productExceptSelf2(nums), pes.productExceptSelf(nums));
    }

    @Test
    void containsZero() {
        int[] nums = new int[] { 2, 1, 0, 4, 3 };
        assertArrayEquals(pes.productExceptSelf2(nums), pes.productExceptSelf(nums));
    }

    @Test
    void containsNegativesAndZero() {
        int[] nums = new int[] { -2, 1, 0, -1, 2 };
        assertArrayEquals(pes.productExceptSelf2(nums), pes.productExceptSelf(nums));
    }
}
