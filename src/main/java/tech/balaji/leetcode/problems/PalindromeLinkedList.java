package tech.balaji.leetcode.problems;

import tech.balaji.Utils;

public class PalindromeLinkedList {
    //    Given a singly linked list, determine if it is a palindrome.
    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
    }

    private static void testCase1() {
        ListNode val2 = new ListNode(2);
        ListNode head = new ListNode(1, val2);
        printListNode(head);
        Utils.print(false, isPalindrome(head));
    }

    private static void testCase2() {
        ListNode val3 = new ListNode(1, null);
        ListNode val2 = new ListNode(2, val3);
        ListNode head = new ListNode(1, val2);
        printListNode(head);
        Utils.print(true, isPalindrome(head));
    }


    private static void testCase3() {
        ListNode val4 = new ListNode(1, null);
        ListNode val3 = new ListNode(2, val4);
        ListNode val2 = new ListNode(1, val3);
        ListNode head = new ListNode(1, val2);
        printListNode(head);
        Utils.print(false, isPalindrome(head));
    }

    public static boolean isPalindrome(final ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        slow = getReversedNode(slow);
        fast = head;
        while (slow != null) {
            if (slow.val != fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    private static ListNode getReversedNode(ListNode headNode) {
        ListNode currentNode = headNode;
        ListNode prevNode = null;
        ListNode nextNode;

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }

        return prevNode;
    }


    private static void printListNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }


    private static class ListNode {
        int val;
        ListNode next;


        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
