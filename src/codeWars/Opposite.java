package codeWars;

public class Opposite {

    public static int opposite(int number) {
        String numberString = Integer.toString(number);

        if (number < 0) {
            numberString = numberString.substring(1);
        }
        if (number > 0) {
            numberString = "-" + numberString;
        }

        return Integer.parseInt(numberString);
    }

}
