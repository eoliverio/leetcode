package main.array;

public class MinimumRotatedSortedArray {

    /**
     * This method basically traverses the array by halves until it finds two contiguous values where the previous value
     * is greater than the latter.
     * 
     * @param nums base array
     * @return the minimum value in the array
     */
    public int findMin(int[] nums) {
        int length = nums.length;

        // if array has no elements
        if (nums == null || length == 0) {
            return 0;
        }

        // if array only has 1 element or if it is already sorted
        if (length == 1 || nums[0] < nums[length - 1]) {
            return nums[0];
        }

        int left = 0, right = length - 1;

        // right to left and left to right
        while (right >= left) {
            int mid = (left + right) / 2;

            // check the surrounding values of mid:
            // if the preceding value is greater than the succeeding value,
            //     it means the succeeding value is the minimum value.
            if (nums[mid] > nums[mid + 1]) { return nums[mid + 1]; }
            if (nums[mid - 1] > nums[mid]) { return nums[mid]; }

            // if mid is greater than left, it implies left side is sorted so minimum
            // and since it is expected to be rotated, it means the minimum value is on the right side
            // like so: [ 3, 4, 5, 1, 2 ] 
            // 5 (mid) is greater 3 (left) than so minimum value 1 is expected to be on the right side
            if (nums[mid] > nums[left]) {
                left = mid;
            }
            // conversely: e.g. [ 5, 1, 2, 3, 4 ]
            // 2 (mid) is less than 5 (left) so minimum must be on the left side
            else {
                right = mid;
            }
        }

        return -1;
    }

    /**
     * Brute force implementation: <br>
     * loop through the array until a value which is lesser than the previous value is found
     * 
     * @param nums base array
     * @return the minimum value in the array
     */
    public int findMinBruteForce(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                min = nums[i];
                break;
            }
        }
        return min;
    }
}
