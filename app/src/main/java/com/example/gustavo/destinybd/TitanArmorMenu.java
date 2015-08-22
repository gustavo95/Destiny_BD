package com.example.gustavo.destinybd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import domain.armorsLists.TitanArmsList;
import domain.armorsLists.TitanChestsList;
import domain.armorsLists.TitanHelmetsList;
import domain.armorsLists.TitanLegsList;

public class TitanArmorMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titan_armor_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_titan_armor_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
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
