public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 2, 13, 4, 1, 3, 6, 28 };

        for (int i = arr.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Revision
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
