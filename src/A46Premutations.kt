/**
 * https://leetcode.com/problems/permutations/description/
 */
fun main(args: Array<String>) {
    println(permute(intArrayOf(1, 2, 3, 4)))
}

    fun permute(nums: IntArray): List<List<Int>> {
        val list = mutableListOf<List<Int>>()
        if (nums.size == 1) {
            list.add(mutableListOf(nums[0]))
        } else {
            nums.forEachIndexed { index, value ->
                permute(nums.copyOf().toMutableList().apply {
                    removeAt(index)
                }.toIntArray()).forEach {
                    list.add(it.toMutableList().apply { add(0, value) })
                }
            }
        }
        return list
    }
