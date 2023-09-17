package hackerrank;

import java.util.List;

public class ApplesNOranges {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int appleCounter = 0;
        int orangeCounter = 0;

        // s & t, in that order.

        int appleDistance;
        for (int i = 0; i < apples.size(); i++) {
            appleDistance = apples.get(i) + a;
            if (appleDistance >= s && appleDistance <= t) {
                appleCounter++;
            }

        }

        int orangeDistance;
        for(int i = 0; i < oranges.size(); i++) {
            orangeDistance = oranges.get(i) + b;
            if (orangeDistance >= s && orangeDistance <= t) {
                orangeCounter++;
            }
        }
        System.out.println(appleCounter);
        System.out.println(orangeCounter);

    }
}
