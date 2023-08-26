package hackerrank;

public class LexicographicalOrder {
    public static void main(String[] args) {
        testAscii(test1);

    }
    private static String test1 = "welcometojava";

    public static String getSmallestAndLargest(String s, int k) {
        String currentSubstring = s.substring(0, k);
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i <= s.length() - k; i++) {
            for (int j = i + 1; j < k; j++) {

            }
        }

        return smallest + "\n" + largest;
    }

    /**
     * Test trial...
     * Use casting: To get the ASCII value of a character, we can simply cast our char as an int.
     * */
    public static void testAscii(String s) {
        for(int i = 0; i < s.length(); i++) {
            int asciiValue = s.charAt(i);
            System.out.println(s.charAt(i) + " value is: " + asciiValue);
        }
    }
}
