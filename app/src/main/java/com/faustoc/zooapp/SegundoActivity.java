package com.faustoc.zooapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
    }

    public void seeList(View v){

        Intent intent = new Intent(this, TercerActivity.class);
        startActivity(intent);
    }

    public void about(View v){
        Intent intent = new Intent(this, CuartoActivity.class);
        startActivity(intent);
    }

    public void profile(View v){
        Intent intent = new Intent(this, QuintoActivity.class);
        startActivity(intent);
    }
}