package codeWars;

public class GreedIsGood {

    // You will always be given an array with five six-sided dice.
    // The ones and the fives can count as singles, as well as triples.

    public static int greedy(int[] dice) {

        int ones = 0, twos = 0, threes = 0, fours = 0, fives = 0, sixes = 0;

        int onesRemainder = 0;
        int fivesRemainder = 0;

        int result = 0;

        // Loop through array and assign dice occurrence.
        for (int i = 0; i < dice.length; i++) {
//            System.out.println(dice[i]);

            if (dice[i] == 1) {
                ones ++;
            }

            if (dice[i] == 2) {
                twos ++;
            }

            if (dice[i] == 3) {
                threes ++;
            }

            if (dice[i] == 4) {
                fours ++;
            }

            if (dice[i] == 5) {
                fives ++;
            }

            if (dice[i] == 6) {
                sixes ++;
            }

        }
        //System.out.println(ones + " " + "ones");
//        System.out.println(twos + " " + "fours");
//        System.out.println(threes + " " + "threes");
//        System.out.println(fours + " " + "fours");
//        System.out.println(fives + " " + "fives");
//        System.out.println(sixes + " " + "sixes");

        // Take care of the two cases that can count as singles or triples (ones and fives).
        if (ones > 0) {
            if (ones >= 3) {
                result += 1000;
                onesRemainder = ones - 3;
                onesRemainder *= 100;
                result += onesRemainder;
            } else {
                result += ones * 100;
            }
        }

        if (fives > 0) {
            if (fives >= 3) {
                result += 500;
                fivesRemainder = fives - 3;
                fivesRemainder *= 50;
                result += fivesRemainder;
            } else {
                result += fives * 50;
            }
        }

        // Take care of the rest, where triples are the only way to count towards the result.
        if (twos >= 3) {
            result += 200;
        }

        if (threes >= 3) {
            result += 300;
        }

        if (fours >= 3) {
            result += 400;
        }

        if (sixes >= 3) {
            result += 600;
        }

        return result;
    }
}

/**
 * See if you can improve this problem with a modulus operator.
 *
 * */


