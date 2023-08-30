package LearnBasicRecursion;

import java.util.ArrayList;
import java.util.List;

public class FactorialOfNNumbers {

    public static long factorial(long n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        List<Long> list = new ArrayList<>();
        long startingNumber = 1;
        long fact = factorial(startingNumber);

        while (fact <= n) {
            list.add(fact);
            startingNumber++;
            fact = factorial(startingNumber);
        }
        return list;
    }
}
