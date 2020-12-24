package tech.balaji.leetcode.december.week1.day1;

import lombok.Getter;
import lombok.Setter;

import static java.lang.Math.max;

@Getter
@Setter
public class BiTree<T> {
    private BiTreeNode<T> root;

    public BiTree(T[] objects) {
        this.root = createBinaryTree(objects, null, 0);
    }

    public BiTreeNode<T> createBinaryTree(T[] array, BiTreeNode<T> currentNode, int i) {
        if (i < array.length && array[i] != null) {
            currentNode = new BiTreeNode<>(array[i]);
            currentNode.setLeft(createBinaryTree(array, currentNode.getLeft(), 2 * i + 1));
            currentNode.setRight(createBinaryTree(array, currentNode.getRight(), 2 * i + 2));
        }
        return currentNode;
    }

    public int getMaxDepth() {
        return getMaxDepth(this.root);
    }

    private int getMaxDepth(BiTreeNode<T> root) {
        if (root == null)
            return 0;
        return max(getMaxDepth(root.getLeft()), getMaxDepth(root.getRight())) + 1;
    }
}
