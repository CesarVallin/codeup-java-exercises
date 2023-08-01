import java.util.Scanner;

public class StringExercise {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String education = "We don't need no education";
        education = "We don't need no thought control";
        System.out.println(education);

        String checkThisOut = "Check \"this\" out! \"s inside of \"s!";
        System.out.println(checkThisOut);

        String windows = "In windows, the main drive is usually C:\\";
        System.out.println(windows);

        String backSlashes = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!\n";
        System.out.println(backSlashes);;
    }
}
