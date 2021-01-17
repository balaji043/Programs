package tech.balaji.leetcode.monthlychallenges.december.week1.day2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LinkedListNode<T> {
    private T value;
    private LinkedListNode<T> next;

    LinkedListNode() {
    }

    LinkedListNode(T value) {
        this.value = value;
    }

    LinkedListNode(T value, LinkedListNode<T> next) {
        this.value = value;
        this.next = next;
    }
}
