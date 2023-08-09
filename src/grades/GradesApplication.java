package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import static java.util.Collections.singletonMap;
import static java.util.Collections.singleton;
import util.Input;

public class GradesApplication {

    private static int gradesAppMenu() {
        Input input1 = new Input();
        System.out.println("0 - exit ");
        System.out.println("1 - See class average");
        System.out.println("2 - See individual students");
        int menuOption = input1.getInt("Please pick an option: ");
        return menuOption;
    }

    private static String whichStudent() {
        Input input = new Input();
        String userResponse = input.getString("\nWhat Student would you like to see more information on?");
        return userResponse;
    }
    private static void studentInfo(Student username, String response) {
        System.out.println("Name: " + username.getName() + " - " + "GitHub Username: " + response);
        System.out.println("Current average: " + username.getGradeAverage());
        System.out.println("Overall grades: " + username.getGrades());
    }
    private static boolean continueLooking() {
        Input input = new Input();
        boolean keepGoing = input.yesNo("Would you like to look for another student? [y/N]");
        return keepGoing;
    }

    private static boolean continueApp() {
        Input input = new Input();
        boolean keepGoing = input.yesNo("\nWould you like to back to the menu? [y/N]");
        return keepGoing;
    }

    private static double classGradeAverage(HashMap<String, Student> students) {
        double total = 0;
        double counter = 0;
        for (String student : students.keySet()) {
            Student value = students.get(student);
            total += value.getGradeAverage();
            counter += 1;
        }
        return total / counter;
    }

    private static void studentGradesApp(HashMap<String, Student> students) {
        do {
            int menuOption = gradesAppMenu();
            switch (menuOption) {
                case 0:
                    System.out.println("Goodbye and have a wonderful day!");
                    System.exit(0);
                    break;
                case 1:
                    System.out.format("Class average is: %.2f", classGradeAverage(students));
                    break;
                case 2:
                    System.out.println("\nHere are the GitHub usernames of our students\n" + students.keySet());
                    do {
                        String userResponse = whichStudent();
                        if (!students.containsKey(userResponse)) {
                            System.out.println("Sorry, no student found with the GitHub username of " + userResponse);
                        }
                        if (students.containsKey(userResponse)) {
                            Student username = students.get(userResponse);
                            studentInfo(username, userResponse);
                        }
                    } while (continueLooking());
                    break;
            }
        } while(continueApp());

    }


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

        studentGradesApp(students);

        /** displays all of them */
//        System.out.println(students.keySet());

        /** pg 834 */
//        for (Map.Entry<String, Student> entry : students.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }


        /** Iterating and average assignment using Map.Entry */
//        double average = 0;
//        for (Map.Entry<String, Student> entry : students.entrySet()) {
//            System.out.println(average);
//            String key = entry.getKey();
//            Student value = entry.getValue();
//            System.out.println(value.getName());
//            System.out.println(value.getGradeAverage());
//            System.out.println(value.getGrades());
//            average += value.getGradeAverage();
//            System.out.println("Average changed...");
//        }
//        System.out.println(average);

        /** Think of it more of it as a read only iterator..*/
//        students.forEach((key, value) -> {
//            System.out.println(value.getName());
//            System.out.println(value.getGrades());
//            System.out.println(value.getGradeAverage());
//
//        });

    }
}
