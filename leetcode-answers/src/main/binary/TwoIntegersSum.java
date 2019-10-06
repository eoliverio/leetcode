package main.binary;

public class TwoIntegersSum {
    /**
     * <b>Bitwise addition</b><br>
     * Based the solution from this YouTube link:<br>
     * <a href="https://www.youtube.com/watch?v=qq64FrA2UXQ">
     * Add Two Numbers Without The "+" Sign (Bit Shifting Basics)
     * </a>
     * 
     * @param a first number
     * @param b second number
     * @return sum of the two numbers
     */
    public int getSum(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        return a;
    }
    
    /**
     * Adds two numbers using + operator -- to be used for testing.
     * 
     * @param a first number
     * @param b second number
     * @return sum of the two numbers
     */
    public int getSumChecker(int a, int b) {
        return a + b;
    }
}
