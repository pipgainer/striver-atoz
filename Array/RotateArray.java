package Array;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {

        if (k == nums.length || nums.length == 1) {
            System.out.println(Arrays.toString(nums));
            return;
        }
        while (k > nums.length) {
            k = k - nums.length;
        }

        // Declare an array
        int[] numbers;

        // Allocate memory for 5 integers
        numbers = new int[nums.length];
        int j = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            numbers[j] = nums[i];
            j++;
        }
        for (int i = 0; i < nums.length - k; i++) {
            numbers[j] = nums[i];
            j++;
        }
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = numbers[i];
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2 };
        rotate(arr, 2);
    }
}
