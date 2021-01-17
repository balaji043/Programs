package tech.balaji.leetcode.problems;

public class ReverseSinglyLinkedList {

    // Reverse a singly linked list.
    public static void main(String[] args) {
        testCase1();
    }

    private static void testCase1() {
//        1->2->3->4->5->NULL
        ListNode val5 = new ListNode(5);
        ListNode val4 = new ListNode(4, val5);
        ListNode val3 = new ListNode(3, val4);
        ListNode val2 = new ListNode(2, val3);
        ListNode head = new ListNode(1, val2);
        printListNode(head);

        ListNode reversedListNodeStart = reverseList(head);

        printListNode(reversedListNodeStart);
    }

    private static void printListNode(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }


    public static ListNode reverseList(ListNode head) {
        //        null<-1<-2 3->4->5->NULL

        ListNode prev = null;
        while (head != null) {
            ListNode nextHead = head.next;
            head.next = prev;
            prev = head;
            head = nextHead;
        }
        return prev;
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

