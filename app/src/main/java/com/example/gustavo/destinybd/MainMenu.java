package com.example.gustavo.destinybd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void openItemsMenu(View view){
        Intent intent = new Intent(this, ItemsMenu.class);
        startActivity(intent);
    }

    public  void openQuestIndex(View view){
        Intent intent = new Intent(this, QuestIndex.class);
        startActivity(intent);
    }
}
