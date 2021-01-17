package tech.balaji.hackerearth;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SquadStackBeautifulNumbers {

    static final Map<Long, Number> integerNumberMap = new HashMap<>();

    static class Number {
        public final long n;
        public final boolean isBeautiful;

        public Number(long n) {
            this.n = n;
            this.isBeautiful = isOddNumberOfDivisor(n);
        }

        private static boolean isOddNumberOfDivisor(long n) {
            double d = Math.sqrt(n);
            double floor = Math.floor(d);
            return d - floor == 0;
        }

        @Override
        public String toString() {
            return "" + n;
        }
    }

    private static int minimum = Integer.MAX_VALUE;

    public static void main(String[] args) {

//        testA();
        testB();
//        testC();

    }

    private static void testC() {
        long[] c = {3, 3, 3, 3, 3,};
        int cK = 2;
        System.out.println("------- " + solve(c, cK));
    }

    private static void testB() {
        long[] b = {4, 3, 4, 3, 4};
        int bK = 2;
        System.out.println("------- " + solve(b, bK));
    }

    private static void testA() {
        long[] a = {1, 2, 3, 4, 5};
        int aK = 1;
        System.out.println("------- " + solve(a, aK));

    }

    static int solve(long[] arr, int k) {
        minimum = Integer.MAX_VALUE;
        Number[] numbers = new Number[arr.length];
        int beautifulNumberCount = 0;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            Number number;

            if (integerNumberMap.containsKey(arr[i])) {
                number = integerNumberMap.get(arr[i]);
            } else {
                number = new Number(arr[i]);
                integerNumberMap.put(number.n, number);
            }

            numbers[i] = number;
            if (number.isBeautiful)
                beautifulNumberCount++;
        }
        if (beautifulNumberCount == 0)
            return -1;
        System.out.println("K value : " + k);

        printSubArrays(numbers, 0, k - 1, k);
        return minimum == Integer.MAX_VALUE ? -1 : minimum;
    }

    // Recursive function to print all possible subarrays
    // for given array
    static void printSubArrays(Number[] arr, int start, int end, int k) {

        if (minimum == k) return;

        if (start > arr.length || end > arr.length) return;

        System.out.println("Start : " + start + " End : " + end);
        if (end == arr.length)
            printSubArrays(arr, 0, end - start + 1, k);
        else {
            int subArrayCount = end - start + 1;
            int beautifulNumberCount = 0;

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SubArrayCount : ").append(subArrayCount).append(" [ ");

            if (minimum > subArrayCount && subArrayCount >= k) {
                for (int i = start; i <= end; i++) {
                    stringBuilder.append(arr[i].n).append(" ");
                    if (arr[i].isBeautiful)
                        beautifulNumberCount++;
                }
                stringBuilder.append("]").append(" Minimum : ").append(minimum).append(" Beautiful count : ").append(beautifulNumberCount);

                if (subArrayCount < minimum && beautifulNumberCount >= k) {
                    stringBuilder.append(" --- min and beautiful");
                    minimum = subArrayCount;
                    System.out.println(stringBuilder.toString());
                    return;
                } else {
                    stringBuilder.append(" --- not beautiful not min");
                }
            } else {
                stringBuilder.append("]").append(" Minimum : ").append(minimum).append(" Beautiful count : ").append(beautifulNumberCount).append(" -- no");
            }
            System.out.println(stringBuilder.toString());

            printSubArrays(arr, start + 1, end + 1, k);
        }
    }

}
