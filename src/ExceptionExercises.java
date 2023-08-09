public class ExceptionExercises {

    /** This try catch makes sure the program still runs !!!*/
    private static int divideNums(int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        } else {
            return  a/b;
        }
    }

    public static void delayedHello(int param) {
        try {
            Thread.sleep(param);
            if (param < 1001) {
                System.out.println("Hello World");
            }
        } catch (InterruptedException e) {
            if (param >= 1001) {
                throw new RuntimeException("Took too long!!");
            }
        }
    }



    public static void main(String[] args) {

        System.out.println(divideNums(3, 1));


        try{
            delayedHello(1002);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }



    }
}
