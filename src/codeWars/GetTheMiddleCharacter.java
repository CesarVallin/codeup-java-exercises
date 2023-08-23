package codeWars;

public class GetTheMiddleCharacter {
    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("testing"));

    }
    /** *
     * "test" returns "es"
     *
     * "testing" returns "t"
     *
     */

    public static String getMiddle(String word) {
        //Code goes here!
        if(word.length() % 2 == 0) {
            return word.substring((word.length() / 2) - 1, (word.length() / 2) + 1);
        }
        return word.substring(  (int)((Math.floor((float)word.length()) / 2)),  (int)(((Math.floor((float)word.length()) / 2) ) + 1) );
    }
}
