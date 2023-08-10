public class ExceptionExercises {

    /** This try catch makes sure the program still runs !!!*/
    private static int divideNums(int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (int) ((double) a / b);

    }

    public static void delayedHello(int param) {
        try {
            Thread.sleep(param);
        } catch (InterruptedException e) {
                throw new RuntimeException(e);
        }
        System.out.println("Hello World");
    }
    // Throws exception.  This is a checked exception...



    public static void main(String[] args) {

//        System.out.println(divideNums(3, 0));

            delayedHello(3000);




    }
}
