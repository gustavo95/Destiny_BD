package com.example.gustavo.destinybd;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.List;

import domain.quests.Quest;
import domain.quests.QuestList;

public class QuestIndex extends Activity {
    public final static String EXTRA_QUEST = "com.example.gustavo.destinybd.QUEST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest_index);

        questsButtons(new QuestList().getQuests());
    }

    private void questsButtons(List<Quest> questList){
        Float f = new Float(0.40);

        ImageButton image;
        Button name;
        TextView nothing;

        TableRow tr;
        TableLayout tl = (TableLayout) findViewById(R.id.tableIndex);
        int lHeight = RelativeLayout.LayoutParams.WRAP_CONTENT;
        int lWidth =  RelativeLayout.LayoutParams.FILL_PARENT;

        try {
            for (Quest q : questList) {
                final Quest quest = q;
                tr = new TableRow(this);
                tr.setBackgroundColor(Color.GRAY);


                image = new ImageButton(this);
                image.setImageDrawable(getResources().getDrawable(q.getImage()));
                image.setBackgroundColor(Color.WHITE);
                image.setScaleX(f);
                image.setScaleY(f);
                image.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openQuestScreen(quest);
                    }
                });
                tr.addView(image);

                name = new Button(this);
                name.setTextSize(16);
                name.setText("\n" + q.getName());
                name.setBackgroundColor(Color.TRANSPARENT);
                name.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openQuestScreen(quest);
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

    public void openQuestScreen(Quest q){
        //Intent intent = new Intent(this, QuestScreen.class);
        //intent.putExtra(EXTRA_QUEST, q);
        //startActivity(intent);
    }
}
