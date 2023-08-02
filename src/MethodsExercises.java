import java.util.Scanner;

public class MethodsExercises {
    // -------------------------------------------------------------------------------------------
    // 1. Basic arithmetic
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        return a / b;
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int modulus(int a, int b) {
        return a % b;
    }
    public static int multiplicationByLoop (int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

    public static int recursionMultiply (int base, int exponent) {
        if (base == 0 || exponent == 0) {
            return 0;
        }
        return base + recursionMultiply(base, exponent -1);
    }
    // -------------------------------------------------------------------------------------------
    // 2. Method validates input
    public static int getInteger(int min, int max) {
        Scanner sc1 = new Scanner(System.in);
        int userInput;
        do {
            System.out.println("Enter a number between " + min + " and " + max);
            userInput = sc1.nextInt();
        } while(userInput < min || userInput > max);
        System.out.println("You entered " + userInput);
        return userInput;
    }

    // -------------------------------------------------------------------------------------------
    // 3. Factorial
    public static long factorial(long numb) {
        long counter = 1L;
        for (long i = 1; i <= numb; i++) {
            counter *= i;
            System.out.println(i + "!" + " = " + counter);
        }
        return counter;
    }
    public static long recursionFactorial(long numb) {
        System.out.println(numb);
        if (numb == 1) { // Called Base Case
            return numb;
        }
        return numb * recursionFactorial(numb - 1);
    }
    // -------------------------------------------------------------------------------------------
    // 4. dice roll game
    public static String rollDice(int userDiceRoll) {
        double diceRollA = Math.floor(Math.random() * userDiceRoll) + 1; // It is still a double, just rounded down.  You could either cast it here, start diceRollA as an int , then cast it right of the declaration assignment, or cast it as below...
        double diceRollB = Math.floor(Math.random() * userDiceRoll) + 1;
        int output1 = (int) diceRollA;
        int output2 = (int) diceRollB;
        String completeRoll = output1 + " " + output2;
        System.out.println(completeRoll);
        return completeRoll;
    }

    public static void askUserToRoll() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of sides for a pair of dice:  ");
        int userResponse = scan.nextInt();
        String rollResonse;
        do {
            System.out.println("Roll the dice? [y/N]");
            rollResonse = scan.next();
            System.out.println(rollResonse);
            if (rollResonse.equalsIgnoreCase("y")) {
                System.out.println(rollDice(userResponse));
            } else {
                break;
            }
        } while(true);

    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        // -------------------------------------------------------------------------------------------
        // 1. Basic arithmetic
//        System.out.println(multiply(3, 4));
//        System.out.println(multiplicationByLoop(3, 4));
//        System.out.println(recursionMultiply(4, 3));
//        System.out.println(divide(10, 5));
//        System.out.println(add(2, 2));
//        System.out.println(subtract(4, 3));
//        System.out.println(modulus(4, 2));
        // -------------------------------------------------------------------------------------------

//        long recursionFactorialVar = recursionFactorial(4);
//        System.out.println(recursionFactorialVar);
        // 2 & 3
//        String goAgain;
//        do {
//            // 2. Method validates input
//            int userInput = getInteger(1, 10);
//            // -------------------------------------------------------------------------------------------
//            // 3. Factorial
//            long factorialVar = factorial(userInput);
//            System.out.println(factorialVar);
//
//            System.out.println("Would you like another factorial? [y/N]");
//            goAgain = scanner.nextLine();
//        } while(goAgain.equalsIgnoreCase("y"));



        askUserToRoll();








    }
}
