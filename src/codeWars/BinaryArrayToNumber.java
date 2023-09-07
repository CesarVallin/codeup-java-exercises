package codeWars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryArrayToNumber {

    public static List<Integer> integers1 = new ArrayList<>();


    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Your Code
        Collections.reverse(binary);
        int integer = 0;
        for (int i = 0; i < binary.size(); i++) {
            integer += Math.pow(2, i) * binary.get(i);
            System.out.println(integer);

        }
        return integer;
    }

    /**
     * Look at this: https://www.programiz.com/java-programming/examples/binary-decimal-convert#google_vignette
     *
     * This is how you came up with reversing the array.
     *
     * */
}
