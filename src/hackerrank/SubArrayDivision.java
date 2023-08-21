package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubArrayDivision {

    public static void main(String[] args) {

        Collections.addAll(numbers, 1, 2, 1, 3, 2);

        System.out.println("Answer is " + birthday(numbers, 3, 2));

    }


    private static List<Integer> numbers = new ArrayList<>();

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int counter = 0;
        int comparison;
            for (int i = 0; i < s.size() - m; i++) {
                comparison = 0;
                for (int j = i; j <= m; j++) { // takes care of iterating up to the last index... if m is less than your current loop index, loop never runs
                    comparison += s.get(j);
                }
                if(comparison == d){
                    counter ++;
                }
            }

        return counter;
    }
}
