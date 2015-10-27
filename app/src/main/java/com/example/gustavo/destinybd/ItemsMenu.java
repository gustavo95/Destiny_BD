package com.example.gustavo.destinybd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import dataBase.weaponsLists.HeavyWeaponsList;
import dataBase.weaponsLists.PrimaryWeaponsList;
import dataBase.weaponsLists.SpecialWeaponsList;

public class ItemsMenu extends Activity {
    public final static String EXTRA_LIST = "com.example.gustavo.destinybd.LIST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_menu);
    }

    public void openPrimaryWeaponIndex(View view){
        Intent intent = new Intent(this, WeaponsIndex.class);
        intent.putExtra(EXTRA_LIST, new PrimaryWeaponsList());
        startActivity(intent);
    }

    public void openSpecialWeaponIndex(View view){
        Intent intent = new Intent(this, WeaponsIndex.class);
        intent.putExtra(EXTRA_LIST, new SpecialWeaponsList());
        startActivity(intent);
    }

    public void openHeavyWeaponIndex(View view){
        Intent intent = new Intent(this, WeaponsIndex.class);
        intent.putExtra(EXTRA_LIST, new HeavyWeaponsList());
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
