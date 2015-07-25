package com.example.gustavo.destinybd;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
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

        TableLayout tl = (TableLayout) findViewById(R.id.tableWeapon1);
        int lHeight = RelativeLayout.LayoutParams.WRAP_CONTENT;
        int lWidth = RelativeLayout.LayoutParams.FILL_PARENT;

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

        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        tl = (TableLayout) findViewById(R.id.tableWeapon2);
        tr = new TableRow(this);
        attackLayout(tr, weapon);
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        tl = (TableLayout) findViewById(R.id.tableWeapon3);
        attributesLayout(tl, weapon);

        if(weapon.getPerks() != null){
            tl = (TableLayout) findViewById(R.id.tableWeapon4);
            perksLayout(tl, weapon);
        }

        if(weapon.getLocation() != null){
            tl = (TableLayout) findViewById(R.id.tableWeapon4);
            locationLayout(tl, weapon);
        }
    }

    private void attackLayout(TableRow tr, Weapon weapon){

        TextView tv = new TextView(this);
        tv.setTextSize(16);
        tv.setText("\n\tAtaque: ");
        tv.setTextColor(Color.rgb(206,174,51));

        SpannableStringBuilder ssb = new SpannableStringBuilder("\n   " + weapon.getAttack());

        TextView attack = new TextView(this);
        attack.setTextSize(16);

        if(weapon.getElement() == Elements.kinetic){
            attack.setTextColor(Color.WHITE);
            Bitmap element = BitmapFactory.decodeResource(getResources(), R.drawable.kinetic_damage);
            ssb.setSpan( new ImageSpan(element), 2, 3, Spannable.SPAN_INCLUSIVE_INCLUSIVE );
        }
        if(weapon.getElement() == Elements.solar){
            attack.setTextColor(Color.rgb(245, 124, 43));
            Bitmap element = BitmapFactory.decodeResource(getResources(), R.drawable.solar_damage);
            ssb.setSpan( new ImageSpan(element), 2, 3, Spannable.SPAN_INCLUSIVE_INCLUSIVE );
        }
        if(weapon.getElement() == Elements.arc){
            attack.setTextColor(Color.rgb(132, 191, 232));
            Bitmap element = BitmapFactory.decodeResource(getResources(), R.drawable.arc_damage);
            ssb.setSpan( new ImageSpan(element), 2, 3, Spannable.SPAN_INCLUSIVE_INCLUSIVE );
        }
        if(weapon.getElement() == Elements.vacuo){
            attack.setTextColor(Color.rgb(190, 147, 216));
            Bitmap element = BitmapFactory.decodeResource(getResources(), R.drawable.void_damage);
            ssb.setSpan( new ImageSpan(element), 2, 3, Spannable.SPAN_INCLUSIVE_INCLUSIVE );
        }
        if(weapon.getElement() == Elements.random){
            attack.setTextColor(Color.WHITE);
            Bitmap element = BitmapFactory.decodeResource(getResources(), R.drawable.multiple_damage_black);
            ssb.setSpan( new ImageSpan(element), 2, 3, Spannable.SPAN_INCLUSIVE_INCLUSIVE );
        }

        attack.setText(ssb, TextView.BufferType.SPANNABLE);

        tr.addView(tv);
        tr.addView(attack);

    }

    private void attributesLayout(TableLayout tl, Weapon weapon){
        int lHeight = RelativeLayout.LayoutParams.WRAP_CONTENT;
        int lWidth = RelativeLayout.LayoutParams.FILL_PARENT;

        TableRow tr = new TableRow(this);
        TextView tv = new TextView(this);
        tv.setText("\tAtributos:");
        tv.setTextSize(16);
        tv.setTextColor(Color.rgb(206,174,51));
        tr.addView(tv);
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        tr = new TableRow(this);
        if(weapon.getType().contentEquals("Fuzil de Fusão")){
            attributeBar(tr, "Carga:   \t\t", weapon.getAttributes().getRateFire());
        }
        else{
            attributeBar(tr, "Cadência:   \t\t", weapon.getAttributes().getRateFire());
        }
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        tr = new TableRow(this);
        if(weapon.getType().contentEquals("Lança-foguetes")){
            attributeBar(tr, "Explosão:   \t\t", weapon.getAttributes().getImpact());
        }
        else {
            attributeBar(tr, "Impacto:   \t\t", weapon.getAttributes().getImpact());
        }
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        tr = new TableRow(this);
        attributeBar(tr, "Alcance:   \t\t", weapon.getAttributes().getRange());
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        tr = new TableRow(this);
        attributeBar(tr, "Estabilidade:   \t\t", weapon.getAttributes().getStability());
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        tr = new TableRow(this);
        attributeBar(tr, "Recarga:   \t", weapon.getAttributes().getReload());
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        tr = new TableRow(this);
        TextView mag = new TextView(this);
        Integer i = new Integer(weapon.getAttributes().getMag());
        mag.setText("\t\tCarregador:  " + i.toString());
        mag.setTextSize(15);
        mag.setTextColor(Color.WHITE);
        tr.addView(mag);
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));
    }

    private void attributeBar(TableRow tr, String attributeName, int attributeValue){

        TextView tv = new TextView(this);
        tv.setText("\t\t" + attributeName);
        tv.setTextSize(15);
        tv.setTextColor(Color.WHITE);
        tr.addView(tv);

        ProgressBar bar = new ProgressBar(this, null, android.R.attr.progressBarStyleHorizontal);
        bar.setIndeterminate(false);
        bar.getIndeterminateDrawable().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN);
        bar.getProgressDrawable().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN);
        bar.setMax(100);
        bar.setProgress(attributeValue);
        bar.setScaleY(new Float(2.5));
        bar.setScaleX(new Float(1.5));
        tr.addView(bar);

        tv = new TextView(this);
        tv.setText("\t\t" + attributeValue + "                       ");
        tv.setTextSize(15);
        tv.setTextColor(Color.WHITE);
        tr.addView(tv);
    }

    private void perksLayout(TableLayout tl, Weapon weapon){
        int lHeight = RelativeLayout.LayoutParams.WRAP_CONTENT;
        int lWidth = RelativeLayout.LayoutParams.FILL_PARENT;

        TableRow tr = new TableRow(this);
        TextView tv = new TextView(this);
        tv.setText("\tVantagens Principais:");
        tv.setTextSize(16);
        tv.setTextColor(Color.rgb(206,174,51));
        tr.addView(tv);
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        tr = new TableRow(this);
        tv = new TextView(this);
        tv.setText("\t\t" + weapon.getPerks().getPerk1());
        tv.setTextSize(14);
        tv.setTextColor(Color.WHITE);
        tr.addView(tv);
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        if(weapon.getPerks().getPerk2() != null){
            tr = new TableRow(this);
            tv = new TextView(this);
            tv.setText("\t\t" + weapon.getPerks().getPerk2());
            tv.setTextSize(14);
            tv.setTextColor(Color.WHITE);
            tr.addView(tv);
            tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));
        }

        if(weapon.getPerks().getPerk3() != null){
            tr = new TableRow(this);
            tv = new TextView(this);
            tv.setText("\t\t" + weapon.getPerks().getPerk3());
            tv.setTextSize(14);
            tv.setTextColor(Color.WHITE);
            tr.addView(tv);
            tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));
        }
    }

    private void locationLayout(TableLayout tl, Weapon weapon){
        int lHeight = RelativeLayout.LayoutParams.WRAP_CONTENT;
        int lWidth = RelativeLayout.LayoutParams.FILL_PARENT;

        TableRow tr = new TableRow(this);
        TextView tv = new TextView(this);
        tv.setText("\tOnde encontrar: ");
        tv.setTextSize(16);
        tv.setTextColor(Color.rgb(206,174,51));
        tr.addView(tv);
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        tr = new TableRow(this);
        tv = new TextView(this);
        tv.setText("\t\t" + weapon.getLocation());
        tv.setTextSize(14);
        tv.setTextColor(Color.WHITE);
        tr.addView(tv);
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));
    }
}
