import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.format("Please type anything here to have a conversation with Bob: %n");
        String userInteraction = scanner.nextLine();
        System.out.println(userInteraction);

        boolean question = userInteraction.endsWith("?");
        boolean exclamation = userInteraction.endsWith("!");

        if (userInteraction.length() == 0) {
            System.out.println("Fine, be that way");
        } else if (question) {
            System.out.println("Sure");
        } else if (exclamation) {
            System.out.println("Whoa, chill out!");
        } else {
            System.out.println("Whatever");
        }
    }
}
