package mx.edu.greengates.dvazquez.labreserve;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalUtils {

    public static final int SUNDAY = 1, MONDAY =2, TUESDAY = 3, WEDNESDAY = 4, THURSDAY = 5, FRIDAY = 6, SATURDAY = 7;

    /**
     *
     * @param day    date to find
     * @param month  month for date
     * @param year   year for date
     * @return  SUNDAY = 1, MONDAY =2, TUESDAY = 3, WEDNESDAY = 4, THURSDAY = 5, FRIDAY = 6, SATURDAY = 7
     */
    public static int getDayOfWeek(int day, int month, int year){

        Calendar calendar = new GregorianCalendar(year,month,day);

        int currentYear       = calendar.get(Calendar.YEAR);
        int currentMonth      = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);

        return dayOfWeek;
    }

    public static int getDayOfWeek(Date date){
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek;
    }
    public static Date getDate(int day, int month, int year){
        Calendar calendar = new GregorianCalendar(year,month,day);
        final Date time = calendar.getTime();
        return time;
    }

    public static Date getTimestamp(int day, int month, int year, int hour, int minute){
        Calendar calendar = new GregorianCalendar(year,month,day,hour,minute);
        final Date time = calendar.getTime();
        return time;
    }

    public static String stringDate(Date date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd E");
        return dateFormat.format(date);
    }

}
