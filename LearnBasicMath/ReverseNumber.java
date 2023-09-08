package LearnBasicMath;

public class ReverseNumber {

    public static long reverseBits(long n) {
        // Write your code here
        String convertedString = decimalToBinary(n);
        String reversedString = reverseString(convertedString);
        long convertBinaryToDecimal = Long.parseLong(reversedString, 2);
        System.out.println(convertBinaryToDecimal);
        return convertBinaryToDecimal;
    }

    public static String decimalToBinary(long n) {

        long number = n;
        int minLength = 32;

        String binaryString = Long.toBinaryString(number);

        if (binaryString.length() < minLength) {
            int paddingLength = minLength - binaryString.length();
            String paddingZeros = "0".repeat(paddingLength);
            binaryString = paddingZeros + binaryString;
        }

        return binaryString;
    }

    public static String reverseString(String str) {
        String reversedString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }

        return reversedString;

    }

    public static void main(String[] args) {
        reverseBits(12);
    }
}
