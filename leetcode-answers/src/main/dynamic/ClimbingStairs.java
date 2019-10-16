package main.dynamic;

public class ClimbingStairs {
    /**
     * The intuition behind this approach is that being only able to use 1 or 2 steps indicates we can use the concept
     * of binary trees. So...<br>
     * <ul>
     * <li>the root node of the tree would be the top of the stairs i.e. number of steps on the stairs</li>
     * <li>the branches would be 1 and 2 steps from the base i.e. minus 1 and minus 2 of the node's value</li>
     * </ul>
     * 
     * However, utilizing the whole binary tree is repetitive.<br>
     * For example, f(6) and f(5) both contains f(4).
     * <ul>
     * <li>f(4) is the "minus 2" branch of f(6)</li>
     * <li>f(4) is the "minus 1" branch of f(5)</li>
     * </ul>
     * 
     * To avoid redundant operations, the result of each node starting from the bottom will be stored in an array.<br>
     * So, if a node was previously calculated i.e. already stored in the array, that node will no longer be branched.
     * 
     * @param n number of steps in the stairs
     * @return number of ways to traverse the stairs using only 1 or 2 steps
     */
    public int climbStairsMemoization(int n) {
        int memo[] = new int[n + 1];
        return climbStairs_recurse(0, n, memo);
    }

    /**
     * Recursive function for climbStairs2(n).
     * 
     * @param i    node value or the i<sup>th</sup> step of the stairs
     * @param n    root node value or the node number steps on the stairs
     * @param memo array containing the number of ways to reach each i<sup>th</sup> step (where i is the index).
     * @return the number of ways to reach the i<sup>th</sup> step
     */
    private int climbStairs_recurse(int i, int n, int memo[]) {
        // beyond the stairs
        if (i > n) {
            return 0;
        }
        
        // top of the stairs
        if (i == n) {
            return 1;
        }
        
        // reuse previously calculated value
        if (memo[i] > 0) {
            return memo[i];
        }
        
        // recurse
        memo[i] = climbStairs_recurse(i + 1, n, memo) + climbStairs_recurse(i + 2, n, memo);
        
        return memo[i];
    }

    /**
     * The intuition behind this approach is that if we know that the number of ways required to reach a step is
     * <blockquote>x[i] = x[i-1] + x[i-2]</blockquote>
     * 
     * In this case:
     * <ul>
     * <li>x[0] is the starting point. Let's set it to 1.</li>
     * <li>x[1] is the 1st step. There is only one way to get here and that is its value which is 1.</li>
     * <li>From x[2] onwards, we can calculate using "x[i] = x[i-1] + x[i-2]"</li>
     * </ul>
     * 
     * @param n number of steps in the stairs
     * @return number of ways to traverse the stairs using only 1 or 2 steps
     */
    public int climbStairsDynamic(int n) {
        if (n < 2) {
            return 1;
        }

        // In the beginning, xMinus1 is x[0] and xMinus2 is x[1]
        int count = 0, xMinus1 = 1, xMinus2 = 1;
        for (int i = 2; i <= n; i++) {
            count = xMinus1 + xMinus2;
            xMinus2 = xMinus1;
            xMinus1 = count;
        }

        return count;
    }
}
