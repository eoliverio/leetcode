package main.array;

public class MaximumProductSubarray {
    /**
     * 2 ms performance <br>
     * Most readable answer
     * This is also the common answer in LeetCode.
     * 
     * @param nums base array
     * @return maximum contiguous product from the array
     */
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxTotal = nums[0];
        int minProduct = nums[0];
        int maxProduct = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int prevMinProduct = minProduct;

            // this variable becomes meaningful when it holds a negative value.
            // it means when another negative value comes, it may update the maximum product.
            minProduct = Math.min(nums[i], Math.min(minProduct * nums[i], maxProduct * nums[i]));

            // take if the greatest running product between:
            // - the current value,
            // - the current value times the running maxProduct, or
            // - the current value times the previous minimum product (this is why we record prevMinProduct)
            maxProduct = Math.max(nums[i], Math.max(maxProduct * nums[i], prevMinProduct * nums[i]));

            // set whichever is greater to maxTotal
            maxTotal = Math.max(maxProduct, maxTotal);
        }
        return maxTotal;
    }

    /**
     * 1 ms performance <br>
     * Best performance but less readable <br>
     * This is basically a manual implementation of the version using Math library methods. <br>
     * Understandably faster since there are less function calls
     * 
     * @param nums base array
     * @return maximum contiguous product from the array
     */
    public int maxProduct2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxTotal = nums[0];
        int minProduct = nums[0];
        int maxProduct = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int prevMinProduct = minProduct;

            int newMinProduct;
            if (minProduct * nums[i] < maxProduct * nums[i]) {
                newMinProduct = minProduct * nums[i];
            } else {
                newMinProduct = maxProduct * nums[i];
            }

            if (nums[i] < newMinProduct) {
                minProduct = nums[i];
            } else {
                minProduct = newMinProduct;
            }

            int newMaxProduct;
            if (maxProduct * nums[i] > prevMinProduct * nums[i]) {
                newMaxProduct = maxProduct * nums[i];
            } else {
                newMaxProduct = prevMinProduct * nums[i];
            }

            if (nums[i] > newMaxProduct) {
                maxProduct = nums[i];
            } else {
                maxProduct = newMaxProduct;
            }

            if (maxProduct > maxTotal) {
                maxTotal = maxProduct;
            }
        }
        return maxTotal;
    }

    /**
     * 86 ms performance <br>
     * Brute force implementation: checks ALL subarrays
     * 
     * @param nums base array
     * @return maximum product from the array
     */
    public int maxProductBruteForce(int[] nums) {
        int maxTotal = nums[0], tempTotal;
        for (int i = 0; i < nums.length; i++) {
            tempTotal = 1;
            for (int j = i; j < nums.length; j++) {
                tempTotal *= nums[j];
                if (tempTotal > maxTotal) {
                    maxTotal = tempTotal;
                }
            }
        }
        return maxTotal;
    }
}
