package hackerrank;

import java.util.List;

public class GradingStudents {

    public static void main(String[] args) {
        System.out.println(round(74, 5));

        System.out.println(difference(77));

        System.out.println(roundUpYesNo(77));


    }

//    public static List<Integer> gradingStudents(List<Integer> grades) {
//        // Write your code here
//
//    }

    public static int roundUpYesNo(int grade) {
        int difference = difference(grade);
        if (difference < 3) {
            difference = (int) (Math.round(grade / 5) * 5) + 5;
            return difference;
        } else {
            return grade;
        }
    }

    public static int difference(int grade) {
        int gradeComparator = 0;
        int gradeDifference = 0;
        for (int i = 0; i < 100; i++) {
            gradeComparator += i % 5;
            if (gradeComparator > grade) {
                gradeDifference = gradeComparator - grade;
                break;
            }
        }
        return gradeDifference;
    }

    public static int round(int grade, int multiple5) {
        return (int) Math.round(grade / multiple5) * multiple5;
    }

}
