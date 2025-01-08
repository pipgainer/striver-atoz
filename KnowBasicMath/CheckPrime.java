package KnowBasicMath;

import java.util.Scanner;

public class CheckPrime {

    public static boolean isPrime(int num) {
        // Your code goes here
        boolean isPrime = true;
        for (int i = 2; i * i < num; i++) {
            if (num % i == 0 || num / i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
