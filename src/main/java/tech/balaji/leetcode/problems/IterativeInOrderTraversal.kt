package tech.balaji.leetcode.problems

import java.util.*
import kotlin.collections.ArrayList

fun inorderTraversal(root: TreeNode): List<Int> {
    val integers: MutableList<Int> = ArrayList()
    val stack: Stack<TreeNode> = Stack()

    var currentNode: TreeNode? = root
    while (currentNode != null || !stack.isEmpty()) {
        // traverse all the way to left
        while (currentNode != null) {
            stack.push(currentNode)
            currentNode = currentNode.left
        }
        // pop the last left or root
        currentNode = stack.pop()
        // add to list
        integers.add(currentNode.`val`)
        //
        currentNode = currentNode.right
    }

    return integers
}

class TreeNode(
        val `val`: Int,
        val left: TreeNode? = null,
        val right: TreeNode? = null,
)

fun main() {

    val root = TreeNode(
            1,
            TreeNode(2),
            TreeNode(3)
    )
    val inorderTraversal = inorderTraversal(root)
    println("In Order Traversal : $inorderTraversal")
    println("<top>.main")
    println("inorderTraversal = $inorderTraversal")
    println("root.`val` = ${root.`val`}")
    
}