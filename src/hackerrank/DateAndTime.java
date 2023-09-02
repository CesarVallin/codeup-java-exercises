package hackerrank;

import java.util.Calendar;
import java.util.Locale;

public class DateAndTime {
    public static String findDay(int month, int day, int year) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("en", "US")).toUpperCase();
    }

    /**
     * No need to instantiate a calendar object to utilize the Calendar.getInstance() method because it is static.
     * However, the getDisplayName() method cannot be accessed in a static manner, thus you will need to instantiate a calendar object.
     *
     */

}
