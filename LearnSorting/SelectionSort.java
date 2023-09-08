import java.util.Scanner;

class SelectionSort {

    public static void main(String[] args) {

        int[] arr = { 8, 6, 2, 5, 1 };

        for (int i = 0; i < arr.length - 1; i++) {

            int tempMinimumIndex = i;

            for (int j = i; j < arr.length; j++) {

                if (arr[j] < arr[tempMinimumIndex]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}