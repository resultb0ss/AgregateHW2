fun main() {
    val numbers = listOf(1,2,3,4)

    println(numbers.fold(""){a,b -> "$a $b"})
}