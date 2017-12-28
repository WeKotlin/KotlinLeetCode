package work.johntsai._003_longest_substring_without_repeating_characters

class Solution{
    fun lengthOfLongestSubstring(s: String): Int {
        val length = s.length
        var result = 0
        for(i in 0 until length){
            for(j in i+1..length){
                if(allDifferent(s,i,j)){
                    result = Math.max(result,j-i)
                }
            }
        }
        return result
    }

    private fun allDifferent(s:String,start:Int,end:Int):Boolean{
        val set = HashSet<Char>()
        for(i in start until end){
           val char = s[i]
           if(set.contains(char)){
               return false
           }
           set.add(char)
        }
        return true
    }
}

fun main(args:Array<String>){
    val solution = Solution()
    println(solution.lengthOfLongestSubstring("abcdbdcafe"))
}