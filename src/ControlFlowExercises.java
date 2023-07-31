import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // ----------------------------------------------------------------------------------------
//        // While loop:
//        int i = 5;
//        while(i <= 15) {
//            System.out.println(i);
//            i++;
//        }

        // ----------------------------------------------------------------------------------------
        // Do while loop:
//        // by 2s...
//        int i = 0;
//        do {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        } while (i <= 100);
        // by 5s
//        int i = 100;
//        do {
//            if (i % 5 == 0) {
//                System.out.println(i);
//            }
//            i--;
//        } while (i >= 5);
//        // Squared
//        long i = 2L;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);
        // ----------------------------------------------------------------------------------------
        // For loops:
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
//        // By 2s
//        for (int i = 0; i <= 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//        // By 5s
//        for (int i = 100; i >= 5; i--) {
//            if (i % 5 == 0) {
//                System.out.println(i);
//            }
//        }
        // Squared
//        for (long i = 2L; i < 1000000; i *= i) {
//            System.out.println(i);
//        }
        // ----------------------------------------------------------------------------------------
//        // FizzBuzz
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//
//        }
        // ----------------------------------------------------------------------------------------
//        // Table of powers...
//        System.out.print("Would you like to enter an integer? [y/N]  ");
//        String userResponse = scanner.nextLine();
//        boolean responseYes = userResponse.equalsIgnoreCase("y");
//        if(responseYes) {
//            System.out.println("Enter an integer:  ");
//            int userInteger = scanner.nextInt();
//            for (int i = 1; i <= userInteger; i++) {
//                if (i == 1) {
//                    System.out.println("number | squared | cubed");
//                    System.out.println("------ | ------- | -----");
//                    System.out.format( "%-7d| %-8d| %-5d", i, i, i);
//                }
//                if (i > 1) {
//                    System.out.format("%n%-7d| %-8d| %-5d", i, (i * i), (i * i * i));
//                }
//            }
//        } else {
//            System.out.println("Maybe next time!");
//            System.exit(0);
//        }
        // ----------------------------------------------------------------------------------------
        // Number Grade into letters...

        boolean wackyResponse = false;

        do {
            System.out.print("Enter your numerical grade:  ");
            int grade = scanner.nextInt();
            if (grade > 100 || grade < 0) {
                wackyResponse = true;
            }

            if (grade >= 99 && grade <= 100) {
                System.out.format("Your grade: %d, is an A+", grade);
                break;
            } else if (grade >= 88 && grade < 99) {
                System.out.format("Your grade: %d, is an A", grade);
                break;
            } else if (grade >= 80 && grade < 88) {
                System.out.format("Your grade: %d, is a B", grade);
                break;
            } else if (grade >= 67 && grade < 80) {
                System.out.format("Your grade: %d, is a C", grade);
                break;
            } else if (grade >= 60 && grade < 67) {
                System.out.format("Your grade: %d, is a D", grade);
                break;
            } else if (grade > 0 && grade < 60) {
                System.out.format("Your grade: %d, is an F", grade);
                break;
            } else {
                System.out.format("Your response is not allowed, loop again %n");
            }
        } while (wackyResponse);


//        System.out.print("Enter your numerical grade:  ");
//        int grade = scanner.nextInt();
//        if (grade > 100 || grade < 0) {
//            wackyResponse = true;
//        }
//
//        if (grade >= 99) {
//            System.out.format("Your grade: %d, is an A+", grade);
//        } else if (grade >= 88 && grade < 99) {
//            System.out.format("Your grade: %d, is an A", grade);
//        } else if (grade >= 80 && grade < 88) {
//            System.out.format("Your grade: %d, is a B", grade);
//        } else if (grade >= 67 && grade < 80) {
//            System.out.format("Your grade: %d, is a C", grade);
//        } else if (grade >= 60 && grade < 67) {
//            System.out.format("Your grade: %d, is a D", grade);
//        } else if (grade >= 0 && grade < 60) {
//            System.out.format("Your grade: %d, is an F", grade);
//        } else {
//            System.out.format("Your response is not allowed, loop again");
//        }

















    }
}
