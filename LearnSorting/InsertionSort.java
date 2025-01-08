public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 0, 6 };

        for (int i = 0; i < arr.length; i++) {

            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
