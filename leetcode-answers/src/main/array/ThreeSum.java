package main.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new LinkedList<>();

        Arrays.sort(nums);

        // if first item of sorted array is greater than zero,
        // then it is impossible to get a sum of zero
        if (nums.length == 0 || nums[0] > 0) {
            return results;
        }

        for (int i = 0; i < nums.length - 2; i++) {

            // for the first number of the three, only process the first of duplicates
            // this is to avoid redundant lists
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // L : lower end
            // H : higher end
            int L = i + 1, H = nums.length - 1;

            // the remaining two numbers must equal to this
            int sum = 0 - nums[i];

            while (L < H) {
                if (nums[L] + nums[H] == sum) {
                    // add result
                    results.add(Arrays.asList(nums[i], nums[L], nums[H]));

                    // skip duplicates
                    while (L < H && nums[L] == nums[L + 1]) { L++; }
                    while (L < H && nums[H] == nums[H - 1]) { H--; }

                    // numbers on L and H already used, so...
                    L++;
                    H--;
                } else if (nums[L] + nums[H] > sum) {
                    // sum is too high, move lower
                    H--;
                } else { // nums[left] + nums[right] < sum
                    // sum is too low, move higher
                    L++;
                }
            }
        }

        return results;
    }

    public List<List<Integer>> threeSumBruteForce(int[] nums) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> result = new ArrayList<Integer>();
                        result.add(nums[i]);
                        result.add(nums[j]);
                        result.add(nums[k]);
                        Collections.sort(result);
                        if (!results.contains(result)) {
                            results.add(result);
                        }
                        break;
                    }
                }
            }
        }

        return results;
    }
}
