package Array;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int consecutiveNumber = 0;
        int maxCon = 0;

        if (nums.length == 1)
            return nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                consecutiveNumber++;
                if (consecutiveNumber > maxCon) {
                    maxCon = consecutiveNumber;
                }
            } else {
                consecutiveNumber = 0;
            }
        }
        return maxCon;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 1 };
        int result = findMaxConsecutiveOnes(arr);
        System.out.println(result);
    }
}
