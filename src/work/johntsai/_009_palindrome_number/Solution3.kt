package work.johntsai._009_palindrome_number

class Solution3 {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        var div = 1
        var num = x
        while (num / div >= 10) {
            div *= 10
        }
        while (num != 0) {
            val l = num / div
            val r = num % 10
            if (l != r) return false
            num = (num % div) / 10
            div /= 100
        }
        return true
    }
}
fun main(args: Array<String>) {
    val solution = Solution3()
    println(solution.isPalindrome(123454321))
    println(solution.isPalindrome(1))
}