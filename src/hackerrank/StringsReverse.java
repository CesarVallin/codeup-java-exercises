package hackerrank;

public class StringsReverse {

    /** Palindrome, pg 190 */
    private static void solution(String word) {
        int low = 0;
        int high = word.length() - 1;
        String forward = "";
        String backward = "";
        for (int i = 0; i < word.length(); i++) {
            forward += word.charAt(low);
            System.out.println(word.charAt(low));
            System.out.println(low);
            low ++;
            backward += word.charAt(high);
            System.out.println(word.charAt(high));
            System.out.println(high);
            high --;
        }
        System.out.println(forward);
        System.out.println(backward);

    }

    /** Hacker Rank example*/
    public static String palindrome(String word){
        int low = 0;
        int high = word.length() - 1;
        String forward = "";
        String backward = "";
        for (int i = 0; i < word.length(); i++) {
            forward += word.charAt(low);
            low ++;
            backward += word.charAt(high);
            high --;
        }
        if(forward.equals(backward)){
            return "Yes";
        }
        return "No";
    }

    public static void main(String[] args) {
        solution("cesar");
    }

}
