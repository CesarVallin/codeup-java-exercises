package pearsonSingleDarrays;
import java.util.Scanner;
import java.util.Arrays;

public class SingleDarrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ---------------------------------------------------------------------------------------------------------
//        // This statement declares an array variable, myList, creates and array of 10 elements of double type, and assigns its reference to myList.
//        // To assign values to the elements, use the syntax: arrayRefVar[index] = value;
//        double [] myList = new double [10];
//
//        myList[0] = 5.6;
//        myList[1] = 4.5;
//        myList[2] = 3.3;
//        myList[3] = 13.2;
//        myList[4] = 4.0;
//        myList[5] = 34.33;
//        myList[6] = 34.0;
//        myList[7] = 45.45;
//        myList[8] = 99.993;
//        myList[9] = 11123;
//
//        System.out.println("\nAll elements in the array:");
//        for (int i = 0; i < myList.length; i++) {
//            System.out.println(i + " " + myList[i]);
//        }
//        System.out.println("\nConditional statement applied:");
//        for (int i = 0; i < myList.length; i++) {
//            if (myList[i] > 34) {
//                System.out.println(i + " " + myList[i]);
//            }
//        }
        // ---------------------------------------------------------------------------------------------------------

//        // Java shorthand notation, known as array initializers...
//        // Array initializers...
//        double[] myListA = {1.9, 2.9, 3.4, 3.5};
//        for (int i = 0; i < myListA.length; i++) {
//            System.out.println(i + " - " + myListA[i]);
//        }
//        // The new operator is not used in the array-initializer syntax.  Using an array initializer:
//        // you have to declare, create, and initialize the array all in ONE STATEMENT!!!
//        // Splitting it would cause a syntax error.
        // ---------------------------------------------------------------------------------------------------------

//        // Processing Arrays
//        // Initializing arrays with input values: The following initializes the array `myListB` with user input values:
//        double[] myListB = new double[3];
//        System.out.println("Enter " + myListB.length + " values: ");
//        for (int i = 0; i < myListB.length; i++) {
//          myListB[i] = scanner.nextDouble();
//            System.out.println(myListB[i]);
//        }
//        System.out.println("Full array (elements included): " + Arrays.toString(myListB));

        // ---------------------------------------------
        // Initializing arrays with random numbers...
        double [] myListC = new double[3];
        for (int i = 0; i < myListC.length; i++) {
            myListC[i] = Math.random() * 100;
            System.out.println(myListC[i]);
        }
        System.out.println("Full array (elements included): " + Arrays.toString(myListC));
        // pg. 253
    }

}
