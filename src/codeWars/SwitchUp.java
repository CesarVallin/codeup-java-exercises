package codeWars;

public class SwitchUp {

    public static String switchItUp(int number) {

        String message = "";

        switch (number) {
            case 0:
                message += "Zero";
                break;
            case 1:
                message += "One";
                break;
            case 2:
                message += "Two";
                break;
            case 3:
                message += "Three";
                break;
            case 4:
                message += "Four";
                break;
            case 5:
                message += "Five";
                break;
            case 6:
                message += "Six";
                break;
            case 7:
                message += "Seven";
                break;
            case 8:
                message += "Eight";
                break;
            case 9:
                message += "Nine";
                break;
        }

        return message;
    }
}
