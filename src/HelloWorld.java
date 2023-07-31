public class HelloWorld {
    public static void main(String[] args) {
        System.out.printf("Hello World!%n%n");
        System.out.printf("this is the second print %n%n");

        int myFavoriteNumber = 7;
        System.out.printf(myFavoriteNumber + "%n%n");

        String myString = "C";
        System.out.printf(myString + "%n%n");

//        // You have floating point numbers, cannot use long!
//        long anotherNumber = 3.14;
//        System.out.println(anotherNumber);

        // Float vs double...
        double myNumber = 3.14;
        System.out.println(myNumber);

        // Better way
        float myNumberB = 3.14f;
        System.out.println(myNumberB);

        // Sloppy way...
        float myNumberA = (float) 3.14;
        System.out.println(myNumberA);

//        // Post-incremental
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
        // Pre-incremental
        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        // YOU cannot cast two distinct values!!! "three" cannot be converted to 3.
        // "3" could be converted to 3.
        // Implicit and Explicit casting can be done within same data types.
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        // Shorthand operators
        int xShortHand = 4;
        xShortHand += 5;
        System.out.println(xShortHand);

        int xA = 300000000;
        int yA = 400000000;
        yA *= xA;
        System.out.println(yA);

        long xAA = 300000000L;
        long yAA = 400000000L;
        yAA *= xAA;
        System.out.println(yAA);

        int xB = 10;
        int yB = 2;
        xB /= yB;
        yB -= xB;
        System.out.println(xB);
        System.out.println(yB);


    }
}
