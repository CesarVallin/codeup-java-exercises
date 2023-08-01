package personalPractice;
import java.util.Scanner;
public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ---------------------------------------------------------------------------------------------------------
        // Join a string with a primitive data type...

        double price = 14.95;
        String priceWord = "Price: ";
        String priceString = priceWord + price;
        System.out.println(priceString);
        // The String object priceString now has the value of both variables.
        // Third example, Murach's book pg 49.
        // Here, a variable that's defined with the double data type is appended to a string.  When you use this technique, Java automatically converts the double value to a string.

        int years = 3;
        String message = "Years: " + years;
        System.out.println(message);
        // When you join or append other data types to a string variable, Java automatically converts the other data types so they can be used as part of the string.  In this example, for instance, the second statement joins a string literal of "Years: " with an int value of 3 and assigns the result to a string variable named message.  As a result, this string variable refers to a string of "Years: 3".

        // ---------------------------------------------------------------------------------------------------------
        // Methods for working with string indexes...

        // Length..-------------------------------------
        String productCode = "java";
        int length = productCode.length();
        System.out.println(length);
        // A use could be...
        // if (productCode.length() == 0) { ... }
        // This can be used to check for an empty string.  Checking whether the string variable named productCode has a length of 0.
        //-----------------------------------------------
        //Code that gets the index values for the two spaces...
        String name = "Martin Van Buren";
        int index1 = name.indexOf(" ");
        System.out.println(index1);
        int index2 = name.indexOf(" ", index1+1);
        System.out.println(index2);
        // Here, the first call to the indexOf() method return an index for the first occurrence of the space character in the specified string.  Then the second call to the indexOf() method returns an index for the second occurrence of the space character in the specified string.  To do that, this code adds a value of 1 to the index for the first space and starts searching at that index.  As a result, the code finds the second occurrence of the space character instead of finding the first occurrence.
        String name1 = "Martin Van Buren";
        int index1a = name1.lastIndexOf(" ");
        System.out.println(index1a);
        int index1b = name1.lastIndexOf(" ", index1a - 1);
        System.out.println(index1b);

        String name2 = "Martin Van Buren";
        int indexAA = name2.indexOf("Van");
        System.out.println(indexAA);
        // Another way to use the indexOf() method.  Here the indexOf() method searches the string for the value of "Van".  This shows that you can use the indexOf() method to search for a string of characters.  In addition, it shows that the index that's returned is for the first character in the string.  In other words, this code returns an int value of 7 because that's the index for where "Van" begins in this string.

        // ---------------------------------------------------------------------------------------------------------
        // Methods for modifying strings

        // trim() method
        String choice = "   y   ";
        choice = choice.trim();
        System.out.println(choice);
        // This example shows how to use the trim() method to remove any spaces from the beginning and end fo a String object.  As a result, after this code executes, the string variable named choice refers to a string literal of "y".

        // substring() method...
        String nameM = "Mike Murach";
        int indexM = nameM.indexOf(" ");
        String firstName = nameM.substring(0, indexM);
        System.out.println(firstName);
        String lastName = nameM.substring(indexM + 1);
        System.out.println(lastName);
        // This example shows how to use the substring() method to parse the first name and last name from a string for a full name.

        // code that adds dashes to a credit card number...
        String ccNumber = "4012888888881881";
        String part1 = ccNumber.substring(0, 4);
        String part2 = ccNumber.substring(4, 8);
        String part3 = ccNumber.substring(8, 12);
        String part4 = ccNumber.substring(12, 16);
        ccNumber = part1 + "-" + part2 + "-" + part3 + "-" + part4;
        System.out.println(ccNumber);
        // Shows how to add dashes using the substring() method

        // replace() method...
        String phoneNumber = "977-555-1212";
        phoneNumber = phoneNumber.replace("-", ".");
        System.out.println(phoneNumber);
        // Shows how to replace a character in a String with its replacement.

        String creditcNumber = "4012-8888-8888-1881";
        creditcNumber = creditcNumber.replace("-", "");
        System.out.println(creditcNumber);
        // Same concept, however now you are practically removing the character, since its replacement is an empty string






    }
}
