package main.array;

import java.util.HashSet;

public class ContainsDuplicate {

    /**
     * HashSet add function return false if set already contains the item to be added.
     * 
     * @param nums base array
     * @return true if array contains duplicate; false otherwise
     */
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adds all items in array into a set. <br>
     * If sizes of input array and set are not equal, it means duplicate exists.
     * 
     * @param nums base array
     * @return true if array contains duplicate; false otherwise
     */
    public boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return set.size() != nums.length;
    }

    /**
     * Brute force implementation: check ALL pairs
     * 
     * @param nums base array
     * @return true if array contains duplicate; false otherwise
     */
    public boolean containsDuplicateBruteForce(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
