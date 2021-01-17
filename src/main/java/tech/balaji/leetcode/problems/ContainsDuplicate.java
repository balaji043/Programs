package tech.balaji.leetcode.problems;

import tech.balaji.Constants;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
    }

    private static void testCase1() {
        System.out.printf((Constants.TEST_CASE) + "%n", 1);
        int[] arr = {1, 2, 3, 1};
        boolean ans = containsDuplicate(arr);
        System.out.printf((Constants.OUTPUT) + "%n", true, ans);
    }

    private static void testCase2() {
        System.out.printf((Constants.TEST_CASE) + "%n", 1);
        int[] arr = {1, 2, 3, 4};
        boolean ans = containsDuplicate(arr);
        System.out.printf((Constants.OUTPUT) + "%n", false, ans);
    }

    private static void testCase3() {
        System.out.printf((Constants.TEST_CASE) + "%n", 1);
        int[] arr = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean ans = containsDuplicate(arr);
        System.out.printf((Constants.OUTPUT) + "%n", true, ans);
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i))
                return true;
            set.add(i);
        }
        return false;
    }
}
