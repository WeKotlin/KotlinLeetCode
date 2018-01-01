package work.johntsai._005_longest_palindromic_substring

class Solution3 {
    fun longestPalindrome(s: String): String {
        val length = s.length
        if (length == 1) {
            return s
        }
        var longest = s.substring(0, 1)
        for (i in 0 until length) {
            var temp = helper(s,i,i)
            if(temp.length > longest.length){
                longest = temp
            }

            temp = helper(s,i,i+1)
            if(temp.length > longest.length){
                longest = temp
            }
        }
        return longest
    }

    private fun helper(s: String, begin: Int, end: Int): String {
        var b = begin
        var e = end
        println("begin=$b end=$e")
        while (b >= 0 && e < s.length && s[b] == s[e]) {
            b--
            e++
            println("b=$b e=$e")

        }
        return s.substring(b + 1, e)
    }
}

fun main(args: Array<String>) {

    val solution = Solution3()
    println(solution.longestPalindrome("jfiwejfiwefgrbrigbwruigbwribgiwbfiawfwjehfwehfo"))
}