package codeWars;

public class FirstNonRepeatingCharacter {

    public static String firstNonRepeatingLetter(String s) {

        // Convert the string to lowercase for case insensitivity
        String lowercaseStr = s.toLowerCase();

        // Create an array to store the count of each character
        int[] count = new int[256]; // Assuming ASCII characters

        // Count occurrences of each character
        for (int i = 0; i < lowercaseStr.length(); i++) {
            char ch = lowercaseStr.charAt(i);
            count[ch]++;
        }

        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (count[Character.toLowerCase(ch)] == 1) {
                return String.valueOf(ch);
            }
        }

        // Return an empty string if all characters are repeating
        return "";

    }

}
