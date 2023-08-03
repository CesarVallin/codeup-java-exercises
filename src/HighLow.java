import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static int random1To100() {
        double randomNumberStart = Math.floor(Math.random() * 100) + 1;
        int randomNumber = (int) randomNumberStart;
        return randomNumber;
    }
    public static int welcomeToGame() {
        Scanner scan = new Scanner(System.in);
        int userNumber;
        do {
            System.out.println("Enter a number between 1 and 100");
            userNumber = scan.nextInt();
            if (userNumber < 1 || userNumber > 100) {
                System.out.println("Not a valid number");
            }
        } while (userNumber < 1 || userNumber > 100);
//        scan.close();
        return userNumber;
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

    public static void playGame() {
        int randomNumber = random1To100();
        System.out.println(randomNumber + " random number main- before do while");
        int validation;
        int counter = 0;
        do {
            validation = welcomeToGame();
            highLow(validation, randomNumber);
            counter++;
            System.out.println("Attempt:  " + counter);
            if (counter == 4) {
                System.out.println("Last try! make it count!!");
            }
        } while(validation != randomNumber && counter < 5);
        System.out.println(randomNumber + " random number main- after do while");

    }


    public static void main(String[] args) {
        playGame();

    }
}
