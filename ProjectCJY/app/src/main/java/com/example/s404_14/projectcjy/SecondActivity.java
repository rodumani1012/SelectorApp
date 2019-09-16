package com.example.s404_14.projectcjy;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import static com.example.s404_14.projectcjy.R.id.textResult;

public class SecondActivity extends AppCompatActivity {
    TextView text1, text2;
    ImageButton goSel;
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8;
    static ArrayList<String> edValues = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        text1 = (TextView)findViewById(R.id.textView);
        text2 = (TextView)findViewById(R.id.textView2);
        goSel = (ImageButton)findViewById(R.id.imageButton);
        ed1 = (EditText)findViewById(R.id.editText1);
        ed2 = (EditText)findViewById(R.id.editText2);
        ed3 = (EditText)findViewById(R.id.editText3);
        ed4 = (EditText)findViewById(R.id.editText4);
        ed5 = (EditText)findViewById(R.id.editText5);
        ed6 = (EditText)findViewById(R.id.editText6);
        ed7 = (EditText)findViewById(R.id.editText7);
        ed8 = (EditText)findViewById(R.id.editText8);

        Typeface fonttype = Typeface.createFromAsset(getAssets(), "appfont.ttf");
        text1.setTypeface(fonttype);
        Typeface fonttype2 = Typeface.createFromAsset(getAssets(), "appfont.ttf");
        text2.setTypeface(fonttype2);

        goSel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int truecount = 0;
                int edArray[] = new int[8];
                edArray[0] = ed1.getText().toString().length();
                edArray[1] = ed2.getText().toString().length();
                edArray[2] = ed3.getText().toString().length();
                edArray[3] = ed4.getText().toString().length();
                edArray[4] = ed5.getText().toString().length();
                edArray[5] = ed6.getText().toString().length();
                edArray[6] = ed7.getText().toString().length();
                edArray[7] = ed8.getText().toString().length();

                edValues.clear();
               /*
               for(int i=0; i<edArray.length; i++) {
                    if (edArray[i] >0 ) {
                        if (i == 0 ){
                            edValues.add(ed1.getText().toString());
                        } else if (i == 1 ){
                            edValues.add(ed2.getText().toString());
                        } else if (i == 2 ){
                            edValues.add(ed3.getText().toString());
                        } else if (i == 3 ){
                            edValues.add(ed4.getText().toString());
                        } else if (i == 4 ){
                            edValues.add(ed5.getText().toString());
                        } else if (i == 5 ){
                            edValues.add(ed6.getText().toString());
                        } else if (i == 6 ){
                            edValues.add(ed7.getText().toString());
                        } else if (i == 7 ){
                            edValues.add(ed8.getText().toString());
                        }

                        truecount++;
                    }
                }
                */
                int length = edArray.length;
                for (i=0; i<length; i++) {
                    edArray1[truecount++] = (i==0) ? ed1.getText().toString() :
                            ((i==1) ? ed2.getText().toString() :
                                    ((i==2) ? ed3.getText().toString() :
                                            ((i==3) ? ed4.getText().toString() :
                                                    ((i==4) ? ed5.getText().toString() :
                                                            ((i==5) ? ed6.getText().toString() :
                                                                    ((i==6) ? ed7.getText().toString() :
                                                                            ((i==7) ? ed8.getText().toString() : edArray1[truecount])))))));
                }

                if (truecount > 1){
                    Intent it1 = new Intent(SecondActivity.this, ThirdActivity.class);

                    startActivity(it1);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "2가지 이상 입력하세요", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
