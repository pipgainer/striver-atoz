package Array;

public class CheckIfArrayIsSorted {

    public static boolean check(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        boolean isSorted = check(nums);

        System.err.println(isSorted);
    }

}
