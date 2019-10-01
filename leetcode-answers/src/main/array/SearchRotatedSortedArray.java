package main.array;

public class SearchRotatedSortedArray {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (right >= left) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] >= nums[0]) { // left side including mid is sorted
                if (target < nums[0]) { // target is lesser than left-most item (item is rotated)
                    // since left side is sorted AND
                    // target is smaller than the left-most item,
                    // it means the target must be on the right side
                    left = mid + 1;
                } else { // target is not rotated
                    if (target > nums[mid]) { // target is greater than largest item in left side
                        // since left side is sorted AND target is larger than the mid item
                        // it means target must be on the right side
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            } else { // right side including mid is sorted
                if (target < nums[0]) { // target is lesser than left-most item (item is rotated)
                    if (target > nums[mid]) {
                        // since right side is sorted AND target is larger than mid item,
                        // it means target is on the right side
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                } else { // target is not rotated
                    // since right side is sorted AND target is not rotated,
                    // it means target is on the left side
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public int searchBruteForce(int[] nums, int target) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }
}
