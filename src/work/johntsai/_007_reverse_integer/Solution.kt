package work.johntsai._007_reverse_integer

import java.util.*

class Solution {
    fun reverse(x: Int): Int {
        val isNegative = x < 0
        var num = if (isNegative) -x else x
        val stack = Stack<Int>()
        while (num != 0) {
            stack.push(num % 10)
            num /= 10
        }
        var result: Long = 0
        var digit:Long = 1

        while (!stack.empty()) {
            result += digit * stack.pop()
            digit *= 10
        }
        result = if (isNegative) result * -1 else result
        if(result>Int.MAX_VALUE || result<Int.MIN_VALUE){
            return 0
        }
        return result.toInt()
    }
}

fun main(args: Array<String>) {
    var solution = Solution()
    val reverse = solution.reverse(1534236469)
    print(reverse)
}