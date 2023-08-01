import org.w3c.dom.ls.LSOutput;

public class MethodsExercises {

    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        return a / b;
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int modulus(int a, int b) {
        return a % b;
    }

    public static int multiplicationbyLoop (int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

    public static void main (String[] args) {

        System.out.println(multiply(3, 4));
        System.out.println(multiplicationbyLoop(3, 4));

        System.out.println(divide(10, 5));
        System.out.println(add(2, 2));
        System.out.println(subtract(4, 3));
        System.out.println(modulus(4, 2));




    }
}
