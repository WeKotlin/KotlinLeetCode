package work.johntsai._001_two_sum

import java.util.*

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        for (i in 0 until nums.size - 1) {
            for (j in (i + 1) until nums.size) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i
                    result[1] = j
                    break
                }
            }
        }
        return result
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    print(Arrays.toString(solution.twoSum(intArrayOf(11, 4, 15, 7), 9)))
}