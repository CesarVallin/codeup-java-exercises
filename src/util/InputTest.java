package util;



public class InputTest {
    public static void main(String[] args) {
        // Create the first instance of input object...
        Input input = new Input();

        // Testing out getString() method...
        System.out.format("What is your name?%n");
        String nameResponse = input.getString();
        System.out.println(nameResponse);

        // Testing out yesNo() method...
        System.out.format("Do you want to continue? [y/N]%n");
        boolean continueResponse = input.yesNo();
        System.out.println(continueResponse);

        // Testing out getInt() method...
        System.out.format("Enter an integer:%n");
        int integerResponse = input.getInt();
        System.out.println(integerResponse);

        // Testing out minMax getInt() method...
        int minMaxI = input.getInt(20, 40);
        System.out.println(minMaxI);

        // Testing out getDouble() method...
        System.out.format("Enter an decimal number:%n");
        double doubleResponse = input.getDouble();
        System.out.println(doubleResponse);

        // Testing out minMax getDouble() method...
        double minMaxD = input.getDouble(20.0, 40.0);
        System.out.println(minMaxD);







    }
}
