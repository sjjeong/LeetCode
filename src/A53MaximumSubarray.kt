/**
 * https://leetcode.com/problems/maximum-subarray/description/
 */
fun main(args: Array<String>) {
    println(maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
}

fun maxSubArray(nums: IntArray): Int {
    if (nums.isEmpty()) {
        return 0
    }
    var total = nums[0]
    var maxTotal = nums[0]
    for (i in 1 until nums.size) {
        total = if (total > 0) total + nums[i] else nums[i]
        maxTotal = Math.max(maxTotal, total)
    }
    return maxTotal
}