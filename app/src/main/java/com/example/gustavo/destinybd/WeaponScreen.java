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

import domain.Elements;
import domain.weapons.Weapon;


public class WeaponScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapon_screen);

        Intent intent = getIntent();

        weaponLayout((Weapon) intent.getSerializableExtra(WeaponsIndex.EXTRA_WEAPON));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_weapon_screen, menu);
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

    private void weaponLayout(Weapon weapon){

        TableLayout tl = (TableLayout) findViewById(R.id.tableWeapon);
        int lHeight = RelativeLayout.LayoutParams.FILL_PARENT;
        int lWidth = RelativeLayout.LayoutParams.WRAP_CONTENT;

        TableRow tr;
        Float f = new Float(0.75);

        tr = new TableRow(this);
        tr.setBackgroundColor(weapon.color());

        ImageButton image = new ImageButton(this);
        image.setImageDrawable(getResources().getDrawable(weapon.getImage()));
        image.setBackgroundColor(Color.TRANSPARENT);
        image.setScaleX(f);
        image.setScaleY(f);
        tr.addView(image);

        Button name = new Button(this);
        name.setText("\n" + weapon.getName() + "\n" + weapon.getType());
        name.setTextSize(16);
        name.setBackgroundColor(Color.TRANSPARENT);
        tr.addView(name);

        tl.addView(tr, new RelativeLayout.LayoutParams(lHeight, lWidth));

        tr = new TableRow(this);

        attackLayout(tr, weapon);

        tl.addView(tr, new RelativeLayout.LayoutParams(lHeight, lWidth));
    }

    private void attackLayout(TableRow tr, Weapon weapon){
        ImageButton damage = new ImageButton(this);
        damage.setBackgroundColor(Color.TRANSPARENT);

        TextView attack = new TextView(this);
        attack.setTextSize(16);
        attack.setText("\n\t\tAtaque: " + weapon.getAttack());

        if(weapon.getElement() == Elements.kinetic){
            damage.setImageDrawable(getResources().getDrawable(R.drawable.kinetic_damage));
            attack.setTextColor(Color.WHITE);
        }
        if(weapon.getElement() == Elements.solar){
            damage.setImageDrawable(getResources().getDrawable(R.drawable.solar_damage));
            attack.setTextColor(Color.rgb(245, 124, 43));
        }
        if(weapon.getElement() == Elements.arc){
            damage.setImageDrawable(getResources().getDrawable(R.drawable.arc_damage));
            attack.setTextColor(Color.rgb(132, 191, 232));
        }
        if(weapon.getElement() == Elements.vacuo){
            damage.setImageDrawable(getResources().getDrawable(R.drawable.void_damage));
            attack.setTextColor(Color.rgb(190, 147, 216));
        }
        if(weapon.getElement() == Elements.random){
            damage.setImageDrawable(getResources().getDrawable(R.drawable.multiple_damage_black));
            attack.setTextColor(Color.WHITE);
        }

        Float f = new Float(0.70);
        damage.setScaleX(f);
        damage.setScaleY(f);

        tr.addView(attack);
        tr.addView(damage);
    }
}
