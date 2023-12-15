package codeWars;

public class SimpleMultiplication {

    public static int simpleMultiplication(int num) {

        int result;

        if (num % 2 == 0) {
            result = num * 8;
        } else {
            result = num * 9;
        }

        return result;

    }

}
