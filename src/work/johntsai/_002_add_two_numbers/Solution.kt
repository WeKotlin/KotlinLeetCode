package work.johntsai._002_add_two_numbers

import work.johntsai.utils.ListNode

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var node1 = l1
        var node2 = l2

        var number = 0
        var fake = ListNode(0)
        var result: ListNode? = fake

        while (node1 != null || node2 != null) {
            number /= 10
            if (node1 != null) {
                number += node1.`val`
                node1 = node1.next
            }
            if (node2 != null) {
                number += node2.`val`
                node2 = node2.next
            }
            result?.next = ListNode(number % 10)
            result = result?.next
        }
        if (number/10 == 1) {
            result?.next = ListNode(1)
        }
        return fake.next
    }
}

fun main(args: Array<String>) {
    val solution = Solution()

    val start = ListNode(1)
    val second = ListNode(2)
    val end = ListNode(3)

    start.next = second
    second.next = end

    val start1 = ListNode(3)
    val second1 = ListNode(2)
    val third1 = ListNode(9)
    val end1 = ListNode(1)

    start1.next = second1
    second1.next = third1
    third1.next = end1

    val addTwoNumbers = solution.addTwoNumbers(start, start1)

    if (addTwoNumbers != null) {
        var node = addTwoNumbers
        while (node != null) {
            print(node.`val`)
            node = node.next
        }


    }


}