package com.eleven.Q206_反转链表.A2;

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

import com.eleven.Q206_反转链表.A2.ListNode;

/** 递归
 * 时间 O(n)，空间 O(n)
 * 每次将 head 的下下指针指向自己，避免环自己的 next 指针指向 null
 */

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode cur = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return cur;
    }

    public static void main(String[] args) {

    }
}
