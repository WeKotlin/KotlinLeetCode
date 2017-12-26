package work.johntsai._001_two_sum

import java.util.*
import kotlin.collections.HashMap

class Solution2{

    /**
     *  https://discuss.leetcode.com/topic/2447/accepted-java-o-n-solution/2
     * 用空间换时间
     * 将遍历过的值暂存起来，减少一层循环
     */
    fun twoSum(nums: IntArray, target: Int): IntArray {
       val result = IntArray(2)
       val map:HashMap<Int,Int> = HashMap()
       for(i in 0 until nums.size){
           if(map.containsKey(target-nums[i])){
               result[1] = i
               result[0] = map.get(target-nums[i])!!
               return result
           }
           map.put(nums[i],i)
       }
        return result
    }
}

fun main(args:Array<String>){
    val solution = Solution2()
    val twoSum = solution.twoSum(intArrayOf(1, 3, 2, 4, 5, 6, 9), 10)
    print(Arrays.toString(twoSum))
}