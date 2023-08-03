package lectures;

public class MethodsLecture {

    /*
        METHOD STRUCTURE...

        VISIBILITY_MODIFIER STATIC_OR_INSTANCE RETURN_TYPE METHOD_NAME(PARAM_DATATYPE PARAM, ...) {

            BODY OF METHOD HERE

        }

        For Example...

        public static void main(String[] args) {
            System.out.println("Hello World");
        }


     */

    // ----------- DEFINING AND CALLING METHODS WITH VARIOUS INPUTS (examples)

    // no input or returned output

//    public static void sayGreeting() {
//        System.out.println("Hello");
//    }

    // no returned output with input

//    public static void sayInput(String input) {
//        System.out.println(input);
//    }

    // returned output without input

//    public static int returnSeven() {
//        return 7;
//    }

    // return output given an input

//    public static int returnInt(int someInt) {
//        return someInt;
//    }

    // multiple parameters

//    public static double returnProductOfThreeNums(double num1, double num2, double num3) {
//        return num1 * num2 * num3;
//    }


    // using a method inside another method

//    public static int returnSumOfInts(int intOne, int intTwo) {
//        return returnInt(intOne) + returnInt(intTwo);
//    }


    // return type different from input type

//    public static int returnLengthOfString(String input) {
//        return input.length();
//    }

    // multiple input types

//    public static String repeatStr(String str, int times) {
//        return str.repeat(times);
//    }

//    public static void printCharMultipleTimes(char c, int repetitions) {
//        System.out.println(String.valueOf(c).repeat(repetitions));
//    }


    /**
     * METHOD MINI-EXERCISES
     */

    // TODO: Write a method, returnName, that returns the string of your name.
    // TODO: Write a method, returnLongerString, that takes in two strings and returns the longer of the two strings.
    // TODO: Write a method, canBeHalved, that takes in an integer and returns true if the input integer is evenly divisible by two.
    // TODO: !! Complete math exercises from the curriculum !!
//    public static String returnName () {
//        return "Cesar";
//    }
//    public static String returnLongerString(String a, String b) {
//        if(a.length() > b.length()) {
//            return a;
//        }
//        return b;
//    }
//    public static boolean canBeHalved(int num) {
////        boolean even = num % 2 == 0;
////        boolean odd = num % 2 != 0;
////        if (even) {
////            return true;
////        }
////        return false;
//        return num % 2 == 0;
//    }
//
//    public static void main(String[] args) {
//        String name = returnName();
//        System.out.println(name);
//        String longestOfTwo = returnLongerString("Codeup", "CodeupCodeup");
//        System.out.println(longestOfTwo);
//        boolean halved = canBeHalved(4);
//        System.out.println(halved);
//    }



    // ----------- OVERLOADING

    /*

        Method overloading is a way to define the same method with different method signatures.
        It is a convenience to prevent the programmer from having to create many more method names
        when defining functionality for various data type inputs.

        Much of the Java language is defined using overloaded methods (e.g. println())

     */

    // overloading example

//    public static void sayHello() {
//        System.out.println("Hello World");
//    }
//
//    public static void sayHello(int num) {
//        for (int i = 0; i < num; i += 1) {
//            sayHello();
//        }
//    }

    // Is this overloading???

//        public static String sayHello(int num) {
//            return "Hello World";
//        }

    // Is this overloading???

//        public static String sayHello(String punctuation) {
//            return "Hello World" + punctuation;
//        }



    /**
     * OVERLOAD MINI-EXERCISES
     */

    // TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
    //  a greeting message to the user by either their first or first and last name.

    // example: sayName("Justin") - "Hi Justin"
    // example: sayName("Justin", "Reich") - "Hi Justin Reich"

//    public static String sayName(String str) {
//        return "Hi " + str;
//    }
//    public static String sayName(String str1, String str2) {
//        return "Hi " + str1 + " " + str2;
//    }
//
//    public static void main(String[] args) {
//        String name = sayName("Cesar");
//        System.out.println(name);
//        String fullName = sayName("Cesar", "Vallin");
//        System.out.println(fullName);
//    }

    // TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles

    // 1. Basic arithmetic
    // ----------------------------------------------------------------------------------------
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    // ----------------------------------------------------------------------------------------
    public static int divide(int a, int b) {
        return a / b;
    }
    public static double divide(double a, double b) {
        return a / b;
    }
    // ----------------------------------------------------------------------------------------
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    // ----------------------------------------------------------------------------------------
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    // ----------------------------------------------------------------------------------------
    public static int modulus(int a, int b) {
        return a % b;
    }
    public static double modulus(double a, double b) {
        return a % b;
    }
    // ----------------------------------------------------------------------------------------
    public static int multiplicationByLoop (int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }
    public static double multiplicationByLoop (double a, double b) {
        double result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }
    // ----------------------------------------------------------------------------------------
    public static int recursionMultiply (int base, int exponent) {
        if (base == 0 || exponent == 0) {
            return 0;
        }
        return base + recursionMultiply(base, exponent -1);
    }
    // ----------------------------------------------------------------------------------------

    public static void main(String[] args) {

        int multiplyInt = multiply(3, 4);
        System.out.println(multiplyInt);
        double multiplyDouble = multiply(3.0, 4.0);
        System.out.println(multiplyDouble);

        int divideInt = divide(4, 3);
        System.out.println(divideInt);
        double divideDouble = divide(4.0, 3.0);
        System.out.println(divideDouble);

        int addInt = add(3, 3);
        System.out.println(addInt);
        double addDouble = add(3.0, 3.0);
        System.out.println(addDouble);

        int subtractInt = subtract(7, 3);
        System.out.println(subtractInt);
        double subtractDouble = subtract(7.0, 3.0);
        System.out.println(subtractDouble);

        int modulusInt = modulus(7, 3);
        System.out.println(modulusInt);
        double modulusDouble = modulus(7.0, 3.0);
        System.out.println(modulusDouble);

        int multiplicationByLoopInt = multiplicationByLoop(3, 4);



    }
}
