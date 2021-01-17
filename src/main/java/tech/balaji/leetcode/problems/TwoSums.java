package tech.balaji.leetcode.problems;

public class TwoSums {
    public static void main(String[] args) {
        runTwoSums1();
        runTwoSums2();
    }

    private static void runTwoSums1() {
        System.out.println("expected ");
        printArray(new int[]{0, 1});
        System.out.println("actual ");
        printArray(twoSumUnSortedArray(new int[]{2, 7, 11, 15}, 9));
        System.out.println("-----------------");
        System.out.println("expected ");
        printArray(new int[]{1, 2});
        System.out.println("actual ");
        printArray(twoSumUnSortedArray(new int[]{3, 2, 4}, 6));
    }

    private static void printArray(int[] ints) {
        for (int i : ints)
            System.out.print(i + " ");
        System.out.println();
    }

    private static void runTwoSums2() {
        int[] arr = new int[]{1, 2, 3, 5};
        int target = 4;
        int[] ints = twoSumSortedArray(arr, target);
        printArray(ints);
    }

    private static int[] twoSumUnSortedArray(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (i != j && numbers[i] + numbers[j] == target)
                    return new int[]{i, j};
            }
        }
        throw new IllegalArgumentException("No match found");
    }

    private static int[] twoSumSortedArray(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i <= j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) return new int[]{i+1, j+1};
            else if (sum > target) j--;
            else
                i++;
        }
        throw new IllegalArgumentException("No match found");
    }
}
