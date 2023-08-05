package util;



public class InputTest {
    public static void main(String[] args) {
        // Create the first instance of input object...
        Input input = new Input();

        // ---------------------------------------------------------------------------------------------------------

//        // getString() method...
//
//        // Testing out getString() method...
//        System.out.format("Enter something here:%n");
//        String userResponse = input.getString();
//        System.out.println(userResponse);
//        // Optional getString() method with parameter prompt...
//        String userResponsePromptIncluded = input.getString("Please enter something here...");
//        System.out.println(userResponsePromptIncluded);
        // ---------------------------------------------------------------------------------------------------------

        // yesNo() method...

        // Testing out yesNo() method...
        System.out.format("Do you want to continue? [y/N]%n");
        boolean continueResponse = input.yesNo();
        System.out.println(continueResponse);
        // Optional yesNo() method with parameter prompt...
        boolean continuePromptIncluded = input.yesNo("Please answer, Do you want to continue? [y/N]");
        System.out.println(continuePromptIncluded);
        // ---------------------------------------------------------------------------------------------------------

//        // getInt() method...
//
//        // Testing out getInt() method...
//        System.out.format("Enter an number:%n");
//        int integerResponse = input.getInt();
//        System.out.println(integerResponse);
//        // Optional getInt() method with parameter prompt...
//        int intPromptIncluded = input.getInt("Please enter a number ...");
//        System.out.println(intPromptIncluded);
        // ---------------------------------------------------------------------------------------------------------

//        // getInt() method, minMax...
//
//        // Testing out minMax getInt() method...
//        int minMaxI = input.getInt(20, 40);
//        System.out.println(minMaxI);
//        // Optional getInt() method minMax, with parameter prompt...
//        int minMaxIprompt = input.getInt("Please enter number between 1 and 10", 1, 10);
//        System.out.println(minMaxIprompt);
        // ---------------------------------------------------------------------------------------------------------

        // getDouble() method...

//        // Testing out getDouble() method...
//        System.out.format("Enter an decimal number:%n");
//        double doubleResponse = input.getDouble();
//        System.out.println(doubleResponse);
//        // Optional getDouble() method with parameter prompt...
//        double doublePrompt = input.getDouble("Please enter a decimal number");
//        System.out.println(doublePrompt);
        // ---------------------------------------------------------------------------------------------------------

        // getDouble() method, minMax ....

//        // Testing out minMax getDouble() method...
//        double minMaxD = input.getDouble(20.0, 40.0);
//        System.out.println(minMaxD);
//        // Optional getDouble() method minMax, with parameter prompt...
//        double minMaxDprompt = input.getDouble("Please enter a decimal number between 20.00 and 40.00", 20.00, 40.00);
//        System.out.println(minMaxDprompt);







    }
}
