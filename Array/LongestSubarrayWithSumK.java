package Array;

public class LongestSubarrayWithSumK {
    public static int getLongestSubarray(int[] arr, int k) {
        int n = arr.length; // size of the array.

        int len = 0;
        for (int i = 0; i < n; i++) { // starting index
            long s = 0;
            for (int j = i; j < n; j++) { // ending index
                // add all the elements of
                // subarray = a[i...j]:
                s += arr[j];

                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    };

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 1, 9 };
        int k = 10;
        int len = getLongestSubarray(arr, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
