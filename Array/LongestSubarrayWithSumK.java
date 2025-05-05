package Array;

public class LongestSubArrayWithSumK {

    //Brute force approach:
    // Time complexity: O(n^2)
    // Space complexity: O(1)
    // public static int getLongestSubArray(int[] arr, int k) {
    //     int n = arr.length; // size of the array.

    //     int len = 0;
    //     for (int i = 0; i < n; i++) { // starting index
    //         long s = 0;
    //         for (int j = i; j < n; j++) { // ending index
    //             // add all the elements of
    //             // subarray = a[i...j]:
    //             s += arr[j];

    //             if (s == k)
    //                 len = Math.max(len, j - i + 1);
    //         }
    //     }
    //     return len;
    // };


    //Better approach:
    // Time complexity: O(n)
    // Space complexity: O(n)
    public static int getLongestSubArray(int[] arr, int k) {
        int n = arr.length; // size of the array.

        // HashMap to store the sum and its index.
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();

        // Initialize sum and length of longest subarray.
        int sum = 0;
        int len = 0;

        for (int i = 0; i < n; i++) {
            // Add current element to sum.
            sum += arr[i];

            // If sum is equal to k, update length.
            if (sum == k) {
                len = Math.max(len, i + 1);
            }

            // If sum - k is found in map, update length.
            if (map.containsKey(sum - k)) {
                len = Math.max(len, i - map.get(sum - k));
            }

            // Store the first occurrence of the sum.
            map.putIfAbsent(sum, i);
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 1, 9 };
        int k = 10;
        int len = getLongestSubArray(arr, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
