public class RecursiveInsertionSort {

    public static void recursive_insertion_sort(int[] arr, int i, int n) {
        if (n == i)
            return;
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        recursive_insertion_sort(arr, i + 1, n);
    }

    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        int n = arr.length;
        System.out.println("Before Using Insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        recursive_insertion_sort(arr, 0, n);

        System.out.println("After Insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
