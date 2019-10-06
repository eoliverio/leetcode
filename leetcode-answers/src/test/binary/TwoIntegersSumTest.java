package test.binary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.binary.TwoIntegersSum;

public class TwoIntegersSumTest {
    private TwoIntegersSum ts = new TwoIntegersSum();

    @Test
    public void leetcodeSample() {
        int a = 1, b = 2;
        assertEquals(ts.getSumChecker(a, b), ts.getSum(a, b));
    }

    @Test
    public void leetcodeNegativeSample() {
        int a = -12, b = -8;
        assertEquals(ts.getSumChecker(a, b), ts.getSum(a, b));
    }

    @Test
    public void negativeAndPositive1() {
        int a = -12, b = 8;
        assertEquals(ts.getSumChecker(a, b), ts.getSum(a, b));
    }

    @Test
    public void negativeAndPositive2() {
        int a = -8, b = 12;
        assertEquals(ts.getSumChecker(a, b), ts.getSum(a, b));
    }

    @Test
    public void zeroA() {
        int a = 0, b = 12;
        assertEquals(ts.getSumChecker(a, b), ts.getSum(a, b));
    }

    @Test
    public void zeroB() {
        int a = 12, b = 0;
        assertEquals(ts.getSumChecker(a, b), ts.getSum(a, b));
    }

    @Test
    public void upperLimit() {
        int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
        assertEquals(ts.getSumChecker(a, b), ts.getSum(a, b));
    }

    @Test
    public void lowerLimit() {
        int a = Integer.MIN_VALUE, b = Integer.MIN_VALUE;
        assertEquals(ts.getSumChecker(a, b), ts.getSum(a, b));
    }

    @Test
    public void lowerAndLowerLimit1() {
        int a = Integer.MAX_VALUE, b = Integer.MIN_VALUE;
        assertEquals(ts.getSumChecker(a, b), ts.getSum(a, b));
    }

    @Test
    public void lowerAndLowerLimit2() {
        int a = Integer.MIN_VALUE, b = Integer.MAX_VALUE;
        assertEquals(ts.getSumChecker(a, b), ts.getSum(a, b));
    }

}
