package KnowBasicMath;

import java.util.Scanner;

public class PalindromeNumber {

    public static boolean palindromeNumber(int n) {
        int tempN = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = (sum * 10) + digit;
            n = n / 10;
        }

        if (tempN == sum)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (palindromeNumber(n))
            System.out.println("true");
        else
            System.out.println("false");
    }

}
