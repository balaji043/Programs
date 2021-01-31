package tech.balaji.leetcode.problems

import java.util.*

fun preorder(root: Node?): List<Int> {
    if (root == null) return emptyList()

    val stack = Stack<Node>()
    val preOrder = mutableListOf<Int>()
    stack.push(root)

    while (stack.isNotEmpty()) {
        val current = stack.pop()
        preOrder.add(current.`val`)
        current.children?.reversed()?.forEach { stack.push(it) } // push non-null children in reverse order.
    }
    return preOrder
}

fun postorder(root: Node?): List<Int> {
    if (root == null)
        return emptyList()

    val integers: LinkedList<Int> = LinkedList()
    val deque: Deque<Node> = LinkedList()

    deque.add(root)

    while (deque.isNotEmpty()) {
        val last = deque.removeLast()
        integers.addFirst(last.`val`)
        if (last.children != null)
            deque.addAll(last.children)
    }
    return integers
}

fun main() {
    testCase1()
}

class Node(
    val `val`: Int,
    val children: List<Node>? = listOf()
)

fun inorder(root: Node?): List<Int>? {
    return null
}

fun testCase1() {
//    Input: root = [1,null,3,2,4,null,5,6]
//    Output: [1,3,5,6,2,4]

    val root = Node(
        1,
        listOf(
            Node(
                3,
                listOf(
                    Node(5),
                    Node(6)
                )
            ),
            Node(2),
            Node(4),
        )
    )

    val preorder = preorder(root)
    val inorder = inorder(root)
    val postorder = postorder(root)

    println("preorder  = $preorder")
    println("postorder = $postorder")
    println("inorder = $inorder")
}


