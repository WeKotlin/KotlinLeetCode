package work.johntsai._005_longest_palindromic_substring

/*
 *动态规范
 */

class Solution2 {

    fun longestPalindrome(s: String): String {
        if (s.length <= 1) {
            return s
        }
        val length = s.length
        var maxLength = 0
        val dp = Array(length, { BooleanArray(length) })
        var result = ""
        for (i in 0 until length) {
            for (j in 0 until length - i) {
                val k = i + j
                if (s[j] == s[k] && (k - j <= 2 || dp[j + 1][k - 1])) {
                    dp[j][k] = true
                    if (k - j + 1 > maxLength) {
                        maxLength = k - j + 1
                        result = s.substring(j, k + 1)
                    }
                }
            }
        }
        return result
    }
}

fun main(args:Array<String>){

    val solution = Solution2()
    println(solution.longestPalindrome("afewfwefjweifabcdcbafjwiefjei"))


}