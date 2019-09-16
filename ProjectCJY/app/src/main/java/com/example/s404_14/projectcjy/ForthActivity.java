package com.example.s404_14.projectcjy;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class ForthActivity extends AppCompatActivity {
    TextView textView4, textResult;
    ImageButton goHome, retry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);


        goHome = (ImageButton)findViewById(R.id.goHome);
        textView4 = (TextView)findViewById(R.id.textView4);
        textResult = (TextView)findViewById(R.id.textResult);
        retry = (ImageButton)findViewById(R.id.retry);

        Typeface fonttype = Typeface.createFromAsset(getAssets(), "appfont.ttf");
        textView4.setTypeface(fonttype);
        Typeface fonttype1 = Typeface.createFromAsset(getAssets(), "appfont.ttf");
        textResult.setTypeface(fonttype1);

        int truecount = SecondActivity.edValues.size();
        Random strArray = new Random();
        int rndText = strArray.nextInt(truecount);
        String txtReuslt = SecondActivity.edValues.get(rndText);



        textResult.setText(txtReuslt);



        goHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1 = new Intent(ForthActivity.this, SecondActivity.class);
                startActivity(it1);
                finish();
            }
        });
        retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1 = new Intent(ForthActivity.this, ThirdActivity.class);
                startActivity(it1);
                finish();
            }
        });

    }
}
