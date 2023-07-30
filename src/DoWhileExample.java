import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaring variables outside of loop's scope...
        String response;
        boolean responseNo;
        String correctAnswer;

        do {
            System.out.print("Do you understand do while loops??  ");
            response = scanner.nextLine();

            responseNo = response.equalsIgnoreCase("no");
            if (response.equalsIgnoreCase("yes")) {
                correctAnswer = "yes";
                System.out.printf("Because you answered %s, you passed the test!", correctAnswer);
            }
        } while (responseNo);
    }
}
