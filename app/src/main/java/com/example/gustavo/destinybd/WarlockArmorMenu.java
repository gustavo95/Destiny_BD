package com.example.gustavo.destinybd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import domain.armorsLists.WarlockArmsList;
import domain.armorsLists.WarlockChestsList;
import domain.armorsLists.WarlockHelmetsList;
import domain.armorsLists.WarlockLegsList;


public class WarlockArmorMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warlock_armor_menu);
    }

    public void openWarlockHemeltIndex(View view){
        Intent intent = new Intent(this, ArmorsIndex.class);
        intent.putExtra(ItemsMenu.EXTRA_LIST, new WarlockHelmetsList());
        startActivity(intent);
    }

    public void openWarlockChestIndex(View view){
        Intent intent = new Intent(this, ArmorsIndex.class);
        intent.putExtra(ItemsMenu.EXTRA_LIST, new WarlockChestsList());
        startActivity(intent);
    }

    public void openWarlockArmIndex(View view){
        Intent intent = new Intent(this, ArmorsIndex.class);
        intent.putExtra(ItemsMenu.EXTRA_LIST, new WarlockArmsList());
        startActivity(intent);
    }

    public void openWarlockLegIndex(View view){
        Intent intent = new Intent(this, ArmorsIndex.class);
        intent.putExtra(ItemsMenu.EXTRA_LIST, new WarlockLegsList());
        startActivity(intent);
    }
}
