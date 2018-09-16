/**
 * https://leetcode.com/problems/two-sum/description/
 */
fun twoSum(nums: IntArray, target: Int): IntArray {
    val list = nums.mapIndexed { index, i -> index to i }.sortedBy { it.second }
    var start = 0
    var end = list.size - 1
    while (true) {
        if (start == end) {
            break
        }
        val sum = list[start].second + list[end].second
        if (sum == target) {
            break
        } else if (sum > target) {
            end -= 1
        } else {
            start += 1
        }
    }
    return intArrayOf(list[start].first, list[end].first)
}