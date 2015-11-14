package com.example.gustavo.destinybd;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class GameScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        Intent i = getIntent();
    }

    public  void openHistoryScreen(View view){
        Intent intent = new Intent(this, ScreenHistory.class);
        startActivity(intent);
    }

}
