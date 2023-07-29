import java.util.Scanner;
public class TreeStory {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input age...
        System.out.print("What is your age?  ");
        String ageAsString = scanner.nextLine();
        // Parse integer... input String to int
        int age = Integer.parseInt(ageAsString); // Integer's class static method parseInt, to generate a primitive int
        int ageLimit = 18;
        if (age < ageLimit) {
            System.out.printf("You must be %s or older to run this program", ageLimit);
            System.exit(0);
        }

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
        if (noun.equals("dork")) { // remember, because it is a String class, the noun variable has methods!!!!
            System.out.print("That language is not allowed potty mouth! Exiting program \n\n");
            System.exit(0);
        }
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
