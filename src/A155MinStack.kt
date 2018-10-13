class MinStack() {

    /** initialize your data structure here. */
    val list = mutableListOf<Int>()

    fun push(x: Int) {
        list.add(x)
    }

    fun pop() {
        list.removeAt(list.lastIndex)
    }

    fun top(): Int {
        return list[list.lastIndex]
    }

    fun getMin(): Int {
        return list.min() ?: 0
    }

}