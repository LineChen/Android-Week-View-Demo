package com.alamkanak.weekview;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by jesse on 6/02/2016.
 */
public class WeekViewUtil {

    public static final String DATE_FORMAT_MONTH = "M月";

    /////////////////////////////////////////////////////////////////
    //
    //      Helper methods.
    //
    /////////////////////////////////////////////////////////////////

    /**
     * Checks if two times are on the same day.
     * @param dayOne The first day.
     * @param dayTwo The second day.
     * @return Whether the times are on the same day.
     */
    public static boolean isSameDay(Calendar dayOne, Calendar dayTwo) {
        return dayOne.get(Calendar.YEAR) == dayTwo.get(Calendar.YEAR) && dayOne.get(Calendar.DAY_OF_YEAR) == dayTwo.get(Calendar.DAY_OF_YEAR);
    }

    /**
     * Returns a calendar instance at the start of this day
     * @return the calendar instance
     */
    public static Calendar today(){
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 0);
        today.set(Calendar.MINUTE, 0);
        today.set(Calendar.SECOND, 0);
        today.set(Calendar.MILLISECOND, 0);
        return today;
    }


    /**
     * @param time
     * @param format
     * @return
     */
    public static String getFormatDate(long time, String format) {
        Date d = new Date(time);
        return getFormatDate(d, format);
    }

    public static String getFormatDate(Date time, String format) {
        String date;
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        date = sdf.format(time);
        return date;
    }
}
