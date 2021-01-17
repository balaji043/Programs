package tech.balaji.leetcode.problems;

import tech.balaji.Constants;

public class NumberOfIslands {

    //Given an m x n 2d grid map of '1's (land) and '0's (water), return the number of islands.
    //
    //An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
    //You may assume all four edges of the grid are all surrounded by water.
    public static void main(String[] args) {
        testCase1();
        testCase2();
    }


    private static void testCase1() {
        System.out.printf((Constants.TEST_CASE) + "%n", "1");
        int[][] grid = {
                {1, 1, 1, 1, 0},
                {1, 1, 0, 1, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
        System.out.printf((Constants.OUTPUT) + "%n", 1, bfs(grid));
    }

    private static void testCase2() {
        System.out.printf((Constants.TEST_CASE) + "%n", "2");
        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1}
        };
        System.out.printf((Constants.OUTPUT) + "%n", 3, bfs(grid));
    }

    public static int bfs(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    bfs(grid, i, j);
                }
            }
        }
        return count;
    }

    public static void bfs(int[][] grid, int i, int j) {

        // check if row index is within boundary
        if (i < 0 || i >= grid.length) return;

        // check if column index is within boundary
        if (j < 0 || j >= grid[i].length) return;

        if (grid[i][j] == 0) return;

        // mark the island as visited by making it 0 (water)
        grid[i][j] = 0;

        // check down block
        bfs(grid, i + 1, j);
        // check up block
        bfs(grid, i - 1, j);
        // check right block
        bfs(grid, i, j + 1);
        // check left block
        bfs(grid, i, j - 1);


    }
}
