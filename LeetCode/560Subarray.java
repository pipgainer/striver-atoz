package LeetCode;

import java.util.HashMap;

class Solution {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int subArrays = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) {
                subArrays++;
            }

            int rem = sum - k;
            if (map.containsValue(rem)) {
                subArrays++;
            }

            map.put(i, sum);
        }
        map.forEach((key, value) -> System.out.println(key + " : " + value));
        return subArrays;
    }

    public static void main(String[] args) {
        int n = 0;
        int arr[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int subArrays = subarraySum(arr, n);
        System.out.printf("After sorting array: %d", subArrays);
    }
}