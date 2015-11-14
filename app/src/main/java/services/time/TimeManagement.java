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

        int diffDay = dow - date.get(Calendar.DAY_OF_WEEK);
        int diffHour = hour - date.get(Calendar.HOUR_OF_DAY);
        int diffMinute = 0 - date.get(Calendar.MINUTE);
        int diffSecond = 0 - date.get(Calendar.SECOND);

        if (!(diffDay > 0) && !(diffHour > 0) && !(diffMinute > 0) && !(diffSecond > 0)) {
            diffDay += 6;
        }else if(!(diffDay > 0)){
            diffDay += 7;
        }

        date.add(Calendar.DAY_OF_MONTH, diffDay);
        date.set(Calendar.HOUR_OF_DAY, hour);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);

        Date d = date.getTime();
        return d;
    }
}
