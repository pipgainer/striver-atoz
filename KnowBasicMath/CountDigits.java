package KnowBasicMath;

import java.util.Scanner;

/**
 * CountDigits
 */
public class CountDigits {

    public static int countDigits(int n) {
        // Write your code here.
        int answer = 0;
        int number = n;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && number % digit == 0) {
                answer++;
            }
            n = n / 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countDigits(n));
    }
}