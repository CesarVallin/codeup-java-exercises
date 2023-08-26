package hackerrank;

public class LexicographicalOrder {
    public static void main(String[] args) {
        testAscii(test1);

    }
    private static String test1 = "welcometojava";

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }

    public static void testAscii(String s) {
        for(int i = 0; i < s.length(); i++) {
            int asciiValue = s.charAt(i);
            System.out.println(s.charAt(i) + " value is: " + asciiValue);
        }
    }
}
