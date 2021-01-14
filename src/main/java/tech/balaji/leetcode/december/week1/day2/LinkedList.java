package tech.balaji.leetcode.december.week1.day2;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Random;

@Getter
@Setter
public class LinkedList<T> {

    private final ArrayList<T> range = new ArrayList<>();
    private final LinkedListNode<T> head;
    private final Random random = new Random();

    public LinkedList(T[] elements) {
        head = createLinkList(elements, null, 0);
        LinkedListNode<T> tempHead = head;
        while (tempHead != null) {
            this.range.add(tempHead.getValue());
            tempHead = tempHead.getNext();
        }
    }

    private LinkedListNode<T> createLinkList(T[] elements, LinkedListNode<T> root, int index) {
        if (index < elements.length) {
            root = new LinkedListNode<>(elements[index]);
            root.setNext(createLinkList(elements, root, index + 1));
        }
        return root;
    }

    public T getRandom() {
        int pick = random.nextInt() * this.range.size();
        return this.range.get(pick);
    }
}
