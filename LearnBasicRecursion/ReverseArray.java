package LearnBasicRecursion;

public class ReverseArray {
    public static void fun(int n, int[] nums, int i) {
        if (i >= n / 2) {
            return;
        }
        int temp = nums[i];
        nums[i] = nums[n - i - 1];
        nums[n - i - 1] = temp;
        fun(n, nums, i + 1);
    }

    public static int[] reverseArray(int n, int[] nums) {
        // Write your code here.
        fun(n, nums, 0);
        return nums;
    }
}
