package com.faustoc.zooapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SextoActivity extends AppCompatActivity {

    //variables
    private EditText cantidad_uno;
    private EditText cantidad_dos;
    private TextView precio1;
    private TextView precio2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexto);

        cantidad_uno = findViewById(R.id.cantidad1);
        cantidad_dos = findViewById(R.id.cantidad2);

        precio1 = findViewById(R.id.precio1);
        precio2 = findViewById(R.id.precio2);
    }

    public void comprarBoleto(View v){

        Toast.makeText(this,"Compra realizada exitosamente",Toast.LENGTH_LONG).show();

    }

    public void cancelar(View v){

        Intent intent = new Intent(this,CuartoActivity.class);
        startActivity(intent);
    }

    public void mostrarPrecio1(View v){
        final int precio = 5;
        int valor_cantidad = Integer.parseInt(cantidad_uno.getText().toString());
        precio1.setText(String.valueOf(valor_cantidad*precio));
    }

    public void mostrarPrecio2(View v){
        final int precio = 7;
        int valor_cantidad = Integer.parseInt(cantidad_dos.getText().toString());
        precio2.setText(String.valueOf(valor_cantidad*precio));
    }
}