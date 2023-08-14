package hackerrank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BirthdayCake {

    private static int birthdayCakeCandles(List<Integer> candles) {
        Collections.sort(candles);
        System.out.println("candles collection " + candles);
        Collections.sort(candles, Collections.reverseOrder());
        System.out.println(candles);
        System.out.println(candles.get(0));

        int tallCandles = 0;
        int max = candles.get(0);
        for (Integer candle: candles) {
            if (candle == max) {
                tallCandles ++;
            }
        }
        return tallCandles;

//        int repetitiveElement = 1;
//        /** Learning opportunity on loop set up when comparing sequential elements in an array */
//        for(int i = 0; i < candles.size() - 1; i++) {
//            System.out.println("Current element " + candles.get(i));
//            System.out.println("Next element " + candles.get(i + 1));
//            if(candles.get(i) == candles.get(i + 1)) {
//                repetitiveElement += 1;
//            }
//        }
//        return repetitiveElement;


    }

    public static void main(String[] args) {

        List<Integer> candles = new ArrayList<>();
        Collections.addAll(candles, 3, 2, 1, 3);

        System.out.println(birthdayCakeCandles(candles));
    }

}
