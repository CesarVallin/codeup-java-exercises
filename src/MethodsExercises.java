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
    //



    public static void main (String[] args) {
        // -------------------------------------------------------------------------------------------
        // 1. Basic arithmetic
//        System.out.println(multiply(3, 4));
//        System.out.println(multiplicationByLoop(3, 4));
//        System.out.println(divide(10, 5));
//        System.out.println(add(2, 2));
//        System.out.println(subtract(4, 3));
//        System.out.println(modulus(4, 2));
        // -------------------------------------------------------------------------------------------
        // 2. Method validates input
        int userInput = getInteger(1, 10);
        // -------------------------------------------------------------------------------------------
        // 3. Factorial



    }
}
