import java.util.Random;

public class ServerNameGenerator {

    public static String[] adjectives = {"Radiant", "Serene", "Vibrant", "Mystical", "Jubilant", "Melancholic", "Resilient", "Luminous", "Tranquil", "Whimsical"};
    public static String[] nouns = {"Mountain", "Ocean", "Book", "Elephant", "Sunset", "Flower", "Computer", "Star", "Bicycle", "Rainforest" };

    public static String serverName(String[] adj, String[] nns) {
        Random random = new Random();
        String adjective = adj[random.nextInt(adj.length)];
        String noun = nns[random.nextInt(nns.length)];
        return adjective + " - " + noun;
    }

    public static void main(String[] args) {
        String servName = serverName(adjectives, nouns);
        System.out.println(servName);
    }



}
