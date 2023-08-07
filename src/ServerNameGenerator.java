import java.util.Random;

public class ServerNameGenerator {


    // ---------------------------------------------------------------------------------------------------------
    private static String[] adjectives = {"Radiant", "Serene", "Vibrant", "Mystical", "Jubilant", "Melancholic", "Resilient", "Luminous", "Tranquil", "Whimsical"};
    private static String[] nouns = {"Mountain", "Ocean", "Book", "Elephant", "Sunset", "Flower", "Computer", "Star", "Bicycle", "Rainforest"};

    // ---------------------------------------------------------------------------------------------------------
    // First way of doing it...
    public static String serverName(String[] adj, String[] nns) {
        Random random = new Random();
        String adjective = adj[random.nextInt(adj.length)];
        String noun = nns[random.nextInt(nns.length)];
        return adjective + " - " + noun;
    }
    // ---------------------------------------------------------------------------------------------------------
    // Second way of doing it....
    public static String returnRandom(String[] array) {
        Random rand = new Random();
        int randomIndex = rand.nextInt(array.length);
        return array[randomIndex];
    }
    // ---------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        // First way response...
        String servName = serverName(adjectives, nouns);
        System.out.println(servName);
        // Second way response...
        System.out.printf("Here is your server name:%n%s-%s%n", returnRandom(adjectives), returnRandom(nouns));

    }



}
