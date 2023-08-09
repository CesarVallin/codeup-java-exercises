package codeWars;

public class ClassYesNo {
    public static String boolToWord(boolean b){
        if(b) {
            return "Yes";
        }
        return "No";
    }

    public static void main(String[] args) {
        System.out.println(boolToWord(false));
    }
}
