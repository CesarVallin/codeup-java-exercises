package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import static java.util.Collections.singletonMap;
import static java.util.Collections.singleton;
import util.Input;

public class GradesApplication {




    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student cesar = new Student("Cesar");
        cesar.addGrade(89);
        cesar.addGrade(78);
        cesar.addGrade(93);

        Student luis = new Student("Luis");
        luis.addGrade(93);
        luis.addGrade(94);
        luis.addGrade(77);

        Student sam = new Student("Sam");
        sam.addGrade(93);
        sam.addGrade(94);
        sam.addGrade(77);

        Student steve = new Student("Steve");
        steve.addGrade(99);
        steve.addGrade(95);
        steve.addGrade(97);

        students.put("CesarVallin", cesar);
        students.put("luisEzquivel11", luis);
        students.put("SamR0429", sam);
        students.put("fireWire", steve);

        /** displays all of them */
//        System.out.println(students.keySet());

        /** pg 834 */
//        for (Map.Entry<String, Student> entry : students.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

        /** Provides it all ... */
//        for (String student : students.keySet()) {
//            Student username = students.get(student);
//            System.out.println("Student: " + username.getName() + "\ngrades: " + username.getGrades() + "\ngrade average: " + username.getGradeAverage() + " ");
//
//        }

        /** Discovery */
//        System.out.println(Set.of(cesar));
//        System.out.println(singleton(students));
//        System.out.println(singletonMap("CesarVallin", cesar.getName()+cesar.getGrades()+cesar.getGradeAverage()));
        Input input = new Input();
        System.out.println("\nWelcome!\nHere are the GitHub usernames of our students\n\n" + students.keySet());
        do {
            String userResponse = input.getString("What Student would you like to see more information on?");
            if (!students.containsKey(userResponse)) {
                System.out.println("Sorry, no student found with the GitHub username of " + userResponse);
            }
            if (students.containsKey(userResponse)) {
                Student username = students.get(userResponse);
                System.out.println("Name: " + username.getName() + " - " + "GitHub Username: " + userResponse);
                System.out.println("Current average: " + username.getGradeAverage());
                System.out.println("Overall grades: " + username.getGrades());
            }
        }while(input.yesNo("Would you like to look for another student? [y/N]"));





    }
}
