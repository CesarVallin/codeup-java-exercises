package hackerrank;

import java.util.Calendar;
import java.util.Locale;

public class DateAndTime {
    public static void main(String[] args) {

        System.out.println(findDay(8, 14, 2017));

    }
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("en", "US")).toUpperCase();
    }

    /**
     * Would I be able to access this anywhere within the same package file??
     *
     * If so, does it look like this:
     *
     *      DateAndTime.findDay();
     *
     *
     * */
}
