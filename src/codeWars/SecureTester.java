package codeWars;

public class SecureTester {
    public static boolean alphanumeric(String s){

        /** Not needed to check for empty string, but good practice*/
        if(s.isEmpty()) {
            return false;
        }

//        for (int i = 0; i < s.length(); i++) {
//            if(!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i))) {
//                return false;
//            }
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (!Character.isLetterOrDigit(c)) {
//                return false;
//            }
//        }
//
//        return true;
        return s.matches("[a-zA-Z0-9]+");
    }

}

// Check out VowelRemover & Troll

/**
 * the Character.isLetterOrDigit(c) method may not handle non-ASCII characters like "ï" as expected. To accurately handle these cases, you can use regular expressions with the matches method to ensure that the string only contains alphanumeric characters.
 *
 * */
