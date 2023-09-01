package hackerrank;

public class CatsAndMouse {
    public static void main(String[] args) {
        System.out.println(catAndMouse(1, 2, 3));
        System.out.println(catAndMouse(1, 3, 2));

    }

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        if((Math.abs(x - z)) < (Math.abs(y-z))) {
            return "Cat A";
        }
        if ((Math.abs(y-z)) < (Math.abs(x-z))) {
            return "Cat B";
        }
        return "Mouse C";

    }
}
