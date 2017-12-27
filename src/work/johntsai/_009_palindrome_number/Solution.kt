package work.johntsai._009_palindrome_number

class Solution {
    fun isPalindrome(x: Int): Boolean {
        val str = x.toString()
        return (0 until str.length/2).none { str[it]!=str[str.length - 1 - it] }
    }
}

fun main(args:Array<String>){
    val solution = Solution()
    println(solution.isPalindrome(1234321))
    println(solution.isPalindrome(1234544321))
}