package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradingStudents {

    public static void main(String[] args) {
//        System.out.println(round(76, 5));
//        System.out.println(difference(78));
//        System.out.println(roundUpYesNo(78));

        Collections.addAll(grades, 73, 67, 38, 33);

        System.out.println(grades);
        List<Integer> sampleList = gradingStudents(grades);
        System.out.println(sampleList);


    }

    private static List<Integer> grades = new ArrayList<>();



    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> roundedGrades = new ArrayList<>();
        for(Integer grade: grades) {
            if (grade < 38) {
                roundedGrades.add(grade);
            } else {
                roundedGrades.add(roundUpYesNo(grade));
            }
        }
        return roundedGrades;
    }

    /**
     * Check out ST_notes > JAVA > JAVA-continuED > round-up-to5
     *
     * */
    public static int roundUpYesNo(int grade) {
        int actualDifference = difference(grade);
        int roundUpGrade;
        if (actualDifference < 3) {
            roundUpGrade = (int) (Math.round((float) grade / 5) * 5);
            return roundUpGrade;
        } else {
            return grade;
        }
    }

    /**
     * Pay attention to the way that your loop is set up.
     * This one works, however you had to troubleshoot the previous set-up.
     * In this correct set up, you are iterating every 5th index, and adding 5 to `gradeComparator`.
     *
     * */

    public static int difference(int grade) {
        int gradeComparator = 0;
        int gradeDifference = 0; // Not activated until condition is met.
        for (int i = 0; i < 100; i += 5) {
            gradeComparator += 5;
            if (gradeComparator > grade) {
                gradeDifference = gradeComparator - grade;
                break;
            }
        }
        return gradeDifference;
    }

    /** Not in use
     * Just an example of how you can round up to any number of choice (divisible by for example)
     * */
    public static int round(int grade, int multiple5) {
        return (int) Math.round(grade / multiple5) * multiple5;
    }

}
