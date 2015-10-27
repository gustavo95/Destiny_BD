package com.example.gustavo.destinybd;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.List;

import dataBase.weaponsLists.HeavyWeaponsList;
import dataBase.weaponsLists.PrimaryWeaponsList;
import dataBase.weaponsLists.SpecialWeaponsList;
import dataBase.weaponsLists.WeaponsList;
import domain.weapons.Weapon;


public class WeaponsIndex extends Activity {
    public final static String EXTRA_WEAPON = "com.example.gustavo.destinybd.WEAPON";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        setContentView(R.layout.activity_weapons_index);

        WeaponsList al = (WeaponsList) intent.getSerializableExtra(ItemsMenu.EXTRA_LIST);
        weaponsButtons(al.getWeapons());
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
