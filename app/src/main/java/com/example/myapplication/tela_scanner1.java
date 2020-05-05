package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;


public class tela_scanner1 extends AppCompatActivity {


    ImageView imageView9, imageView10, imageView11, imageView12, imageView, imageView3, imageView6, imageView2  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_scanner1);

        imageView =  findViewById(R.id.imageView);
        imageView2 =  findViewById(R.id.imageView2);
        imageView3 =  findViewById(R.id.imageView3);
        imageView6 =  findViewById(R.id.imageView6);
        imageView9 =  findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 =  findViewById(R.id.imageView11);
        imageView12 =  findViewById(R.id.imageView12);

        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity_tela_scanner3 = new Intent(tela_scanner1.this, tela_scanner3.class);
                startActivity(activity_tela_scanner3 );
            }
        });

        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
