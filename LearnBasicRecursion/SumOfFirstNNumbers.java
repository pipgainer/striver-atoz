package LearnBasicRecursion;

public class SumOfFirstNNumbers {
    public static long sumFirstN(long n) {
        return n * (n + 1) / 2;
    }

    public static void sumFirstNWithParameterRecursion(long i, long sum) {
        if (i < 1) {
            System.out.printf("%d ", sum);
            return;
        }
        sumFirstNWithParameterRecursion(i - 1, sum + i);
    }

    public static long sumFirstNWithFunctionalRecursion(long n) {
        if (n == 0) {
            return 0;
        }
        return n + sumFirstNWithFunctionalRecursion(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumFirstNWithFunctionalRecursion(5));
    }
}
