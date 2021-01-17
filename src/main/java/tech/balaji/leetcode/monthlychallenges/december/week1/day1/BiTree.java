package tech.balaji.leetcode.monthlychallenges.december.week1.day1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BiTree<T> {
    private TreeNode<T> root;

    public BiTree(T[] objects) {
        this.root = createBinaryTree(objects, null, 0);
    }

    public BiTree(TreeNode<T> root) {
        this.root = root;
    }

    public TreeNode<T> createBinaryTree(T[] array, TreeNode<T> currentNode, int i) {
        if (i < array.length && array[i] != null) {
            currentNode = new TreeNode<>(array[i]);
            currentNode.setLeft(createBinaryTree(array, currentNode.getLeft(), 2 * i + 1));
            currentNode.setRight(createBinaryTree(array, currentNode.getRight(), 2 * i + 2));
        }
        return currentNode;
    }
    public void printAllValues() {
       printAllValues(root);
    }
    public  static <T> void printAllValues(TreeNode<T> node) {
        if (node == null)
            return;
        System.out.println(node.getValue());
        printAllValues(node.getLeft());
        printAllValues(node.getRight());
    }
}
