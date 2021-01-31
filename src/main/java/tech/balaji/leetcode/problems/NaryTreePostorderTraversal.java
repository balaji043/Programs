package tech.balaji.leetcode.problems;

import tech.balaji.Utils;

import java.util.*;

public class NaryTreePostorderTraversal {
    /*
    Given an n-ary tree, return the postorderIterative traversal of its nodes' values.
    Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by
    the null value (See examples).
    */
    public static void main(String[] args) {
        testRecursiveCase();
        testIterativeCase();
    }

    private static void testRecursiveCase() {
//        Input: root = [1,null,3,2,4,null,5,6]
//        Output: [5,6,3,2,4,1]
        System.out.println("testRecursiveCase");
        Node root = getNode();

        List<Integer> integers = postorderRecursive(root);
        System.out.println("Input [1,null,3,2,4,null,5,6]");
        Utils.print(Arrays.asList(5, 6, 3, 2, 4, 1), integers);
    }

    private static void testIterativeCase() {
//        Input: root = [1,null,3,2,4,null,5,6]
//        Output: [5,6,3,2,4,1]
        System.out.println("testIterativeCase");
        Node root = getNode();
        List<Integer> integers = postorderIterative(root);
        System.out.println("Input [1,null,3,2,4,null,5,6]");
        Utils.print(Arrays.asList(5, 6, 3, 2, 4, 1), integers);
    }

    private static Node getNode() {
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        Node node3 = new Node(3, Arrays.asList(node5, node6));
        Node node2 = new Node(2);
        Node node4 = new Node(4);

        return new Node(1, Arrays.asList(node3, node2, node4));
    }

    public static List<Integer> postorderRecursive(Node root) {
        List<Integer> integers = new ArrayList<>();
        postorderRecursiveHelper(root, integers);
        return integers;
    }

    private static void postorderRecursiveHelper(Node root, List<Integer> integers) {
        if (root == null)
            return;
        if (root.children != null)
            for (Node each : root.children)
                postorderRecursiveHelper(each, integers);
        integers.add(root.val);
    }

    private static List<Integer> postorderIterative(Node root) {
        LinkedList<Integer> integers = new LinkedList<>();
        Deque<Node> deque = new LinkedList<>();
        if (root == null) return integers;
        deque.add(root);

        while (!deque.isEmpty()) {
            Node last = deque.removeLast();
            integers.addFirst(last.val);
            if (last.children != null)
                deque.addAll(last.children);
        }
        integers.add(root.val);
        return integers;
    }




    private static class Node {
        public int val;
        public List<Node> children;

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
