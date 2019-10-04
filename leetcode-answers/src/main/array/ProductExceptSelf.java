package main.array;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        ProductExceptSelf pes = new ProductExceptSelf();
        System.out.println(Arrays.toString(pes.productExceptSelf(new int[] { 1, 2, 3, 4 })));
    }

    /**
     * <b>Problem statement:</b><br>
     * Given an array nums of n integers where n > 1, <br>
     * return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
     * <br>
     * <br>
     * This implementation uses only the result array. <br>
     * First, the forward product is built on the result array. Afterwards, the backward product is performed on the
     * same result array using a factor variable that holds the running backward product. This way, there is no need to
     * use a separate array to produce the result output.
     * 
     * @param nums base array
     * @return an array whose elements hold the product of all elements except itself
     */
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int factor = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= factor;
            factor *= nums[i];
        }

        return result;
    }

    /**
     * <b>Problem statement:</b><br>
     * Given an array nums of n integers where n > 1, <br>
     * return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
     * <br>
     * <br>
     * This implementation uses multiple arrays to hold the forward and backward arrays. Afterwards, the elements with
     * the same index number from both forward and backward arrays are multiplied to produce the final product array
     * output.
     * 
     * @param nums base array
     * @return an array whose elements hold the product of all elements except itself
     */
    public int[] productExceptSelf2(int[] nums) {
        int[] result = new int[nums.length];
        int[] forwardProduct = new int[nums.length];
        int[] backwardProduct = new int[nums.length];

        forwardProduct[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            forwardProduct[i] = forwardProduct[i - 1] * nums[i - 1];
        }

        backwardProduct[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            backwardProduct[i] = backwardProduct[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = forwardProduct[i] * backwardProduct[i];
        }

        return result;
    }
}
