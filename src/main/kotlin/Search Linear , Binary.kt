
/*********                              Search For Data In List, Array
// Binary Search
fun List<Int>.binaryS ( x : Int): Int {
var start = 0
val toIndex = size - 1
var end = toIndex

while (start <= end){
val mid =( start + end ) / 2
val midValue = get(mid)
val comp = compareValues(midValue,x)
if (comp == 0) {
return mid
}
else if (comp > 0 ){
end = mid - 1
} else
start = mid + 1
}
return  -1
}
fun main() {
val list = mutableListOf(1,2,3,4,5)
println( "Index of element :"+list.binaryS(5))
}

// linear Search

fun linearSearch( list :MutableList<Int> , item : Int) :Int {
for (i in list.indices) {
if (list[i] == item)
return i
}

return -1
}

fun main () {

val search = linearSearch(mutableListOf(1,2,3,4,5,6,7,8,9),9)

println(search)
}
 ***/