package String;

public class Reverse {
    public static void main(String[] args) {
        String str = "the sky is blue";
        String resultString = "";
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            // System.out.printf("%s", r);
            if (str.charAt(i) == ' ') {
                if (word != "") {
                    resultString = word + " " + resultString;
                }
                word = "";
            } else {
                word += str.charAt(i);
                if (i == str.length() - 1) {
                    resultString = word + " " + resultString;
                }
            }
        }
        System.out.printf("%s", resultString);
    }
}
