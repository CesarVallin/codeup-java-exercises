package util;

import java.util.Scanner;

public class Input {
    // ---------------------------------------------------------------------------------------------------------
    // Instance property...
    private Scanner scanner;
    // ---------------------------------------------------------------------------------------------------------
    // Constructor... (creating a new instance of this object)
    public Input(){
        this.scanner = new Scanner(System.in);
    }
    // ---------------------------------------------------------------------------------------------------------
    // Instance methods...
    public String getString(){
        return this.scanner.nextLine();
    }
    public String getString(String prompt){
        return prompt + " " + this.scanner.nextLine();
    }
    public boolean yesNo() {
        boolean yes = this.scanner.nextLine().toLowerCase().startsWith("y");
        return yes;
    }

    public int getInt() {
        return this.scanner.nextInt();
    }
    public int getInt(int min, int max) {
        int userResponse;
        do {
            System.out.println("Enter a number between " + min + " and " + max);
            userResponse = getInt();
        } while(userResponse < min || userResponse > max);
        return userResponse;
    }

    public double getDouble() {
        return this.scanner.nextDouble();
    }
    public double getDouble(double min, double max) {
        double userResponse;
        do {
            System.out.println("Enter a decimal number between " + min + " and " + max);
            userResponse = getDouble();
        } while(userResponse < min || userResponse > max);
        return userResponse;
    }

}
