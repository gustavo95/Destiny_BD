package com.example.gustavo.destinybd;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.List;

import domain.ItemsLists.PrimaryWeaponsList;
import domain.weapons.Weapon;


public class WeaponsIndex extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        setContentView(R.layout.activity_weapons_index);

        if(intent.getIntExtra(ItemsMenu.EXTRA_INTEGER, 0) == 1){
            PrimaryWeaponsList weapons = new PrimaryWeaponsList();
            primaryWeaponsButtons(weapons.getWeapons());
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_weapons_index, menu);
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

    @Override
    public void onStop(){
        super.onStop();
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
    }

    private void primaryWeaponsButtons(List<Weapon> weaponsList){
        ImageButton image;
        Button name;
        TextView nothing;

        TableRow tr;
        TableLayout tl = (TableLayout) findViewById(R.id.tableIndex);
        int lHeight = RelativeLayout.LayoutParams.WRAP_CONTENT;
        int lWidth = RelativeLayout.LayoutParams.WRAP_CONTENT;

        try {
            for (Weapon w : weaponsList) {
                tr = new TableRow(this);
                tr.setBackgroundColor(w.color());
                Float f;

                image = new ImageButton(this);
                image.setImageDrawable(getResources().getDrawable(w.getImage()));
                image.setBackgroundColor(Color.TRANSPARENT);
                f = new Float(0.75);
                image.setScaleX(f);
                image.setScaleY(f);
                tr.addView(image);

                name = new Button(this);
                name.setTextSize(16);
                name.setText("\n" + w.getName() + "\n" + w.getType() + "\nAtaque: " + w.getAttack());
                name.setBackgroundColor(Color.TRANSPARENT);
                tr.addView(name);

                tl.addView(tr, new RelativeLayout.LayoutParams(lHeight, lWidth));

                tr = new TableRow(this);
                nothing = new TextView(this);
                nothing.setTextSize(1);
                nothing.setText("");
                tr.addView(nothing);
                tl.addView(tr, new RelativeLayout.LayoutParams(lHeight, lWidth));
            }
        }catch (Exception E){
            System.err.println("Erro!");
        }
    }

}
