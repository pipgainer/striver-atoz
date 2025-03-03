package Array;

public class SingleNumber {
    public static int getSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = { 2, 2, 1 };
        System.out.println(getSingleNumber(nums));
    }
}
