package Array;

public class MissingNumber {
    public static int missingNumber(int[] nums) {

        int N = nums.length + 1;
        int hash[] = new int[N + 1]; // hash array

        // storing the frequencies:
        for (int i = 0; i < N - 1; i++)
            hash[nums[i]]++;

        // checking the freqencies for numbers 1 to N:
        for (int i = 0; i <= N; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 3, 0, 1 };

        int ans = missingNumber(a);
        System.out.println(ans);
    }
}
