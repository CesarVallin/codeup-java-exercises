package codeWars;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static String firstNonRepeatingLetter(String s) {

        /**
         * This Version uses a hash map
         * */

            // Create a HashMap to store character counts
            Map<Character, Integer> charCount = new HashMap<>();

            // Count occurrences of each character
            // Converting String `s` into an array of characters.
            for (char ch : s.toCharArray()) {
                // Check if the character exists in the map
                if (charCount.containsKey(ch)) {
                    // If it exists, increment its count
                    charCount.put(ch, charCount.get(ch) + 1);
                } else {
                    // If it doesn't exist, add it with a count of 1
                    charCount.put(ch, 1);
                }
            }

            // Find the first non-repeating character
            for (char ch : s.toCharArray()) {
                if (charCount.get(ch) == 1) {
                    return String.valueOf(ch);
                }
            }

            // Return an empty string if all characters are repeating
            return "";

        /**
         * *******************************************************
         * */

    }

}

/** Works using ASCII Character values
        * */

//        // Convert the string to lowercase for case insensitivity
//        String lowercaseStr = s.toLowerCase();
//
//        // Create an array to store the count of each character
//        int[] count = new int[256]; // Assuming ASCII characters
//        System.out.println(Arrays.toString(count));
//
//        // Count occurrences of each character
//        for (int i = 0; i < lowercaseStr.length(); i++) {
//            char ch = lowercaseStr.charAt(i);
//            count[ch]++;
//        }
//        System.out.println(Arrays.toString(count));
//
//        // Find the first non-repeating character
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (count[Character.toLowerCase(ch)] == 1) {
//                return String.valueOf(ch);
//            }
//        }
//
//        // Return an empty string if all characters are repeating
//        return "";

/**
 * *******************************************************
 * */
