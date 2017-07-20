package level2;

import java.math.BigInteger;

/**
 * @author asif.hossain
 * @since 7/19/17.
 */
public class Power {
    public static String answer(int[] xs) {

        int negativeCount = 0;

        int positiveCount = 0;

        int zeroCount = 0;

        int minNegativeNumber = Integer.MIN_VALUE;

        BigInteger positiveSum = null;

        BigInteger negativeSum = null;

        for (int i = 0; i < xs.length; i++) {
            if(xs[i] < 0) {
                negativeCount++;
                if (negativeSum == null) negativeSum = BigInteger.ONE;
                negativeSum = negativeSum.multiply(BigInteger.valueOf(xs[i]));
                if (xs[i] > minNegativeNumber) minNegativeNumber = xs[i];
            }

            if (xs[i] == 0) {
                zeroCount++;
            }

            if (xs[i] > 0) {
                if (positiveSum == null) positiveSum = BigInteger.ONE;
                positiveCount++;
                positiveSum = positiveSum.multiply(BigInteger.valueOf(xs[i]));
            }
        }

        if (negativeCount > 1 && negativeCount % 2 == 1) negativeSum = negativeSum.divide(BigInteger.valueOf(minNegativeNumber));

        if(negativeCount == 0) {
            if(positiveCount == 0) {
                return Integer.toString(0);
            } else {
                return positiveSum.toString();
            }
        }

        if (positiveCount == 0) {
            if(negativeCount == 0) {
                return Integer.toString(0);
            } else {
                if (negativeSum.compareTo(BigInteger.ZERO) < 0 && zeroCount != 0) {
                    return Integer.toString(0);
                } else {
                    return String.valueOf(negativeSum);
                }
            }
        }

        if (negativeSum.compareTo(BigInteger.ZERO) > 0) {
            positiveSum = positiveSum.multiply(negativeSum);
        }

        return String.valueOf(positiveSum);
    }

    public static void main(String[] args) {
        int[] a = new int[50];
        for (int i = 0; i < 50; i++) {
            a[i] = -1000;
        }

        System.out.println(answer(new int[]{-3, 3, 0}));
        System.out.println(answer(new int[]{-5}));
        System.out.println(answer(a));
    }
}
