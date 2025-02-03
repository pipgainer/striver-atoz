package Array;

public class LargestElementInArray {
    public static int largest(int[] arr) {
        // code here
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 1, 7, 43, 2, 786 };
        int largest = largest(arr);
        System.err.println(largest);
    }

}