package work.johntsai._005_longest_palindromic_substring

/**
 * Bruce Force
 * 时间复杂度 O(n^3)
 * 超出了时间限制
 */
class Solution {
    fun longestPalindrome(s: String): String {
        val length = s.length
        var result = ""
        val set = HashSet<String>()

        for (i in 0 until length) {
            for (j in i until length) {
                val sub = s.substring(i,j+1)
                if(sub.length <= result.length){
                    continue
                }
                if (!set.contains(sub)) {
                    set.add(sub)
                    if (isPal(sub)) {
                        if (sub.length > result.length) {
                            result = sub
                        }
                    }
                }
            }
        }
        return result
    }

    fun isPal(s: String): Boolean {
        val length = s.length
        return (0 until length / 2).none { s[it] != s[length - 1 - it] }
    }
}

fun main(args: Array<String>) {

    val solution = Solution()
    val longestPalindrome = solution.longestPalindrome("cbbd")
    println(longestPalindrome)

}