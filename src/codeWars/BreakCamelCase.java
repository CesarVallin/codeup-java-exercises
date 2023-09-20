package codeWars;

public class BreakCamelCase {

    public static String camelCase(String input) {
        String output = "";
        for(int i = 0; i < input.length(); i++) {
            if(Character.isLowerCase(input.charAt(i))) {
                output += input.charAt(i);
            }
            if(Character.isUpperCase(input.charAt(i))) {
                output += " " + input.charAt(i);
            }
        }
        return output;
    }
}
