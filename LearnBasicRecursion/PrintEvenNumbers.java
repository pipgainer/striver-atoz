package LearnBasicRecursion;

import java.util.Scanner;

public class PrintEvenNumbers {

    static void recursiveFunction(int number, int n) {
        if (number >= n) {
            return;
        }
        recursiveFunction(number + 2, n);
        System.out.println(number + 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        recursiveFunction(0, n);
    }
}
