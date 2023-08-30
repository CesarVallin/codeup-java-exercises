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

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int counterChamp = 0;
        for (int i = 0; i < a.size(); i++) {
            int compareCount = 0;

            for (int j = 0; j < a.size(); j++) {
                if(Math.abs(a.get(i) - a.get(j)) == 0 || Math.abs(a.get(i) - a.get(j)) == 1) {
                    compareCount ++;
                }
            }
            if(compareCount > counterChamp) {
                counterChamp = compareCount;
            }
        }
        return counterChamp - 1;
    }
}
