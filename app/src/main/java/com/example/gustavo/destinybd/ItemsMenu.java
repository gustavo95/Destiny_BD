package com.example.gustavo.destinybd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ItemsMenu extends Activity {
    public final static String EXTRA_INTEGER = "com.example.gustavo.destinybd.INTEGER";
    public final static String EXTRA_LIST = "com.example.gustavo.destinybd.LIST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_menu);
    }

    public void openPrimaryWeaponIndex(View view){
        Intent intent = new Intent(this, WeaponsIndex.class);
        intent.putExtra(EXTRA_INTEGER, 1);
        startActivity(intent);
    }

    public void openSpecialWeaponIndex(View view){
        Intent intent = new Intent(this, WeaponsIndex.class);
        intent.putExtra(EXTRA_INTEGER, 2);
        startActivity(intent);
    }

    public void openHeavyWeaponIndex(View view){
        Intent intent = new Intent(this, WeaponsIndex.class);
        intent.putExtra(EXTRA_INTEGER, 3);
        startActivity(intent);
    }

    public void openWarlockArmoMenu(View view){
        Intent intent = new Intent(this, WarlockArmorMenu.class);
        startActivity(intent);
    }

    public void openHunterArmoMenu(View view){
        Intent intent = new Intent(this, HunterArmorMenu.class);
        startActivity(intent);
    }

    public void openTitanArmoMenu(View view){
        Intent intent = new Intent(this, TitanArmorMenu.class);
        startActivity(intent);
    }
}
