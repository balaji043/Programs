package tech.balaji.leetcode.monthlychallenges.december.week1.day1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TreeNode<T> {
   private T value;
   private TreeNode<T> left;
    private TreeNode<T> right;

    TreeNode() {
    }

    TreeNode(T value) {
        this.value = value;
    }

    TreeNode(T value, TreeNode<T> left, TreeNode<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
