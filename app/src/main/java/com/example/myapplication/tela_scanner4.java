package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class tela_scanner4 extends AppCompatActivity {

    TextView textView, textView2, textView3, textView5, textView8 , textView6, textView9;
    ImageView imageView, imageView12, imageView2, imageView4, imageView6, imageView19, imageView13, imageView29, imageView21 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_scanner4);

        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView21 = (ImageView) findViewById(R.id.imageView21);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView29 = (ImageView) findViewById(R.id.imageView29);
        imageView19 = (ImageView) findViewById(R.id.imageView19);
        imageView13 = (ImageView) findViewById(R.id.imageView13);
    }
}
