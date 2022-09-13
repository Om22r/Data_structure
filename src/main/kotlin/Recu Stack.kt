class StackWithList{
    private val elements: MutableList<Any> = mutableListOf()

    fun isStackEmpty() = elements.isEmpty()

    fun size() = elements.size

    fun push (item: Any) = elements.add(item)

    fun pop() : Any? {
        val item = elements.lastOrNull()
        if (!isStackEmpty()){
            elements.removeAt(elements.size -1)
        }
        return item
    }
    fun peek() : Any? = elements.lastOrNull()

    override fun toString(): String = elements.toString()
}

fun main() {
    val stackList  = StackWithList()
    println("is Stack empty : " + stackList.isStackEmpty())

    stackList.push("karting")

    println("peek is : " + stackList.peek())

    stackList.push(false)
    stackList.push(5)
    stackList.push(12.22)

    println("the pop elements is : " +stackList.pop())
    println("the size is : " +stackList.size())
    println("is Stack empty : " +stackList.isStackEmpty())
}