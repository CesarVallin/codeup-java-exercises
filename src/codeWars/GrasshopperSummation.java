package codeWars;

public class GrasshopperSummation {

    public static int summation(int n) {

        if (n == 1) {
            return 1;
        }

        int starter = 1;
        for (int i = 2; i <= n; i++) {
            starter += i;
        }

        return starter;
    }

}
