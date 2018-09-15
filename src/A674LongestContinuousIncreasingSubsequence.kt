/**
 * https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/
 */
fun findLengthOfLCIS(nums: IntArray): Int {
    if (nums.isEmpty()) {
        return 0
    }
    var cnt = 1
    var maxCnt = 1
    var prevNum = nums[0]
    for (i in 1 until nums.size) {
        cnt = if (nums[i] - prevNum > 0) cnt + 1 else 1
        prevNum = nums[i]
        maxCnt = Math.max(maxCnt, cnt)
    }
    return maxCnt
}