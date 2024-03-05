package com.example.apppreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InterfazFinCuestionario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_fin_cuestionario);
    }

    public void btnOK(View vista){
        Intent intencion = new Intent(getApplicationContext(), Resumen.class);
        startActivity(intencion);
        finish();
    }



}