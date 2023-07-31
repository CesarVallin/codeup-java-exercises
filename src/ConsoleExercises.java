import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        System.out.format("The value of pi is approximately %s %n%n", pi);

        // nextInt() & nextLong()
        System.out.print("Please enter an integer:  ");
        long userNumber = scanner.nextLong();
        System.out.format("The number you entered is %s %n%n", userNumber);

        System.out.print("Please enter 3 words:  ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.format("You entered: %s, %s, and %s %n%n", firstWord, secondWord, thirdWord);

        // The first scanner.nextLine() refreshes in a way the program.
        scanner.nextLine();
        System.out.print("Please enter a sentence  ");
        String userSentence = scanner.nextLine();
        System.out.format("The sentence you entered is:  %s", userSentence);

        // Calculator...
        scanner.nextLine();
        System.out.print("Please enter the length of your classroom:  ");
//        double length = scanner.nextDouble();
        String roomLength = scanner.nextLine();
        double length = Double.parseDouble(roomLength);
        System.out.print("Please enter the width of your classroom:  ");
        String roomWidth = scanner.nextLine();
        double width = Double.parseDouble(roomWidth);

        double area = length * width;
        double perimeter = (length * 2) + (width * 2);

        System.out.format("The area of your classroom is: %s.  The perimeter is: %s. %n%n", area, perimeter);


    }
}
