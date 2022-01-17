package com.faustoc.zooapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class TercerActivity extends AppCompatActivity {

    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercero);

        spinner1 = findViewById(R.id.spinner);

        String [] options = {"Reptiles", "Aves", "Mamíferos", "Plantas"};//vector del contenido del spinner

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item, options);
        /*Creamos un adapter, necesario para colocar datos en un spinner --> (activity, modelo del spinner, vector a cargar)
        modelo de spinner por defecto --> android.R.layout.simple_spinner_item*/
        spinner1.setAdapter(adapter);
    }


}