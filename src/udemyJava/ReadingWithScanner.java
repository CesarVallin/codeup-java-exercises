package udemyJava;
import java.util.Scanner;
public class ReadingWithScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
        System.out.println("Enter two integers:  ");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println(x + " " + y);

        int z = x + y;
        System.out.println("Sum is : " + z);
    }
}
