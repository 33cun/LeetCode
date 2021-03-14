package com.eleven.Q11_盛最多的水.A2;

/** 解法2
 * 时间复杂度 O(n)
 *
 * 双指针向中间并拢，每次移动 Math.min(height[i], height[j]) 那根指针
 */
public class Solution {
    public static int maxArea(int[] height) {
        int max = 0;

        for (int i = 0, j = height.length - 1; i < j; ) {
            int tmp = (j - i) * Math.min(height[i], height[j]);
            max = Math.max(max, tmp);

            if (height[i] < height[j]) i++;
            else j--;
        }

        return max;
    }


    public static void main(String[] args) {
//        int[] nums = {4, 3, 2, 1, 4};
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int a = maxArea(nums);

        System.out.println(a);
    }
}
