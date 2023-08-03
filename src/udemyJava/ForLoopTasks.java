package udemyJava;

public class ForLoopTasks {

    public static void multiplicationTable(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
    public static int addNprogress (int number) {
        int counter = 0;
        for (int i = 1; i < number; i++) {
            counter += i;
            System.out.println(counter);
        }
        return counter;
    }

    public static long factorial (long number) {
        long counter = 1L;
        for (int i = 1; i <= number; i++) {
            counter *= i;
            System.out.println(counter);
        }
        return counter;
    }

    public static void main(String[] args) {
//        multiplicationTable(5);
//        int addUp = addNprogress(10);
        long factorial = factorial(4);




    }


}
