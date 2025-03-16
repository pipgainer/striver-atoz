package Leetcode;

import java.util.Arrays;

public class Array27 {
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = { 1 };
        int val = 1;
        int result = removeElement(nums, val);
        System.out.println(result);

    }

}
