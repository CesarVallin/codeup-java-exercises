package grades;

import java.util.ArrayList;
import util.Input;


public class Student {
    /** Instance variables...*/
    private String name;
    private ArrayList<Integer> grades;

    /** Constructor */

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    /** Get name */
    public String getName() {
        return this.name;
    }
    /** Add grade */
    public void addGrade(int grade) {
        this.grades.add(grade);
    }
    /** Get all grades */
    public ArrayList<Integer> getGrades() {
        return grades;
    }

    /** Return the average of the grades */
    public double getGradeAverage() {
        double average = 0;
        for (int i = 0; i < grades.size(); i++) {
            double currentIndexedGrade = grades.get(i);
            average += currentIndexedGrade;
        }
        return average / grades.size();
    }




}
