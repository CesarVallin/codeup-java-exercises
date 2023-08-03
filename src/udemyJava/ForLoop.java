package udemyJava;

public class ForLoop {

    public static void main(String[] args) {
        // for loop...
        // you can declare multiple variables but they must be the same data types...
        for (int i = 0,j = 1; i <= 10; i++, j *= 2) {
            System.out.println(i + " " + j);
        }
        // notice both loops are updating (updation, iteration modifier) based on initialization variables.
        // Loops will run for as long as the condition remains true.
        for (int i = 0, j = 1; i <= 10; i++, j++) {
            System.out.println(i + " " + j);
        }
    }
}
