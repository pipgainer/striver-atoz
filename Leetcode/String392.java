package Leetcode;

public class String392 {
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;
        if (t.length() == 0)
            return false;

        int subCharIndex = 0;

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(subCharIndex)) {
                subCharIndex++;
                if (subCharIndex == s.length()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String t = "ahbgdc";
        String s = "abc";
        boolean result = isSubsequence(s, t);
        System.out.println(result);
    }
}
