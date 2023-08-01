package personalPractice;

public class RecursionPractice {
    public static void count (int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n -1);
    }
    public static void countTimes(int n) {
        if (n > 1000) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        countTimes(n * 2); // Just think about `n` having some sort of memory within the program.
    }


    public static void main (String[] args) {
//        count(5);
        countTimes(2);

    }
}
