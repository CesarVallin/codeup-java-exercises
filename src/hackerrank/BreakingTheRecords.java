package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BreakingTheRecords {
    public static void main(String[] args) {
        Collections.addAll(test1, 10, 5, 20, 20, 4, 5, 2, 25, 1);

        System.out.println(breakingRecords(test1));

    }

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */
    /** To be utilized as a test */
    private static List<Integer> test1 = new ArrayList<>();

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        List<Integer> result = new ArrayList<>();

        int highScore = scores.get(0);
        int aboveHighCounter = 0;
        int lowScore = scores.get(0);
        int belowLowCounter = 0;

        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) > highScore) {
                highScore = scores.get(i);
                aboveHighCounter++;
            }
            if (scores.get(i) < lowScore) {
                lowScore = scores.get(i);
                belowLowCounter++;
            }
        }
        result.add(aboveHighCounter);
        result.add(belowLowCounter);
        return result;
    }
}
