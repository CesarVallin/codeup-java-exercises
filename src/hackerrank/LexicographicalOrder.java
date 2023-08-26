package hackerrank;

public class LexicographicalOrder {
    public static void main(String[] args) {
        testAscii(test1);
        System.out.println(getSmallestAndLargest(test1, 3));

    }
    private static String test1 = "welcometojava";

    public static String getSmallestAndLargest(String s, int k) {
        String currentSubstring = s.substring(0, k);
        String smallest = currentSubstring;
        String largest = currentSubstring;

        for (int i = 0; i <= s.length() - k; i++) {
            currentSubstring = s.substring(i, i + k);
            if (currentSubstring.compareTo(smallest) < 0) {
                smallest = currentSubstring;
            }
            if (currentSubstring.compareTo(largest) > 0) {
                largest = currentSubstring;
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
