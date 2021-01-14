package tech.balaji.leetcode.december.week1.day1;


import static java.lang.Math.max;

//  Given the root of a binary tree, return its maximum depth.
//
//  A binary tree's maximum depth is the number of nodes along
//  the longest path from the root node down to the farthest leaf node.
public class MaximumDepthOfBinaryTreeMain {

    public static void main(String[] args) {
        Integer[] numbers = {3, 9, 20, null, null, 15, 7};
        BiTree<Integer> biTree = new BiTree<>(numbers);
        System.out.println("Max Depth of binary tree is " + getMaxDepth(biTree.getRoot()));
    }

    public static <T> int getMaxDepth(TreeNode<T> root) {
        if (root == null)
            return 0;
        return max(getMaxDepth(root.getLeft()), getMaxDepth(root.getRight())) + 1;
    }
}
