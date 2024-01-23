package codeWars;

public class Mumbling {

    public static String accum(String s) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            StringBuilder landingBase = new StringBuilder();

            // Append uppercase character
            landingBase.append(Character.toUpperCase(c));

            // Append lowercase character i times
            /** The loop variable `j` is initialized to 0
             * The loop condition `j < i` ensures that the loop will execute as long as `j` is less than the current value of `i`
             *
             * This double loop (internal loop) is utilized instead of the `repeat` method.
             * In each iteration of the loop, the append method is used to add a lowercase version of the character c to the landingBase
             * */
            for (int j = 0; j < i; j++) {
                landingBase.append(Character.toLowerCase(c));
            }

            result.append(landingBase);

            // Append a dash after each character except the last one
            if (i < s.length() - 1) {
                result.append("-");
            }
        }

        return result.toString();
    }

}
