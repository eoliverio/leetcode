package main.array;

public class MaximumSubarray {
    /**
     * Finds the subarray with maximum sum by contiguously updating the 
     * array if the summation up to that point is the highest so far. <br>
     * All while keeping record of the maximum sum achieved.
     * 
     * @param nums base array
     * @return maximum sum from the array
     */
    public int maxSubArray(int[] nums) {
        int maxTotal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int extendedTotal = nums[i - 1] + nums[i];

            // overwrite the current value if the total sum up to this point is greater than itself
            // if the current value is greater, it means the running sum up to this point
            // is no longer useful and will not be used further
            if (extendedTotal > nums[i]) {
                nums[i] = extendedTotal;
            }

            // compare the maximum total sum to the current value (not updated) or running sum
            if (nums[i] > maxTotal) {
                maxTotal = nums[i];
            }
        }
        return maxTotal;
    }

    /**
     * Brute force implementation: checks ALL subarrays for maximum sum
     * 
     * @param nums base array
     * @return maximum sum from the array
     */
    public int maxSubArrayBruteForce(int[] nums) {
        int maxTotal = nums[0], tempTotal;
        for (int i = 0; i < nums.length; i++) {
            tempTotal = 0;
            for (int j = i; j < nums.length; j++) {
                tempTotal += nums[j];
                if (tempTotal > maxTotal) {
                    maxTotal = tempTotal;
                }
            }
        }
        return maxTotal;
    }
}
