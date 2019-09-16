package com.example.s404_14.projectcjy;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

import static android.R.id.text1;

public class ThirdActivity extends AppCompatActivity {
    TextView textView1, textView3;
    ImageButton goHome, goForth;
    private ImageView loadingImg;
    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        goHome = (ImageButton)findViewById(R.id.goHome);
        textView1 = (TextView)findViewById(R.id.textView1);
        textView3 = (TextView)findViewById(R.id.textView3);
        goForth = (ImageButton)findViewById(R.id.circleTouch);
        loadingImg = (ImageView)findViewById(R.id.loadingImg);
        imageView2 = (ImageView)findViewById(R.id.imageView2);



        Typeface fonttype = Typeface.createFromAsset(getAssets(), "appfont.ttf");
        textView1.setTypeface(fonttype);
        Typeface fonttype1 = Typeface.createFromAsset(getAssets(), "appfont.ttf");
        textView3.setTypeface(fonttype1);

        goHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1 = new Intent(ThirdActivity.this, SecondActivity.class);
                startActivity(it1);
                finish();
            }
        });


        goForth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingImg.setVisibility(View.VISIBLE);
                textView3.setVisibility(View.INVISIBLE);
                imageView2.setVisibility(View.INVISIBLE);
                loadingImg.post(new Runnable() {
                    @Override
                    public void run() {
                        ((AnimationDrawable) loadingImg.getBackground()).start();
                        new Thread(){
                            @Override
                            public void run() {
                                SystemClock.sleep(900);
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Intent it1 = new Intent(ThirdActivity.this, ForthActivity.class);
                                        startActivity(it1);
                                        finish();
                                    }
                                });
                            }
                        }.start();
                    }
                });

            }
        });


    }
}
