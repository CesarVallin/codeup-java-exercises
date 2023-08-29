package hackerrank;

public class TimeConversion {
    public static void main(String[] args) {

        System.out.println(timeConversion(test1));
        System.out.println(timeConversion(test2) + " " + " expected 12:01:00");
        System.out.println(timeConversion(test3) + " " + " expected 00:01:00");

    }

    private static String test1 = "07:05:45PM";
    private static String test2 = "12:01:00PM";
    private static String test3 = "12:01:00AM";

    public static String timeConversion(String s) {
        // Write your code here

//        System.out.println(s.substring(2, 8));
        String colonMinutesSeconds = s.substring(2, 8);
//        System.out.println(s.substring(8, 10));
        String amPM = s.substring(8, 10);
//        System.out.println(s.substring(0, 2));
        String hoursNumValue = s.substring(0, 2);

        int hours = Integer.parseInt(hoursNumValue);
        System.out.println(hours);
        System.out.println(hours + 12);


        if (amPM.equalsIgnoreCase("PM") && hours != 12) {
            return (hours + 12) + colonMinutesSeconds;
        }
        if (amPM.equalsIgnoreCase("PM") && hours == 12) {
            return hours + colonMinutesSeconds;
        }
        if (amPM.equalsIgnoreCase("AM") && hours == 12) {
            return "00" + colonMinutesSeconds;
        } else {
            return "0" + hours + colonMinutesSeconds;
        }

    }

}
