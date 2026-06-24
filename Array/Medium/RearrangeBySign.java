package Array.Medium;

import java.util.Arrays;

public class RearrangeBySign {
    public static void main(String[] args) {
        int arr[] = { 3, 1, -2, -5, 2, -4 };
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }

    public static int[] rearrangeArray(int[] nums) {
        int posArray[] = new int[nums.length / 2];
        int negArray[] = new int[nums.length / 2];
        int resultArray[] = new int[nums.length];
        int posIndex = 0;
        int negIndex = 0;
        for (int i : nums) {
            if (i > 0) {
                posArray[posIndex] = i;
                posIndex++;
            } else {
                negArray[negIndex] = i;
                negIndex++;
            }
        }
        posIndex = 0;
        negIndex = 0;
        int it = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            resultArray[it] = posArray[i];
            resultArray[it + 1] = negArray[i];
            it += 2;
        }
        return resultArray;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
