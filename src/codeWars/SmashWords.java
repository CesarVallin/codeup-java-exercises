package codeWars;

import java.util.Arrays;

public class SmashWords {

    /**
     * Sentence Smash
     * Write a function that takes an array of words and smashes them together into a sentence and returns the sentence. You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word. Be careful, there shouldn't be a space at the beginning or the end of the sentence!
     *
     * Example
     * ['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'*/

    public static String smash(String... words) {
        // TODO Write your code below this comment please
        String joined = String.join("+", words); // join is a String method!!
        return joined;
    }

    public static void main(String[] args) {
        String [] words = new String[] {"hello", "world", "this", "is", "great"};
        System.out.println(Arrays.toString(words));
        System.out.println(smash(words));
    }

}
