package Array.Easy;

public class Solution {
    public static int longestSubarrayWithSumK(int[] a, long k) {
        long sum = a[0];
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int n = a.length;
        while (right < n) {
            while (left < right && sum > k) {
                sum -= a[left];
                left++;
            }
            if (sum == k) {
                if ((right - left + 1) >= maxLength) {
                    maxLength = right - left + 1;
                }
            }
            right++;
            if (right < n) {
                sum += a[right];
            }
        }
        return maxLength;
    }
}