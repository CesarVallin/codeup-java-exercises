package codeWars;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int champ = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] < champ) {
                champ = args[i];
            }
        }
        return champ;
    }
}
