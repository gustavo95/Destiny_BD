package com.example.gustavo.destinybd;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.List;

import domain.WeaponsLists.HeavyWeaponsList;
import domain.WeaponsLists.PrimaryWeaponsList;
import domain.WeaponsLists.SpecialWeaponsList;
import domain.weapons.Weapon;


public class WeaponsIndex extends Activity {
    public final static String EXTRA_WEAPON = "com.example.gustavo.destinybd.WEAPON";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        setContentView(R.layout.activity_weapons_index);

        if(intent.getIntExtra(ItemsMenu.EXTRA_INTEGER, 1) == 1){
            PrimaryWeaponsList weapons = new PrimaryWeaponsList();
            weaponsButtons(weapons.getWeapons());
        }
        else if(intent.getIntExtra(ItemsMenu.EXTRA_INTEGER, 2) == 2) {
            SpecialWeaponsList weapons = new SpecialWeaponsList();
            weaponsButtons(weapons.getWeapons());
        }
        else if(intent.getIntExtra(ItemsMenu.EXTRA_INTEGER, 3) == 3) {
            HeavyWeaponsList weapons = new HeavyWeaponsList();
            weaponsButtons(weapons.getWeapons());
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

    private void weaponsButtons(List<Weapon> weaponsList){
        Float f = new Float(0.75);

        ImageButton image;
        Button name;
        TextView nothing;

        TableRow tr;
        TableLayout tl = (TableLayout) findViewById(R.id.tableIndex);
        int lHeight = RelativeLayout.LayoutParams.WRAP_CONTENT;
        int lWidth =  RelativeLayout.LayoutParams.FILL_PARENT;

        try {
            for (Weapon w : weaponsList) {
                final Weapon weapon = w;
                tr = new TableRow(this);
                tr.setBackgroundColor(w.color());


                image = new ImageButton(this);
                image.setImageDrawable(getResources().getDrawable(w.getImage()));
                image.setBackgroundColor(Color.TRANSPARENT);
                image.setScaleX(f);
                image.setScaleY(f);
                image.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openWeaponScreen(weapon);
                    }
                });
                tr.addView(image);

                name = new Button(this);
                name.setTextSize(16);
                name.setText("\n" + w.getName() + "\n" + w.getType() + "\nAtaque: " + w.getAttack());
                name.setBackgroundColor(Color.TRANSPARENT);
                name.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openWeaponScreen(weapon);
                    }
                });
                tr.addView(name);


                tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

                tr = new TableRow(this);
                nothing = new TextView(this);
                nothing.setTextSize(1);
                nothing.setText("");
                tr.addView(nothing);
                tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));
            }
        }catch (Exception E){
            System.err.println("Erro!");
        }
    }

    public void openWeaponScreen(Weapon w){
        Intent  intent = new Intent(this, WeaponScreen.class);
        intent.putExtra(EXTRA_WEAPON, w);
        startActivity(intent);
    }

}
