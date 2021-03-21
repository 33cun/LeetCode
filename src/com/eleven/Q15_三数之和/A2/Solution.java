package com.eleven.Q15_三数之和.A2;

import java.util.*;

/**
 * 15. 三数之和
 * 难度
 * 中等
 *
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 * 示例 1：
 *
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 * 示例 2：
 *
 * 输入：nums = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：nums = [0]
 * 输出：[]
 *
 *
 * 提示：
 *
 * 0 <= nums.length <= 3000
 * -105 <= nums[i] <= 105
 *
 *
 * 解法2
 * 时间复杂度 O(n^2)
 *
 * 1。先将数组排序
 * 2。双指针 左右向中间靠拢，
 * 3。根据 a + b = -c，去找 c 的位置
 */

public class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();

        for (int i = 0; i < nums.length - 2; ++i) {
            if (!(i == 0 || (i > 0 && nums[i] != nums[i - 1]))) break;
            int lo = i + 1, hi = nums.length - 1, sum = -nums[i];

            while (lo < hi) {
                if (sum == nums[lo] + nums[hi]) {
                    result.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    while ((lo < hi) && nums[lo] == nums[lo + 1]) ++lo;
                    while ((lo < hi) && nums[hi] == nums[hi - 1]) --hi;
                    ++lo; --hi;
                } else if (nums[lo] + nums[hi] < sum) ++lo;
                else --hi;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1};
        List<List<Integer>> result = threeSum(nums);

        System.out.println(result);
    }
}
