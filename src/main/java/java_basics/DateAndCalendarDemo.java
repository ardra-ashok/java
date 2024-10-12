package java_basics;


import java_basics.utils.base;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndCalendarDemo extends base {
    public static void main(String[] args) {

        printMe("------Using Date instance-----\n");
        Date date = new Date();
        printMe(date.toString());
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yy");
        SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        printMe(sdf.format(date));
        printMe(sd.format(date));

        printMe("------Using Calendar instance-----\n");
        printMe();
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        printMe(df.format(cal.getTime()));
        printMe(cal.get(Calendar.DAY_OF_MONTH));
        printMe(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        printMe(cal.get(Calendar.AM_PM));
        printMe(cal.get(Calendar.MINUTE));

    }
}
