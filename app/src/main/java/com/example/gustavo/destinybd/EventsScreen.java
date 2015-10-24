package com.example.gustavo.destinybd;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class EventsScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_screen);

        Intent intent = getIntent();
    }

    public void test (View view){
        Calendar c = nextDayOfWeek(Calendar.FRIDAY);
        Date d = c.getTime();

        DateFormat date = new SimpleDateFormat("dd-MM-yyy HH:mm:ss z");
        date.setTimeZone(TimeZone.getTimeZone("GMT"));

        System.out.println(date.format(getTime()));
        System.out.println(date.format(d));

    }

    public Date getTime(){
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+00:00"));
        Date date = cal.getTime();

        return date;
    }

    public long getDiference(Date date){
        return 0;
    }

    public static Calendar nextDayOfWeek(int dow) {
        Calendar date = Calendar.getInstance(TimeZone.getTimeZone("GMT+00:00"));
        int diff = dow - date.get(Calendar.DAY_OF_WEEK);
        if (!(diff > 0)) {
            diff += 7;
        }
        date.add(Calendar.DAY_OF_MONTH, diff);
        date.set(Calendar.HOUR_OF_DAY, 9);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);
        return date;
    }

}
