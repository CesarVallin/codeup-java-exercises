package codeWars;

public class RoundToNextMultipleOfFive {

    public static int roundToNext5(int number) {

        if(number % 5 == 0) {
            return number;
        }

/**
 * This code rounds to the nearest integer that is divisible by 5.
 * */
//        int roundUp5 = (int) Math.round( (float) number / 5) * 5;
//        return roundUp5;

        /**
         *  This code rounds up to the next integer that is divisible by 5.
         *
         *  Math.ceil always rounds up to the next integer.
         * */
        int roundUp5 = (int) (Math.ceil( (float) number / 5) * 5);
        return roundUp5;

    }

}


/**
 * Check out this other solution:
 *
 * while (number % 5 != 0) {
 *       number++;
 *     }
 *     return number;
 *
 * */
