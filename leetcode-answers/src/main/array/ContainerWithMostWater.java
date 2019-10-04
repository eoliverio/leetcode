package main.array;

public class ContainerWithMostWater {
    /**
     * This solution is based upon the following facts:<br>
     * <ol>
     * <li>The closer the heights, the lesser the area.<br>
     * So, we iterate inwardly i.e. using left and right pointers.
     * <li>The area becomes limited by the lesser height.<br>
     * So, in iterating inwardly, the pointer with the lesser height moves towards the greater height.<br>
     * </ol>
     * 
     * @param height array containing container heights
     * @return maximum area possible based on all heights
     */
    public int maxArea(int[] height) {
        int maxArea = 0, L = 0, R = height.length - 1;

        while (L < R) {
            maxArea = Math.max(maxArea, (R - L) * Math.min(height[L], height[R]));

            if (height[L] < height[R]) {
                L++;
            } else {
                R--;
            }
        }

        return maxArea;
    }

    /**
     * This solution uses the same logic as the maxArea(int[] height) method<br>
     * but without using the Math library.
     * 
     * @param height array containing container heights
     * @return maximum area possible based on all heights
     */
    public int maxArea2(int[] height) {
        int maxArea = 0, L = 0, R = height.length - 1;

        while (L < R) {
            // get lesser height
            int lesserHeight = height[L];
            if (height[R] < lesserHeight) {
                lesserHeight = height[R];
            }

            // check and update max area
            int newArea = (R - L) * lesserHeight;
            if (newArea > maxArea) {
                maxArea = newArea;
            }

            // move pointers
            if (height[L] < height[R]) {
                L++;
            } else {
                R--;
            }
        }

        return maxArea;
    }

    /**
     * Brute force implementation: Checks all combinations of heights for maximum area.
     * 
     * @param height array containing container heights
     * @return maximum area possible based on all heights
     */
    public int maxAreaBruteForce(int[] height) {
        int maxarea = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int min = height[i];
                if (height[j] < min) {
                    min = height[j];
                }
                int newarea = min * (j - i);
                if (newarea > maxarea) {
                    maxarea = newarea;
                }
            }
        }

        return maxarea;
    }
}
