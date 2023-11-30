package codeWars;

public class Troll {
    public static String disemvowel(String str) {
        // Code away...
        String noVowelString = "";
        for (int i = 0; i < str.length(); i++) {
            /**
             * As you are looping through each index of the string, `char c` below will get assigned a new element on each iteration.
             * */
            char c = str.charAt(i);
            if ("aeiouAEIOU".indexOf(c) == -1) {
                noVowelString += c;
            }
        }
        return noVowelString;
    }

    /**
     * Also check VowelRemover class in codeWars package.  Similar scenario
     * Check out SecureTester class for regex example
     * */
}
