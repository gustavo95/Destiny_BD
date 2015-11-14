package com.example.gustavo.destinybd;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.CountDownTimer;
import android.widget.Button;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import services.time.TimeManagement;

public class EventsScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_screen);

        Intent intent = getIntent();

        TimeManagement tm = new TimeManagement();
        raidCount(tm.getDiference(tm.getTime(), TimeManagement.nextDayOfWeek(Calendar.TUESDAY, 9)));
        xurCount(tm.getDiference(tm.getTime(), TimeManagement.nextDayOfWeek(Calendar.FRIDAY, 9)));
        prisonCount(tm.getDiference(tm.getTime(), TimeManagement.nextDayOfWeek(Calendar.TUESDAY, 9)));
        trialCount(tm.getDiference(tm.getTime(), TimeManagement.nextDayOfWeek(Calendar.FRIDAY, 17)));
    }

    private void raidCount(long time){

        new CountDownTimer(time, 1000) {

            public void onTick(long millisUntilFinished) {
                DateFormat datef = new SimpleDateFormat("dd HH:mm:ss");
                datef.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
                Date date = new Date();

                Button b = (Button) findViewById(R.id.raid);

                date.setTime(millisUntilFinished);

                b.setText("Incurções: " + datef.format(date));
            }

            public void onFinish() {
                //mTextField.setText("done!");
            }
        }.start();
    }

    private void xurCount(long time){

        new CountDownTimer(time, 1000) {

            public void onTick(long millisUntilFinished) {
                DateFormat datef = new SimpleDateFormat("dd HH:mm:ss");
                datef.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
                Date date = new Date();

                Button b = (Button) findViewById(R.id.xur);

                date.setTime(millisUntilFinished);

                b.setText("Xur: " + datef.format(date));
            }

            public void onFinish() {
                //mTextField.setText("done!");
            }
        }.start();
    }

    private void prisonCount(long time){

        new CountDownTimer(time, 1000) {

            public void onTick(long millisUntilFinished) {
                DateFormat datef = new SimpleDateFormat("dd HH:mm:ss");
                datef.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
                Date date = new Date();

                Button b = (Button) findViewById(R.id.prison);

                date.setTime(millisUntilFinished);

                b.setText("Prisão dos anciões:\n" + datef.format(date));
            }

            public void onFinish() {
                //mTextField.setText("done!");
            }
        }.start();
    }

    private void trialCount(long time){

        new CountDownTimer(time, 1000) {

            public void onTick(long millisUntilFinished) {
                DateFormat datef = new SimpleDateFormat("dd HH:mm:ss");
                datef.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
                Date date = new Date();

                Button b = (Button) findViewById(R.id.trial);

                date.setTime(millisUntilFinished);

                b.setText("Desafios de Osíris: " + datef.format(date));
            }

            public void onFinish() {
                //mTextField.setText("done!");
            }
        }.start();
    }

}
