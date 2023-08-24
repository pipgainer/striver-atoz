package KnowBasicMath;

import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tempN = n;
        int lengthOfInteger = Integer.toString(n).length();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, lengthOfInteger);
            n = n / 10;
        }

        if (sum == tempN)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
