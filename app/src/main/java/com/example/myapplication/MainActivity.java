package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton3, imageButton4, imageButton5 ;
    ImageView imageView4, imageView5, imageView7, imageView8, imageView13, imageView14, imageView15, imageView16 ;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView7 = (ImageView) findViewById(R.id.imageView7);
        imageView8 = (ImageView) findViewById(R.id.imageView8);
        searchView = (SearchView) findViewById(R.id.searchView);
        imageView13 = (ImageView) findViewById(R.id.imageView5);
        imageView14 = (ImageView) findViewById(R.id.imageView7);
        imageView15 = (ImageView) findViewById(R.id.imageView8);
        imageView16 = (ImageView) findViewById(R.id.imageView16);

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity_tela_scanner1 = new Intent(MainActivity.this, tela_scanner1.class);
                startActivity(activity_tela_scanner1 );
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity_tela_scanner1 = new Intent(MainActivity.this, tela_scanner1.class);
                startActivity(activity_tela_scanner1 );
            }
        });

    }
}
