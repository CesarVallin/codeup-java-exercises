package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> apples = new ArrayList<>();
        Collections.addAll(apples, 2, 3, -4);

        List<Integer> oranges = new ArrayList<>();
        Collections.addAll(oranges, 3, -2, -4);

        ApplesNOranges.countApplesAndOranges(7, 10, 4, 12, apples, oranges);



    }



}
