/**
 * https://leetcode.com/problems/max-increase-to-keep-city-skyline/description/
 */
fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {
    val topBottomArray = arrayOfNulls<Int>(grid[0].size)
    val leftRightArray = arrayOfNulls<Int>(grid.size)

    for (i in 0 until topBottomArray.size) {
        var max = 0
        for (j in 0 until grid.size) {
            val value = grid[j][i]
            if (value > max) {
                max = value
            }
        }
        topBottomArray[i] = max
    }

    for (i in 0 until leftRightArray.size) {
        var max = 0
        for (j in 0 until grid[0].size) {
            val value = grid[i][j]
            if (value > max) {
                max = value
            }
        }
        leftRightArray[i] = max
    }


    var cnt = 0

    topBottomArray.forEachIndexed { indexI, i ->
        leftRightArray.forEachIndexed { indexJ, j ->
            cnt += if (j!! > i!!) i - grid[indexJ][indexI] else j - grid[indexJ][indexI]
        }
    }

    return cnt
}