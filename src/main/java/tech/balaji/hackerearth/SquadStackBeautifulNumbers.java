package tech.balaji.hackerearth;

import java.util.ArrayList;
import java.util.List;

public class SquadStackBeautifulNumbers {

    static class Number {
        public final int n;
        public final boolean isBeautiful;

        public Number(int n) {
            this.n = n;
            this.isBeautiful = isOddNumberOfDivisor(n);
        }

        private static boolean isOddNumberOfDivisor(int n) {
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

        int[] a = {1, 2, 3, 4, 5};
        int aK = 1;
        System.out.println(solve(a, aK));

        int[] b = {4, 3, 4, 3, 4};
        int bK = 2;
        System.out.println(solve(b, bK));

        int[] c = {3, 3, 3, 3, 3,};
        int cK = 2;
        System.out.println(solve(c, cK));

    }

    static int solve(int[] arr, int k) {
        minimum = Integer.MAX_VALUE;
        List<Number> numbers = new ArrayList<>();
        int beautifulNumberCount = 0;
        for (int i : arr) {
            Number number = new Number(i);
            numbers.add(number);
            if (number.isBeautiful)
                beautifulNumberCount++;
        }
        if (beautifulNumberCount == 0)
            return -1;
        printSubArrays(numbers, 0, 0, k);
        return minimum == Integer.MAX_VALUE ? -1 : minimum;
    }

    // Recursive function to print all possible subarrays
    // for given array
    static void printSubArrays(List<Number> arr, int start, int end, int k) {
        if (end == arr.size())
            return;

        if (start > end)
            printSubArrays(arr, 0, end + 1, k);
        else {
            int beautifulNumberCount = 0;
            int subArrayCount = end - start + 1;

            for (int i = start; i <= end; i++)
                if (arr.get(i).isBeautiful)
                    beautifulNumberCount++;

            if (subArrayCount < minimum && beautifulNumberCount >= k)
                minimum = subArrayCount;

            printSubArrays(arr, start + 1, end, k);
        }
    }

}
