package services.time;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Gustavo on 25/10/2015
 */
public class TimeManagement {
    public Date getTime(){
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+00:00"));
        Date date = cal.getTime();

        return date;
    }

    public long getDiference(Date date1, Date date2){
        long diference = date2.getTime() - date1.getTime();
        return diference;
    }

    public static Date nextDayOfWeek(int dow, int hour) {
        Calendar date = Calendar.getInstance(TimeZone.getTimeZone("GMT+00:00"));
        int diff = dow - date.get(Calendar.DAY_OF_WEEK);
        if (!(diff > 0)) {
            diff += 7;
        }
        date.add(Calendar.DAY_OF_MONTH, diff);
        date.set(Calendar.HOUR_OF_DAY, hour);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);

        Date d = date.getTime();
        return d;
    }
}
