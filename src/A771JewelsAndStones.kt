/**
 * https://leetcode.com/problems/jewels-and-stones/description/
 */
fun numJewelsInStones(J: String, S: String): Int {
    return S.replace(Regex("[^$J]"), "").length
}