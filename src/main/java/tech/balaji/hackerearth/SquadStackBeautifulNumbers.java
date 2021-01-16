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

        int[] arr = {1, 2, 3, 4, 5};
        int k = 1;
        System.out.println(solve(arr, k));

        int[] a = {4, 3, 4, 3, 4};
        int n = 2;
        System.out.println(solve(a, n));
    }

    static int solve(int[] arr, int k) {
        minimum = Integer.MAX_VALUE;
        List<Number> numbers = new ArrayList<>();
        for (int i : arr)
            numbers.add(new Number(i));
        printSubArrays(numbers, 0, 0, k);
        return minimum;
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
            int subArrayCount = 0;
            for (int i = start; i <= end; i++) {
                if (arr.get(i).isBeautiful)
                    beautifulNumberCount++;
                subArrayCount++;
            }
            if (subArrayCount < minimum && beautifulNumberCount >= k)
                minimum = subArrayCount;

            printSubArrays(arr, start + 1, end, k);
        }
    }

}
