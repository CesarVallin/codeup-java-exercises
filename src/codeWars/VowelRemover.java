package codeWars;

public class VowelRemover {

    public static String shortcut(String input) {

        String noLowerCaseVowelResult = "";
        String lowerCaseVowels = "aeiou";

        for (int i = 0; i < input.length(); i++) {
            // You can also just write the expression inside the indexOf()
            /**
             * As you are looping through each index of the string, `char c` below will get assigned a new element on each iteration.
             * */
            char c = input.charAt(i);
            if  (lowerCaseVowels.indexOf(c) == -1) {
                noLowerCaseVowelResult += c;
            }
        }

        return noLowerCaseVowelResult;
    }

    /**
     * Also check Troll class in codeWars package.  Similar scenario.
     * Check out SecureTester class for regex example
     * */
}
