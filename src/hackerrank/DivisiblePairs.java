package hackerrank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DivisiblePairs {


    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1, 3, 2, 6, 1, 2);

        System.out.println(divisibleSumPairs(6, 3, integers));
        System.out.println("Expected 5");
        System.out.println("\n");
        System.out.println(divisibleSumPairs2(6, 3, integers));
        System.out.println("Expected 5");

    }


    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int counter = 0;
        int index = 0;

        do {
            for (int i = 0; i < ar.size(); i++) {
                System.out.println(ar.get(index) + " " + ar.get(i));
                if (ar.get(index) < ar.get(i) && ( (ar.get(index) + ar.get(i) ) % k == 0)) {
                    counter++;
                }
            }
            index++;
        } while(index < n);

        return counter;

    }

    /** Code below comparing values without having to double compare...*/

    public static int divisibleSumPairs2(int n, int k, List<Integer> ar) {
        int counter = 0;

        for (int i = 0; i < ar.size() - 1; i++) {
            for (int j = i + 1; j < ar.size(); j++) {
                System.out.println(ar.get(i) + " " + ar.get(j));
                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    counter++;
                }
            }
        }

        return counter;
    }

}
