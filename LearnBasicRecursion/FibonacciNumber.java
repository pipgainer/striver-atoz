package LearnBasicRecursion;

import java.util.Scanner;

public class FibonacciNumber {

    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
        int[] array = new int[n];
        int arrayIndex = 2;

        array[0] = 0;

        if (n < 2) {
            return array;
        }

        array[1] = 1;

        while (arrayIndex < n) {
            array[arrayIndex] = array[arrayIndex - 1] + array[arrayIndex - 2];
            arrayIndex++;
        }

        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] result = generateFibonacciNumbers(n);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
