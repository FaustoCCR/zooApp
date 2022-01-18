package com.faustoc.zooapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QuintoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinto);
    }

    public void map (View v){
        Intent intent = new Intent(this, SegundoActivity.class);
        startActivity(intent);
    }

    public void list (View v){
        Intent intent = new Intent(this, TercerActivity.class);
        startActivity(intent);
    }

    public void about (View v){
        Intent intent = new Intent(this, CuartoActivity.class);
        startActivity(intent);
    }

}