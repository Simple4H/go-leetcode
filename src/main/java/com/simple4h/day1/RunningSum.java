package com.simple4h.day1;

import java.util.Arrays;

/**
 * author Create By Simple4H
 * date 2020-08-20 20:40
 * <p>一维数组的动态和</p>
 */
public class RunningSum {

    public static void main(String[] args) {
        int[] origin = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(runningSum(origin)));
    }

    public static int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }
}
