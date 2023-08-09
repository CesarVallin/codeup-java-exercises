package codeWars;

public class ClassBanjo {
    /** Are you playing the Banjo?
     * Create a function which answers the question "Are you playing banjo?".
     * If your name starts with the letter "R" or lower case "r", you are playing banjo!
     *
     * The function takes a name as its only argument, and returns one of the following strings:
     *
     * name + " plays banjo"
     * name + " does not play banjo"
     * Names given are always valid strings.
     * */
    public static String areYouPlayingBanjo(String name) {
        // Program me!
        if(name.toLowerCase().charAt(0) == 'r') {
            return name + " plays banjo";
        }
        return name + " does not play banjo";
    }

    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("Riquelme"));
        System.out.println(areYouPlayingBanjo("Cesar"));
    }
}
