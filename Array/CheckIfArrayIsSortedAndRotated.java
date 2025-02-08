package Array;

public class CheckIfArrayIsSortedAndRotated {

    public static boolean check(int[] nums) {
        int rotationPoint = -1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                if (rotationPoint != -1) {
                    if (nums[i + 1] > nums[0])
                        return false;
                }
                continue;
            } else {
                if (rotationPoint != -1) {
                    return false;
                }
                rotationPoint = i + 1;
                continue;
            }
        }
        if (rotationPoint != -1 && nums[rotationPoint] > nums[0]) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {

        int nums[] = { 2, 1 };

        boolean isSorted = check(nums);
        System.out.println(isSorted);
    }

}
