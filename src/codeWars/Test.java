package codeWars;

import java.util.Collections;

public class Test {
    public static void main(String[] args) {

        Collections.addAll(BinaryArrayToNumber.integers1, 1, 1, 1, 1);

        int result = BinaryArrayToNumber.ConvertBinaryArrayToInt(BinaryArrayToNumber.integers1);
        System.out.println(result);

    }
}
