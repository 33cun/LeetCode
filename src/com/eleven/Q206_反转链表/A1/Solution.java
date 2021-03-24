package com.eleven.Q206_反转链表.A1;

//反转一个单链表。
//
// 示例:
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL
//
// 进阶:
//你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
// Related Topics 链表

/** 迭代
 * O(n)
 * 使用临时指针将指针反转
 */

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode tmp = null, prev = null, cur = head;

        while (cur != null) {
            tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }

        return prev;
    }

    public static void main(String[] args) {

    }
}
