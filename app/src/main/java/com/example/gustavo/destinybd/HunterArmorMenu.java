package com.example.gustavo.destinybd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import storage.armorsLists.HunterArmsList;
import storage.armorsLists.HunterChestsList;
import storage.armorsLists.HunterHelmetsList;
import storage.armorsLists.HunterLegsList;

public class HunterArmorMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hunter_armor_menu);
    }

    public void openHunterHemeltIndex(View view){
        Intent intent = new Intent(this, ArmorsIndex.class);
        intent.putExtra(ItemsMenu.EXTRA_LIST, new HunterHelmetsList());
        startActivity(intent);
    }

    public void openHunterChestIndex(View view){
        Intent intent = new Intent(this, ArmorsIndex.class);
        intent.putExtra(ItemsMenu.EXTRA_LIST, new HunterChestsList());
        startActivity(intent);
    }

    public void openHunterArmsIndex(View view){
        Intent intent = new Intent(this, ArmorsIndex.class);
        intent.putExtra(ItemsMenu.EXTRA_LIST, new HunterArmsList());
        startActivity(intent);
    }

    public void openHunterLegsIndex(View view){
        Intent intent = new Intent(this, ArmorsIndex.class);
        intent.putExtra(ItemsMenu.EXTRA_LIST, new HunterLegsList());
        startActivity(intent);
    }
}
