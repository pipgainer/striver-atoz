package String;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class Anagram {
    public static boolean isAnagram(String str1, String str2) {

        // Case: when both of the strings have different lengths
        if (str1.length() != str2.length())
            return false;

        // Initialize a frequency array to store character counts
        int[] freq = new int[100];

        // Count frequency of each character in str1
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i) - 'A');
            freq[str1.charAt(i) - 'A']++; // Increment frequency for each character in str1
        }

        System.out.println(Arrays.toString(freq));

        // Decrement frequency for each character in str2
        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i) - 'A']--; // Decrement frequency for each character in str2
        }

        // Check if all frequencies are zero, meaning both strings have the same
        // characters
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) // If any frequency is non-zero, they are not anagrams
                return false;
        }

        return true;

        // My Solution
        // HashMap<Character, Integer> firstMap = new HashMap<>();
        // HashMap<Character, Integer> secondMap = new HashMap<>();

        // if (s.length() != t.length()) {
        // return false;
        // }

        // for (int i = 0; i < s.length(); i++) {
        // if (firstMap.containsKey(s.charAt(i))) {
        // firstMap.put(s.charAt(i), firstMap.get(s.charAt(i)) + 1);
        // } else {
        // firstMap.put(s.charAt(i), 1);
        // }

        // if (secondMap.containsKey(t.charAt(i))) {
        // secondMap.put(t.charAt(i), secondMap.get(t.charAt(i)) + 1);
        // } else {
        // secondMap.put(t.charAt(i), 1);
        // }
        // }

        // // for (int i = 0; i < t.length(); i++) {

        // // }

        // System.out.println(firstMap);
        // System.out.println(secondMap);

        // if (firstMap.equals(secondMap)) {
        // return true;
        // } else {
        // return false;
        // }
    }

    public static void main(String[] args) {
        System.out.printf("%b", isAnagram("anagram", "nagaram"));
    }
}
