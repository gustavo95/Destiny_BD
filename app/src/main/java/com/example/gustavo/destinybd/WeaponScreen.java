package com.example.gustavo.destinybd;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
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
        if(weapon.getName().length() >= 20){
            name.setTextSize(13);
        }
        else{
            name.setTextSize(16);
        }
        name.setBackgroundColor(Color.TRANSPARENT);
        tr.addView(name);

        tl.addView(tr, new RelativeLayout.LayoutParams(lHeight, lWidth));

        tr = new TableRow(this);

        attackLayout(tr, weapon);

        tl.addView(tr, new RelativeLayout.LayoutParams(lHeight, lWidth));
    }

    private void attackLayout(TableRow tr, Weapon weapon){

        SpannableStringBuilder ssb = new SpannableStringBuilder("\n\tAtaque:   " + weapon.getAttack());

        TextView attack = new TextView(this);
        attack.setTextSize(16);

        if(weapon.getElement() == Elements.kinetic){
            attack.setTextColor(Color.WHITE);
            Bitmap element = BitmapFactory.decodeResource(getResources(), R.drawable.kinetic_damage);
            ssb.setSpan( new ImageSpan(element), 10, 11, Spannable.SPAN_INCLUSIVE_INCLUSIVE );
        }
        if(weapon.getElement() == Elements.solar){
            attack.setTextColor(Color.rgb(245, 124, 43));
            Bitmap element = BitmapFactory.decodeResource(getResources(), R.drawable.solar_damage);
            ssb.setSpan( new ImageSpan(element), 10, 11, Spannable.SPAN_INCLUSIVE_INCLUSIVE );
        }
        if(weapon.getElement() == Elements.arc){
            attack.setTextColor(Color.rgb(132, 191, 232));
            Bitmap element = BitmapFactory.decodeResource(getResources(), R.drawable.arc_damage);
            ssb.setSpan( new ImageSpan(element), 10, 11, Spannable.SPAN_INCLUSIVE_INCLUSIVE );
        }
        if(weapon.getElement() == Elements.vacuo){
            attack.setTextColor(Color.rgb(190, 147, 216));
            Bitmap element = BitmapFactory.decodeResource(getResources(), R.drawable.void_damage);
            ssb.setSpan( new ImageSpan(element), 10, 11, Spannable.SPAN_INCLUSIVE_INCLUSIVE );
        }
        if(weapon.getElement() == Elements.random){
            attack.setTextColor(Color.WHITE);
            Bitmap element = BitmapFactory.decodeResource(getResources(), R.drawable.multiple_damage_black);
            ssb.setSpan( new ImageSpan(element), 10, 11, Spannable.SPAN_INCLUSIVE_INCLUSIVE );
        }

        attack.setText(ssb, TextView.BufferType.SPANNABLE);

        tr.addView(attack);

    }
}
