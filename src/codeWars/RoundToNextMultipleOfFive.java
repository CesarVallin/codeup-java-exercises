package codeWars;

public class RoundToNextMultipleOfFive {

    public static int roundToNext5(int number) {

        if(number % 5 == 0) {
            return number;
        }


//        int roundUp5 = (int) Math.round( (float) number / 5) * 5;
//        return roundUp5;

        int roundUp5 = (int) (Math.ceil( (float) number / 5) * 5);
        return roundUp5;

    }

}
