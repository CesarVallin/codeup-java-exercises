import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static int random1To100() {
        double randomNumberStart = Math.floor(Math.random() * 100) + 1;
        int randomNumber = (int) randomNumberStart;
        System.out.println(randomNumber);
        return randomNumber;
    }
    public static void highLow(int guessedNumber, int randomNumber) {
          if (guessedNumber < randomNumber) {
              System.out.println("HIGHER");
          } else if (guessedNumber > randomNumber) {
              System.out.println("LOWER");
          } else if (guessedNumber == randomNumber) {
              System.out.println("GOOD GUESS!");
          }
    }
    public static int welcomeToGame() {
        Scanner scan = new Scanner(System.in);
        int userNumber;
        do {
            System.out.println("Enter a number between 1 and 100");
            userNumber = scan.nextInt();
            System.out.println(userNumber);
            if (userNumber < 1 || userNumber > 100) {
                System.out.println("Not a valid number");
            }
        } while (userNumber < 1 || userNumber > 100);
        System.out.println(userNumber);
        return userNumber;
    }




    public static void main(String[] args) {
        int randomNumber = random1To100();
        System.out.println(randomNumber + "random number main");
        int validation;
        do {
            validation = welcomeToGame();
            highLow(validation, randomNumber);
        } while(validation != randomNumber);

    }
}
