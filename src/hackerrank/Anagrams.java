package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagrams {

    public static void main(String[] args) {
//        System.out.println(isAnagram("anagram", "margana"));

//        System.out.println(isAnagram2("anagramm", "marganaa"));

        System.out.println(isAnagram3("anagramm", "marganaa"));
    }



    static boolean isAnagram(String a, String b) {
        // Complete the function
        int totalNumbers = 0;
        int lowSubString = 0;
        int highSubString = 1;
        for (int i = 0; i < a.length(); i++) {
            System.out.println("lowSubString... " + lowSubString + " highSubString..." + highSubString);
            if (b.toLowerCase().contains(a.toLowerCase().substring(lowSubString, highSubString))) {
                totalNumbers ++;
                lowSubString ++;
                highSubString ++;
            }
            System.out.println(totalNumbers);
        }
        System.out.println("totalNumbers: " + totalNumbers);
        System.out.println("a.length(): " + a.length());
        System.out.println("b.length(): " + b.length());
        if (totalNumbers == a.length()) {
            return true;
        }
        return false;

    }

    static boolean isAnagram2(String a, String b) {
        List<String> stringA = new ArrayList<>();
        Collections.addAll(stringA, a.toLowerCase().split(""));
        Collections.sort(stringA);

        List<String> stringB = new ArrayList<>();
        Collections.addAll(stringB, b.toLowerCase().split(""));
        Collections.sort(stringB);
        for (int i = 0; i < stringA.size(); i++) {
            if (!stringA.get(i).equals(stringB.get(i))) {
                return false;
            }
            System.out.println("string A: " + i + " " + stringA.get(i));
            System.out.println("string B: " + i + " " + stringB.get(i));
        }
        return true;
    }

    static boolean isAnagram3(String a, String b) {
        char [] arrA = a.toCharArray();
        char [] arrB = b.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i] != arrB[i]) {
                System.out.println("char [] arrA " + i + " " + arrA[i]);
                System.out.println("char [] arrB " + i + " " + arrB[i]);
                return false;
            }
        }
        return true;

    }


}
