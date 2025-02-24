package Array;

public class SortedArraySearch {
    static boolean searchInSorted(int arr[], int k) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k)
                return true;
        }
        // Your code here
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6 };
        int k = 6;
        boolean present = searchInSorted(arr, k);
        System.out.println(present);
    }
}
