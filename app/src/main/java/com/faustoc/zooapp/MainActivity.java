package com.faustoc.zooapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ingresar (View view){

        //Objeto para enlazarme al segundo activity
        Intent intent = new Intent(this, SegundoActivity.class);
        //Iniciar el activity
        startActivity(intent);


    }
}