/**
 * https://leetcode.com/problems/merge-two-binary-trees/description/
 */

class Solution {
    fun mergeTrees(t1: TreeNode?, t2: TreeNode?): TreeNode? {
        if (t1 == null && t2 == null) {
            return null
        }
        val treeNode = TreeNode((t1?.`val` ?: 0) + (t2?.`val` ?: 0))
        sumTree(treeNode, t1, t2)
        return treeNode
    }

    fun sumTree(mergeTree: TreeNode?, t1: TreeNode?, t2: TreeNode?) {
        if ((t1?.left != null) || (t2?.left != null)) {
            val node = TreeNode((t1?.left?.`val` ?: 0) + (t2?.left?.`val` ?: 0))
            mergeTree?.left = node
            sumTree(node, t1?.left, t2?.left)
        }

        if ((t1?.right != null) || (t2?.right != null)) {
            val node = TreeNode((t1?.right?.`val` ?: 0) + (t2?.right?.`val` ?: 0))
            mergeTree?.right = node
            sumTree(node, t1?.right, t2?.right)
        }

    }

}