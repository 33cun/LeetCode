package com.eleven.Q283_移动零.A1;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/move-zeroes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/** 解法1
 * 时间复杂度 O(1)
 *
 * 参考快排思路，记录第一个零的位置，将它设为轴点，不等于零的数字统统丢到轴点的左边
 * 1. 定义 j 记录零的位置
 * 2. for 循环数组
 * 3. 只要 num[i] 不等于0，那就讲 i j 交换并 j++
 */
public class Solution {
    private static void moveZeros(int[] nums) {
        int j = 0, tmp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 0, 100};
        moveZeros(nums);

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
