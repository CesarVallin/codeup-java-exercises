import java.util.Scanner;
public class TreeStory {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input name...
        System.out.print("What is your name?  ");
        String name = scanner.nextLine();
//        System.out.println("You entered: " + name);
        // Input adjective...
        System.out.print("Enter an adjective:  ");
        String adjective = scanner.nextLine();
        // Input noun...
        System.out.print("Enter a noun:  ");
        String noun = scanner.nextLine();
        // Input adverb...
        System.out.print("Enter an adverb:  ");
        String adverb = scanner.nextLine();
        // Input verb...
        System.out.print("Enter a verb:  ");
        String verb = scanner.nextLine();

        // OUTPUT Story... with format specifiers:
        System.out.printf("%s is a %s %s.", name, adjective, noun);
        System.out.printf(" He is always %s %s.\n", adverb, verb);

        // OUTPUT Story... with concatenation:
        System.out.println(name + " is a " + adjective + " " + noun);
        System.out.println("He is always " + adverb + " " + verb);

    }
}
