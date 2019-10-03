package test.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import main.array.ContainsDuplicate;

public class ContainsDuplicateTest {
    private ContainsDuplicate cd = new ContainsDuplicate();

    @Test
    public void leetcodeSample() {
        int[] nums = new int[] { 1, 2, 3, 1 };
        assertEquals(cd.containsDuplicateBruteForce(nums), cd.containsDuplicate(nums));
        
        nums = new int[] { 1, 2, 3, 4 };
        assertEquals(cd.containsDuplicateBruteForce(nums), cd.containsDuplicate(nums));
        
        nums = new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        assertEquals(cd.containsDuplicateBruteForce(nums), cd.containsDuplicate(nums));
    }
}
