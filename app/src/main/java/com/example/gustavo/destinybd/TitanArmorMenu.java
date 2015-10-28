package com.example.gustavo.destinybd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import storage.armorsLists.TitanArmsList;
import storage.armorsLists.TitanChestsList;
import storage.armorsLists.TitanHelmetsList;
import storage.armorsLists.TitanLegsList;

public class TitanArmorMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titan_armor_menu);
    }

    public void openTitanHemeltIndex(View view){
        Intent intent = new Intent(this, ArmorsIndex.class);
        intent.putExtra(ItemsMenu.EXTRA_LIST, new TitanHelmetsList());
        startActivity(intent);
    }

    public void openTitanChestIndex(View view){
        Intent intent = new Intent(this, ArmorsIndex.class);
        intent.putExtra(ItemsMenu.EXTRA_LIST, new TitanChestsList());
        startActivity(intent);
    }

    public void openTitanArmIndex(View view){
        Intent intent = new Intent(this, ArmorsIndex.class);
        intent.putExtra(ItemsMenu.EXTRA_LIST, new TitanArmsList());
        startActivity(intent);
    }

    public void openTitanLegsIndex(View view){
        Intent intent = new Intent(this, ArmorsIndex.class);
        intent.putExtra(ItemsMenu.EXTRA_LIST, new TitanLegsList());
        startActivity(intent);
    }
}
