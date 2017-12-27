package work.johntsai._009_palindrome_number

class Solution2 {
    fun isPalindrome(x: Int): Boolean {
        var reverse: Long = 0
        var num = x
        while (num != 0) {
            reverse = reverse * 10 + num % 10
            num /= 10
        }
        return x == reverse.toInt()
    }
}

fun main(args: Array<String>) {
    val solution = Solution2()
    println(solution.isPalindrome(123454321))
    println(solution.isPalindrome(12345321))
}