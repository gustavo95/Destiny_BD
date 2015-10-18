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

import domain.quests.Quest;

public class QuestScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest_screen);

        Intent intent = getIntent();

        questLayout((Quest) intent.getSerializableExtra(QuestIndex.EXTRA_QUEST));
    }

    private void questLayout(Quest quest){

        TableLayout tl = (TableLayout) findViewById(R.id.tableQuest1);
        int lHeight = RelativeLayout.LayoutParams.WRAP_CONTENT;
        int lWidth = RelativeLayout.LayoutParams.FILL_PARENT;

        TableRow tr;
        Float f = new Float(0.70);

        tr = new TableRow(this);
        tr.setBackgroundColor(Color.rgb(127, 127, 127));

        ImageButton image = new ImageButton(this);
        image.setImageDrawable(getResources().getDrawable(quest.getImage()));
        image.setBackgroundColor(Color.TRANSPARENT);
        image.setScaleX(f);
        image.setScaleY(f);
        tr.addView(image);

        Button name = new Button(this);
        name.setText("\n\n\n\n" + quest.getName());
        name.setTextSize(16);
        name.setBackgroundColor(Color.TRANSPARENT);
        tr.addView(name);

        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        tl = (TableLayout) findViewById(R.id.tableQuest2);

        tr = new TableRow(this);
        TextView tv = new TextView(this);
        tv.setTextSize(16);
        tv.setText("\tDescrição: ");
        tv.setTextColor(Color.rgb(206, 174, 51));
        tr.addView(tv);
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        tr = new TableRow(this);
        TextView description = new TextView(this);
        description.setTextSize(14);
        description.setText("\t\t" + quest.getDescription());
        description.setTextColor(Color.WHITE);
        tr.addView(description);
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        tr = new TableRow(this);
        tv = new TextView(this);
        tv.setTextSize(16);
        tv.setText("\tRecompensas: ");
        tv.setTextColor(Color.rgb(206, 174, 51));
        tr.addView(tv);
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        tr = new TableRow(this);
        TextView reward = new TextView(this);
        reward.setTextSize(14);
        reward.setText("\t\t" + quest.getRewards());
        reward.setTextColor(Color.WHITE);
        tr.addView(reward);
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));

        tl = (TableLayout) findViewById(R.id.tableQuest3);

        tr = new TableRow(this);
        tv = new TextView(this);
        tv.setTextSize(16);
        tv.setText("\n\tNumero de passos: ");
        tv.setTextColor(Color.rgb(206, 174, 51));
        TextView steps = new TextView(this);
        steps.setTextSize(16);
        steps.setText("\n" + quest.getSteps());
        steps.setTextColor(Color.WHITE);
        tr.addView(tv);
        tr.addView(steps);
        tl.addView(tr, new RelativeLayout.LayoutParams(lWidth, lHeight));
    }

}
