package KnowBasicMath;

import java.util.Scanner;

/**
 * SumOfAllDivisors
 */
public class SumOfAllDivisors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        int n = scanner.nextInt();

        for (int j = 1; j <= n; j++) {
            for (int i = 1; i * i <= j; i++) {
                if (j % i == 0) {
                    sum += i;
                    if (j / i != i) {
                        sum += j / i;
                    }
                }
            }
        }

        System.out.println(sum);
    }
}