package String;

import java.util.HashMap;

public class Isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            Character chS = s.charAt(i);
            Character chT = t.charAt(i);

            if (mapST.containsKey(chS) && mapST.get(chS) != chT || mapTS.containsKey(chT) && mapTS.get(chT) != chS) {
                return false;
            }

            mapST.put(chS, chT);
            mapTS.put(chT, chS);
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo", "bar"));
    }
}
