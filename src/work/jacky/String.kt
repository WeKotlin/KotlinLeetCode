package work.jacky

fun main(args: Array<String>) {
    testString()
}

fun testString() {
    val str1 = "abc"
    val str2 = """line1\n
        line2
        line3
        """
    val line1 = """
        line1
     line2
        line3
    """.trimIndent()
    val line2 = """
        line1
     line2
        line3
    """
    println(str1)
    println(str2)
    println(line1)
    println(line2)

    val array = arrayListOf("a", "b", "c", "d")
    println("index 0 of array is ${array[0]}")

    println("print special symbol \$")
    println("print special symbol ${'$'}")
}