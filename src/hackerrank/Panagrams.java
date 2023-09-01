package hackerrank;

import java.util.Arrays;

public class Panagrams {
    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
    }

    public static String pangrams(String s) {
        // Write your code here
        final int ALPHABET_COUNT = 26;

        Boolean[] alphabetArray = new Boolean[ALPHABET_COUNT]; // 26 letters in alphabet
        Arrays.fill(alphabetArray, false); // Filling every index of the Boolean[] alphabet array with false

        int alphabetIndex = 0;

        s = s.toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                alphabetIndex = s.charAt(i) - 'A';
                alphabetArray[alphabetIndex] = true;
            }
        }
        for (boolean trueElement : alphabetArray) {
            if(!trueElement) {
                return "not pangram";
            }
        }
        return "pangram";
    }
}
