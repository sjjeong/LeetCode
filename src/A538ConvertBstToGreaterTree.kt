/**
 * https://leetcode.com/problems/convert-bst-to-greater-tree/description/
 */
fun main(args: Array<String>) {

}

var curSum = 0

fun convertBST(root: TreeNode?): TreeNode? {
    travel(root)
    return root
}

fun travel(root: TreeNode?) {
    root ?: return
    travel(root.right)

    curSum += root.`val`
    root.`val` = curSum

    travel(root.left)
}

class TreeNode(var `val`: Int = 0) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
