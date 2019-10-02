package main.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[] {}, 0)));
        System.out.println(Arrays.toString(new TwoSum().twoSumBruteForce(new int[] {}, 0)));
    }
    /**
     * A hashmap is used to find the complement of the target minus the current element being traversed in the array.
     * 
     * @param nums   base array
     * @param target sum of two numbers
     * @return if target is not found, an empty array <br>
     *         otherwise, an array containing a pair of indices whose value in array results to the target parameter
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>(nums.length, 1);

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numsMap.containsKey(complement) && numsMap.get(complement) != i) {
                return new int[] { numsMap.get(complement), i };
            } else {
                numsMap.put(nums[i], i);
            }
        }

        throw new IllegalArgumentException("No two numbers result the target.");
    }

    /**
     * Brute force implementation: use nested loops to find the first pair that sums to the target number
     * 
     * @param nums   base array
     * @param target sum of two numbers
     * @return if target is not found, an empty array <br>
     *         otherwise, an array containing a pair of indices whose value in array results to the target parameter
     */
    public int[] twoSumBruteForce(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        throw new IllegalArgumentException("No two numbers result the target.");
    }
}
