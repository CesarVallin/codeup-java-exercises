package hackerrank;

import codeWars.SecureTester;

public class Test {

    public static void main(String[] args) {

        System.out.println(SecureTester.alphanumeric("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
        System.out.println(SecureTester.alphanumeric("with_underscore"));
        System.out.println(SecureTester.alphanumeric("naïve"));
    }

}
