package tech.balaji.december.week1.day1;

import org.junit.Test;
import tech.balaji.leetcode.monthlychallenges.december.week1.day1.BiTree;
import tech.balaji.leetcode.monthlychallenges.december.week1.day1.MaximumDepthOfBinaryTreeMain;
import tech.balaji.leetcode.monthlychallenges.december.week1.day1.TreeNode;

import static org.junit.Assert.*;

public class MaximumDepthOfBinaryTreeMainTest {

    @Test
    public void testCreateBinaryTreeAndMaxDepth1() {
        Integer[] numbers = {3, 9, 20, null, null, 15, 7};
        BiTree<Integer> tree = new BiTree<>(numbers);
        TreeNode<Integer> currentNode;

        // Bi tree
        assertNotNull(tree);

        // index 0 for element 3
        currentNode = tree.getRoot();
        assertNotNull(currentNode);
        assertEquals(3, (int) currentNode.getValue());

        // index 1 for element 9
        currentNode = tree.getRoot().getLeft();
        assertNotNull(currentNode);
        assertEquals(9, (int) currentNode.getValue());

        // index 2 for element 20
        currentNode = tree.getRoot().getRight();
        assertNotNull(currentNode);
        assertEquals(numbers[2], currentNode.getValue());

        // index 3 for element null
        currentNode = tree.getRoot().getLeft().getLeft();
        assertNull(currentNode);

        // index 4 for element null
        currentNode = tree.getRoot().getLeft().getRight();
        assertNull(currentNode);

        // index 5 for element 15
        currentNode = tree.getRoot().getRight().getLeft();
        assertNotNull(currentNode);
        assertEquals(15, (int) currentNode.getValue());
        // implicit null values for element 15
        assertNull(currentNode.getRight());
        assertNull(currentNode.getLeft());

        // index 6 for element 7
        currentNode = tree.getRoot().getRight().getRight();
        assertNotNull(currentNode);
        assertEquals(7, (int) currentNode.getValue());
        // implicit null values for element 7
        assertNull(currentNode.getRight());
        assertNull(currentNode.getLeft());

        // getMax Depth
        assertEquals(3, MaximumDepthOfBinaryTreeMain.getMaxDepth(tree.getRoot()));
    }

    @Test
    public void testCreateBinaryTreeAndMaxDepth2() {
        Integer[] numbers = {1, null, 2};
        BiTree<Integer> tree = new BiTree<>(numbers);
        TreeNode<Integer> currentNode;

        // Bi tree
        assertNotNull(tree);

        // index 0 value 1
        currentNode = tree.getRoot();
        assertNotNull(currentNode);
        assertEquals(1, (int) currentNode.getValue());

        // index 1 value null
        currentNode = tree.getRoot().getLeft();
        assertNull(currentNode);

        // index 2 value 2
        currentNode = tree.getRoot().getRight();
        assertNotNull(currentNode);
        assertEquals(2, (int) currentNode.getValue());
        // implicit null
        assertNull(currentNode.getLeft());
        assertNull(currentNode.getRight());

        // max depth 2
        assertEquals(2, MaximumDepthOfBinaryTreeMain.getMaxDepth(tree.getRoot()));

    }

    @Test
    public void testCreateBinaryTreeAndMaxDepth3() {
        Integer[] numbers = {0};
        BiTree<Integer> tree = new BiTree<>(numbers);
        TreeNode<Integer> currentNode;

        // Bi tree
        assertNotNull(tree);

        // index 0 value 1
        currentNode = tree.getRoot();
        assertNotNull(currentNode);
        assertEquals(0, (int) currentNode.getValue());
        // implicit null
        assertNull(currentNode.getLeft());
        assertNull(currentNode.getRight());

        // max depth 2
        assertEquals(1, MaximumDepthOfBinaryTreeMain.getMaxDepth(tree.getRoot()));

    }


}
