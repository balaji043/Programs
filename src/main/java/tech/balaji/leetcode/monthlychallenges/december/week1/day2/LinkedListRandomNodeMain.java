package tech.balaji.leetcode.monthlychallenges.december.week1.day2;

public class LinkedListRandomNodeMain {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        LinkedList<Integer> integerLinkedList = new LinkedList<>(numbers);
        System.out.println(integerLinkedList.getRandom()); // return 1
        System.out.println(integerLinkedList.getRandom());  // return 3
        System.out.println(integerLinkedList.getRandom());  // return 2
        System.out.println(integerLinkedList.getRandom());  // return 2
        System.out.println(integerLinkedList.getRandom());  // return 3
    }
}
