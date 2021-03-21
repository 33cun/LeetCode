package com.eleven.Q15_三数之和.A1;

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
 */

import java.util.*;

/** 解法1
 * 暴力求解 O(n^3), 超时
 * 3次 loop 枚举
 */

public class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        int count = nums.length;
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < count - 2; ++i) {
            for (int j = i + 1; j < count - 1; ++j) {
                for (int k = j + 1; k < count; ++k) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }

        return new ArrayList<>(result);
    }
}
