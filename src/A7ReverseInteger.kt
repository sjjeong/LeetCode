fun reverse(x: Int): Int {
    return x.toString().reversed().let {
        try {
            it.toInt()
        } catch (e: NumberFormatException) {
            if (it.last() == '-') {
                try {
                    it.substring(0, it.length - 1).toInt() * -1
                } catch (e: NumberFormatException) {
                    0
                }
            } else {
                0
            }
        }
    }
}

fun main(args: Array<String>) {
    println(reverse(-2147483648))
}