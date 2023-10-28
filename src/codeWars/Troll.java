package codeWars;

public class Troll {
    public static String disemvowel(String str) {
        // Code away...
        String noVowelString = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ("aeiouAEIOU".indexOf(c) == -1) {
                noVowelString += c;
            }
        }
        return noVowelString;
    }
}
