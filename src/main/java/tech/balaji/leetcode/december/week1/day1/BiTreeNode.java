package tech.balaji.leetcode.december.week1.day1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BiTreeNode<T> {
   private T value;
   private BiTreeNode<T> left;
    private BiTreeNode<T> right;

    BiTreeNode() {
    }

    BiTreeNode(T value) {
        this.value = value;
    }

    BiTreeNode(T value, BiTreeNode<T> left, BiTreeNode<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
