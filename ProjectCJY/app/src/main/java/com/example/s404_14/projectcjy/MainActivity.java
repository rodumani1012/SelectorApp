package com.example.s404_14.projectcjy;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

import static android.R.id.text1;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    RelativeLayout goToSel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = (TextView)findViewById(R.id.textView0);

        Typeface fonttype = Typeface.createFromAsset(getAssets(), "appfont.ttf");
        textView.setTypeface(fonttype);

        ImageView introImage = (ImageView) findViewById(R.id.introImage);
        GlideDrawableImageViewTarget imageViewTarget = new GlideDrawableImageViewTarget(introImage);
        Glide.with(this).load(R.raw.balloons).into(imageViewTarget);

        goToSel = (RelativeLayout)findViewById(R.id.layout1);

        goToSel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1 = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(it1);
                finish();
            }
        });
    }
}
