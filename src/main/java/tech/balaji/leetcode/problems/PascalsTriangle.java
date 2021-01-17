package tech.balaji.leetcode.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    private static void testCase1() {
        int n = 5;
        List<List<Integer>> ans = generate(n);
        printAns(ans);
    }

    private static void testCase2() {
        int n = 10;
        List<List<Integer>> ans = generate(n);
        printAns(ans);
    }

    private static void printAns(List<List<Integer>> ans) {
        for (List<Integer> list : ans) {
            for (Integer in : list) {
                System.out.print(" " + in + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        // initializing the overall list
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) return triangle;
        // add the first row
        triangle.add(Collections.singletonList(1));

        // loop from 1 to number of rows
        for (int i = 1; i < numRows; i++) {
            // get the previous row
            List<Integer> prevRow = triangle.get(i - 1);
            // initialize the current row
            List<Integer> row = new ArrayList<>();

            // add the first element as 1
            row.add(1);

            // loop from 1 to i
            for (int j = 1; j < i; j++) {
                int diagonalLeftElement = prevRow.get(j - 1);
                int topElement = prevRow.get(j);
                row.add(diagonalLeftElement + topElement);
            }

            // add the last element as 1
            row.add(1);

            // add the row to the triangle
            triangle.add(row);

        }
        return triangle;
    }
}
