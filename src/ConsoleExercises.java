import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f%n", pi);
//
        // nextInt() & nextLong()
//        System.out.print("Please enter an integer:  ");
//        long userNumber = scanner.nextLong();
//        System.out.format("The number you entered is %d%n", userNumber);
//
//        System.out.println("Please enter 3 words, separated by spaces  ");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.format("You entered: %s, %s, and %s %n", firstWord, secondWord, thirdWord);
//
//        // The first scanner.nextLine() refreshes in a way the program.
////        scanner.nextLine();
//        System.out.print("Please enter a sentence  ");
//        String userSentence = scanner.nextLine();
//        System.out.format("The sentence you entered is:  %s", userSentence);

        // Calculator...
//        scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        scanner1.useDelimiter("\n");

        System.out.format("Please enter the length, width, and height of your classroom:  %n");
        String length = scanner1.next();
        double length1 = Double.parseDouble(length);
        String width = scanner1.next();
        double width1 = Double.parseDouble(width);
        String height = scanner1.next();
        double height1 = Double.parseDouble(height);

        double area = length1 * width1;
        double perimeter = (length1 * 2) + (width1 * 2);
        double volume = length1 * width1 * height1;

        System.out.format("The area of your classroom is: %.2f sq-ft.  The perimeter is: %.2f ft. %n", area, perimeter);
        System.out.format("The volume of your classroom is: %.2f cu-ft", volume);

    }
}
