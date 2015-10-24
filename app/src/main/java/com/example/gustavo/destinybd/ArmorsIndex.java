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

import domain.armors.Armor;
import dataBase.armorsLists.ArmorList;

public class ArmorsIndex extends Activity {
    public final static String EXTRA_ARMOR = "com.example.gustavo.destinybd.ARMOR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armors_index);

        Intent intent = getIntent();

        ArmorList al = (ArmorList) intent.getSerializableExtra(ItemsMenu.EXTRA_LIST);
        armorsButtons(al.getArmors());

    }

    private void armorsButtons(List<Armor> armorList){
        Float f = new Float(0.75);

        ImageButton image;
        Button name;
        TextView nothing;

        TableRow tr;
        TableLayout tl = (TableLayout) findViewById(R.id.tableIndex);
        int lHeight = RelativeLayout.LayoutParams.WRAP_CONTENT;
        int lWidth =  RelativeLayout.LayoutParams.FILL_PARENT;

        try {
            for (Armor a : armorList) {
                final Armor armor = a;
                tr = new TableRow(this);
                tr.setBackgroundColor(a.color());


                image = new ImageButton(this);
                image.setImageDrawable(getResources().getDrawable(a.getImage()));
                image.setBackgroundColor(Color.TRANSPARENT);
                image.setScaleX(f);
                image.setScaleY(f);
                image.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openArmorScreen(armor);
                    }
                });
                tr.addView(image);

                name = new Button(this);
                name.setTextSize(16);
                name.setText("\n" + a.getName() + "\nDefesa: " + a.getDefense());
                name.setBackgroundColor(Color.TRANSPARENT);
                name.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openArmorScreen(armor);
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

    public void openArmorScreen(Armor w){
        Intent  intent = new Intent(this, ArmorScreen.class);
        intent.putExtra(EXTRA_ARMOR, w);
        startActivity(intent);
    }
}
