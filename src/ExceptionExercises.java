public class ExceptionExercises {

    /** This try catch makes sure the program still runs !!!*/
    private static int divideNums(int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        } else {
            return  a/b;
        }
    }

    private static int divideNums1(int a, int b) {
        int result;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return result;
    }

    public static void delayedHello(int param) {
        try {
            Thread.sleep(param);
                System.out.println("Hello World");
        } catch (InterruptedException e) {
                throw new RuntimeException("Took too long!!");
        }
    }
    // Throws exception.  This is a checked exception...



    public static void main(String[] args) {

//        System.out.println(divideNums(3, 0));

            delayedHello(3000);




    }
}
