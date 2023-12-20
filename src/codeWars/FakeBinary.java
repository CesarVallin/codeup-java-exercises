package codeWars;

public class FakeBinary {

    public static String fakeBin(String numberString) {

        String result = "";

        for (int i = 0; i < numberString.length(); i++) {

            char c = numberString.charAt(i);
            if(Integer.parseInt(String.valueOf(c)) < 5) {
                result += "0";
            }
            if(Integer.parseInt(String.valueOf(c)) >= 5) {
                result += "1";
            }
        }

        return result;
    }
}


/**
 * Also check Troll class in codeWars package.
 * Check out SecureTester class for regex example
 *
 * Also check out VowelRemover
 * */