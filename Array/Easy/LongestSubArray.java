package Array.Easy;

import java.util.HashMap;

class Solution {
    public int maxSubArray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                if (i + 1 > maxLength) {
                    maxLength = i + 1;
                }
            }
            int rem = k - sum;

            if (map.get(rem) != null) {
                int len = i - map.get(rem);
                if (len > maxLength) {
                    maxLength = len;
                }
            }
            if (map.get(sum) != null) {
                map.put(sum, i);
            }

        }

        return maxLength;

    }
}