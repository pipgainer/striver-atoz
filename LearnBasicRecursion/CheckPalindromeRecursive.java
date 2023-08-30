package LearnBasicRecursion;

public class CheckPalindromeRecursive {
    static boolean recursiveFunction(int i, String str) {
        if (i >= str.length() / 2)
            return true;
        Character firstChar = str.charAt(i);
        Character secondChar = str.charAt(str.length() - i - 1);
        if (!firstChar.equals(secondChar))
            return false;
        return recursiveFunction(i + 1, str);
    }

    public static boolean isPalindrome(String str) {
        // Write your code here.
        return recursiveFunction(0, str);
    }
}
