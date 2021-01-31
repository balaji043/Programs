package tech.balaji.leetcode.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    public static void main(String[] args) {
//        testCase1();
        testCase2();
    }

    private static void testCase1() {
        // Input: root = [1,null,2,3]
        // Output: [1,3,2]
        TreeNode root = new TreeNode(
                1,
                null,
                new TreeNode(
                        2,
                        new TreeNode(
                                3,
                                null,
                                null),
                        null
                )
        );
        System.out.println("Recursive In-order : " + recursiveInorderTraversal(root));
        System.out.println("Recursive Pre-order : " + recursivePreOrderTraversal(root));
        System.out.println("Recursive Post-order : " + recursivePostOrderTraversal(root));
        System.out.println("Iterative In-Order : " + iterativeInorderTraversal(root));
    }

    private static void testCase2() {
        // Input: root = [1,2,3,4,5]
        // Output: [1]
        TreeNode root = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(4),
                        new TreeNode(5)
                ),
                new TreeNode(
                        3,
                        new TreeNode(6),
                        null
                )
        );
//        System.out.println("Recursive In-order : " + recursiveInorderTraversal(root));
//        System.out.println("Recursive Pre-order : " + recursivePreOrderTraversal(root));
//        System.out.println("Recursive Post-order : " + recursivePostOrderTraversal(root));
        System.out.println("Iterative In-Order : " + iterativeInorderTraversal(root));

    }


    public static List<Integer> recursiveInorderTraversal(TreeNode root) {
        List<Integer> integers = new ArrayList<>();
        if (root == null) return integers;
        recursiveInorderTraversalHelper(root, integers);
        return integers;
    }

    private static void recursiveInorderTraversalHelper(TreeNode root, List<Integer> integers) {
        if (root.left != null)
            recursiveInorderTraversalHelper(root.left, integers);
        integers.add(root.val);
        if (root.right != null)
            recursiveInorderTraversalHelper(root.right, integers);
    }

    private static List<Integer> recursivePreOrderTraversal(TreeNode root) {
        List<Integer> integers = new ArrayList<>();
        if (root == null) return integers;
        recursivePreorderTraversalHelper(root, integers);
        return integers;
    }

    private static void recursivePreorderTraversalHelper(TreeNode root, List<Integer> integers) {
        integers.add(root.val);
        if (root.left != null)
            recursivePreorderTraversalHelper(root.left, integers);
        if (root.right != null)
            recursivePreorderTraversalHelper(root.right, integers);
    }

    private static List<Integer> recursivePostOrderTraversal(TreeNode root) {
        List<Integer> integers = new ArrayList<>();
        if (root == null) return integers;
        recursivePostorderTraversalHelper(root, integers);
        return integers;
    }

    private static void recursivePostorderTraversalHelper(TreeNode root, List<Integer> integers) {
        if (root.left != null)
            recursivePostorderTraversalHelper(root.left, integers);
        if (root.right != null)
            recursivePostorderTraversalHelper(root.right, integers);
        integers.add(root.val);
    }

    private static List<Integer> iterativeInorderTraversal(TreeNode root) {
        List<Integer> integers = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (temp != null || !stack.isEmpty()) {
            // left
            while (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }

            // root
            temp = stack.pop();
            integers.add(temp.val);

            // right
            temp = temp.right;
        }
        return integers;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int i) {
            this.val = i;
        }
    }
}
