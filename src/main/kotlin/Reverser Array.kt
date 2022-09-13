
fun <T> reverse( array: Array<T?> , nextIndex: Int) {

    // base case: empty array or end of the array is reached

    if (nextIndex == array.size) return

    // store next element of the array

    val value = array[nextIndex]

    // reach the end of the array using recursion

    reverse(array, nextIndex + 1)

    // put elements in the call stack back into an array
    // starting from the beginning

    array[array.size - nextIndex - 1] = value
}

fun main() {
    val array: Array<Int?> = arrayOf(1, 2, 3, 4, 5)
    reverse(array, 0)
    println(array.contentToString())
    /*****     function reversed      *****/
    val list = mutableListOf(6,5,4,3,2,1,0)
    val reverse = list.reversed()
    println(reverse)
}
