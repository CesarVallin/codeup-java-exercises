import java.util.Scanner;
public class TreeStory {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input age...
        System.out.print("What is your age?  ");
        String ageAsString = scanner.nextLine();
        // Parse integer... input String to int
        int ageVariable = Integer.parseInt(ageAsString); // Integer's class static method parseInt, to generate a primitive int
        int ageLimit = 18;
        if (ageVariable < ageLimit) {
            System.out.printf("You must be %s or older to run this program", ageLimit);
            System.exit(0);
        }

        // Input name...
        System.out.print("What is your name?  ");
        String nameVariable = scanner.nextLine();
//        System.out.println("You entered: " + name);
        // Input adjective...
        System.out.print("Enter an adjective:  ");
        String adjectiveVariable = scanner.nextLine();

        // Variable declaration outside of loop scope...
        String nounVariable;
        boolean isInvalidWordVariable;
        do {
            System.out.print("Enter a noun:  ");
            nounVariable = scanner.nextLine();

            isInvalidWordVariable = nounVariable.equalsIgnoreCase("dork") || nounVariable.equalsIgnoreCase("jerk");

            if (isInvalidWordVariable) {
               System.out.printf("That language is not allowed potty mouth! Try again %n%n");
            }
        } while (isInvalidWordVariable);

        // Input adverb...
        System.out.print("Enter an adverb:  ");
        String adverbVariable = scanner.nextLine();
        // Input verb...
        System.out.print("Enter a verb:  ");
        String verbVariable = scanner.nextLine();

        // OUTPUT Story... with format specifiers:
        System.out.printf("%s is a %s %s.", nameVariable, adjectiveVariable, nounVariable);
        System.out.printf(" He is always %s %s. %n%n", adverbVariable, verbVariable);

        // OUTPUT Story... with concatenation:
        System.out.println(nameVariable + " is a " + adjectiveVariable + " " + nounVariable);
        System.out.println("He is always " + adverbVariable + " " + verbVariable);

    }
}
