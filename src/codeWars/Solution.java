package codeWars;

import java.util.Arrays;

public class Solution {

    /** Convert a string to an array:
     * Write a function to split a string and convert it into an array of words.
     *
     * Examples (Input ==> Output):
     * "Robin Singh" ==> ["Robin", "Singh"]
     *
     * "I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]
     * */

    public static String[] stringToArray(String s) {
        //your code;
        String [] result = s.split(" ");
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray("I love arrays the are my favorite")));

    }
}
