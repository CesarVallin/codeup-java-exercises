package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {
    public static void main(String[] args) {
        Collections.addAll(test1, 4, 6, 5, 3, 3, 1);
        Collections.addAll(test2, 1, 2, 2, 3, 1, 2);

        System.out.println(pickingNumbers(test1));
        System.out.println(pickingNumbers(test2));

        System.out.println(pickingNumbers2(test1));
        System.out.println(pickingNumbers2(test2));


    }
    /** Test array*/
    private static List<Integer> test1 = new ArrayList<>();
    private static List<Integer> test2 = new ArrayList<>();
    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    /**
     * Passed all tests
     * */
    public static int pickingNumbers(List<Integer> a) {
        int[] frequency = new int[101]; // Since the numbers are between 1 and 100

        for (int num : a) {
            System.out.println("frequency[num]" + frequency[num]);
            frequency[num]++; // each index holds the count of occurrences of its corresponding number in the input list. It's used to efficiently keep track of how many times each number appears in the list.
        }

        int maxLength = 0;

        for (int i = 1; i < 101; i++) {
            maxLength = Math.max(maxLength, frequency[i] + frequency[i - 1]);
        }

        return maxLength;
    }



    /**Passed most test cases: */
    public static int pickingNumbers2(List<Integer> a) {
        // Write your code here
        int counterChamp = 0;
        for (int i = 0; i < a.size(); i++) {
            int compareCount = 0;

            for (int j = 0; j < a.size(); j++) {
                if (i == j) {
                    continue;
                }
                if(Math.abs(a.get(i) - a.get(j)) <= 1) {
                    compareCount ++;
                }
            }
            if(compareCount > counterChamp) {
                counterChamp = compareCount;
            }
        }
        return counterChamp;
    }
}
