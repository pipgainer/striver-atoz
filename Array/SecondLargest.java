package Array;

import java.io.*;
import java.util.Arrays;

public class SecondLargest {

    public static int secondLargest(int[] arr, int n) {
        // code here
        if (n < 2)
            return -1;
        int large = arr[0];
        int second_large = -1;
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] > large) {
                second_large = large;
                large = arr[i];
            }

            else if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        return second_large;
    }

    public static void main(String[] args) {

        int arr[] = { 12, 35, 1, 10, 34, 1 };
        int secondLargest = secondLargest(arr, arr.length);
        System.err.printf("%d", secondLargest);
    }
}
