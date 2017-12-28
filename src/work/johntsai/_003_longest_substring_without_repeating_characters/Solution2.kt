package work.johntsai._003_longest_substring_without_repeating_characters

class Solution2{
    fun lengthOfLongestSubstring(s: String): Int {
       val length = s.length
       val set = HashSet<Char>()
       var result = 0
       var i = 0
       var j = 0
       while (i<length && j<length){
           if(!set.contains(s[j])){
               set.add(s[j++])
               result = Math.max(result,j-i)
           }else{
               set.remove(s[i++])
           }
       }
        return result
    }
}
fun main(args:Array<String>){
    val solution = Solution()
    println(solution.lengthOfLongestSubstring("abcdbdcafe"))
}