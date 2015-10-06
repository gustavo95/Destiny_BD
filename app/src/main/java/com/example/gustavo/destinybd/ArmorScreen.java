package com.example.gustavo.destinybd;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import domain.armors.Armor;

public class ArmorScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armor_screen);

        Intent intent = getIntent();

        ArmorLayout((Armor) intent.getSerializableExtra(ArmorsIndex.EXTRA_ARMOR));
    }

    private void ArmorLayout(Armor armor){

        TableLayout tl = (TableLayout) findViewById(R.id.tableArmor1);
        int lHeight = RelativeLayout.LayoutParams.WRAP_CONTENT;
        int lWidth = RelativeLayout.LayoutParams.FILL_PARENT;

        TableRow tr;
        Float f = new Float(0.75);

        tr = new TableRow(this);
        tr.setBackgroundColor(armor.color());

        ImageButton image = new ImageButton(this);
        image.setImageDrawable(getResources().getDrawable(armor.getImage()));
        image.setBackgroundColor(Color.TRANSPARENT);
        image.setScaleX(f);
        image.setScaleY(f);
        tr.addView(image);

        Button name = new Button(this);
        name.setText("\n" + armor.getName());
        name.setTextSize(16);
        name.setBackgroundColor(Color.TRANSPARENT);
        tr.addView(name);

        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        tl = (TableLayout) findViewById(R.id.tableArmor2);
        attributesLayout(tl, armor);

        if(armor.getPerks() != null){
            tl = (TableLayout) findViewById(R.id.tableArmor3);
            perksLayout(tl, armor);
        }

        if(armor.getLocation() != null){
            tl = (TableLayout) findViewById(R.id.tableArmor3);
            locationLayout(tl, armor);
        }
    }

    private void attributesLayout(TableLayout tl, Armor armor){
        int lHeight = RelativeLayout.LayoutParams.WRAP_CONTENT;
        int lWidth = RelativeLayout.LayoutParams.FILL_PARENT;

        TableRow tr = new TableRow(this);
        TextView tv = new TextView(this);
        tv.setTextSize(16);
        tv.setText("\n\tDefesa:");
        tv.setTextColor(Color.rgb(206, 174, 51));
        TextView defense = new TextView(this);
        defense.setTextSize(16);
        defense.setText("\n" + armor.getDefense());
        defense.setTextColor(Color.WHITE);
        tr.addView(tv);
        tr.addView(defense);
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        tr = new TableRow(this);
        tv = new TextView(this);
        tv.setText("\tAtributos:");
        tv.setTextSize(16);
        tv.setTextColor(Color.rgb(206,174,51));
        tr.addView(tv);
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        tr = new TableRow(this);
        TextView inte = new TextView(this);
        Integer i = new Integer(armor.getAttributes().getIntellect());
        inte.setText("\t\tIntelecto:  " + i.toString());
        inte.setTextSize(15);
        inte.setTextColor(Color.WHITE);
        tr.addView(inte);
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        tr = new TableRow(this);
        TextView disc = new TextView(this);
        i = new Integer(armor.getAttributes().getDiscipline());
        disc.setText("\t\tDisciplina:  " + i.toString());
        disc.setTextSize(15);
        disc.setTextColor(Color.WHITE);
        tr.addView(disc);
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        tr = new TableRow(this);
        TextView stre = new TextView(this);
        i = new Integer(armor.getAttributes().getStrength());
        stre.setText("\t\tIntelecto:  " + i.toString());
        stre.setTextSize(15);
        stre.setTextColor(Color.WHITE);
        tr.addView(stre);
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));
    }

    private void perksLayout(TableLayout tl, Armor armor){
        int lHeight = RelativeLayout.LayoutParams.WRAP_CONTENT;
        int lWidth = RelativeLayout.LayoutParams.FILL_PARENT;

        TableRow tr = new TableRow(this);
        TextView tv = new TextView(this);
        tv.setText("\tVantagens Principais:");
        tv.setTextSize(16);
        tv.setTextColor(Color.rgb(206, 174, 51));
        tr.addView(tv);
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        tr = new TableRow(this);
        tv = new TextView(this);
        tv.setText("\t\t" + armor.getPerks().getPerk1());
        tv.setTextSize(14);
        tv.setTextColor(Color.WHITE);
        tr.addView(tv);
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        if(armor.getPerks().getPerk2() != null){
            tr = new TableRow(this);
            tv = new TextView(this);
            tv.setText("\t\t" + armor.getPerks().getPerk2());
            tv.setTextSize(14);
            tv.setTextColor(Color.WHITE);
            tr.addView(tv);
            tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));
        }

        if(armor.getPerks().getPerk3() != null){
            tr = new TableRow(this);
            tv = new TextView(this);
            tv.setText("\t\t" + armor.getPerks().getPerk3());
            tv.setTextSize(14);
            tv.setTextColor(Color.WHITE);
            tr.addView(tv);
            tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));
        }
    }

    private void locationLayout(TableLayout tl, Armor armor){
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
        tv.setText("\t\t" + armor.getLocation());
        tv.setTextSize(14);
        tv.setTextColor(Color.WHITE);
        tr.addView(tv);
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));
    }

}
