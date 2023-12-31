package util;

import java.util.Scanner;

public class Input {
    // ---------------------------------------------------------------------------------------------------------
    // Instance property...
    private Scanner scanner;
    // ---------------------------------------------------------------------------------------------------------
    // Constructor... (creating a new instance of this object)
    public Input() {
        this.scanner = new Scanner(System.in);
    }
    // ---------------------------------------------------------------------------------------------------------







    // ---------------------------------------------------------------------------------------------------------
    // Instance methods...
    public String getString(){
        return this.scanner.nextLine();
    }
    public String getString(String prompt){
        System.out.println(prompt);
        return getString();
    }
    // -----------------------------------------
    public boolean yesNo() {
        boolean yes = this.scanner.nextLine().toLowerCase().startsWith("y");
        return yes;
    }
    public boolean yesNo(String prompt){
        System.out.println(prompt);
        return yesNo();
    }
    // -----------------------------------------
    public int getInt() {
        do {
            try {
                return this.scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Wrong input, expected a number, try again");
            }
        } while(true);
    }
    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt();
    }
    public int getInt(int min, int max) {
        int userResponse;
        do {
            System.out.println("Enter a number between " + min + " and " + max);
            userResponse = getInt();
        } while(userResponse < min || userResponse > max);
        return userResponse;
    }
    public int getInt(String prompt, int min, int max) {
        int userResponse;
        do {
            System.out.println(prompt);
            userResponse = getInt();
        } while (userResponse < min || userResponse > max);
        return userResponse;
    }
    // -----------------------------------------
    public double getDouble() {
        do {
            try {
                return this.scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Wrong input, expected a number, try again");
            }
        } while(true);
    }
    public double getDouble(String prompt) {
        System.out.println(prompt);
        return getDouble();
    }
    public double getDouble(double min, double max) {
        double userResponse;
        do {
            System.out.println("Enter a decimal number between " + min + " and " + max);
            userResponse = getDouble();
        } while(userResponse < min || userResponse > max);
        return userResponse;
    }
    public double getDouble (String prompt, double min, double max) {
        double userResponse;
        do {
            System.out.println(prompt);
            userResponse = getDouble();
        } while(userResponse < min || userResponse > max);
        return userResponse;
    }

}
