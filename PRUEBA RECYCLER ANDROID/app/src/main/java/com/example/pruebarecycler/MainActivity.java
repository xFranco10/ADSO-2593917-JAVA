package com.example.pruebarecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Persona> listado = new ArrayList<>();
        listado.add(new Persona("Oscar","Loaiza","90","M","Calle 20", "310383","default.png"));
        listado.add(new Persona("Andrey","Franco","20","M","Calle 22", "310384","default.png"));
        listado.add(new Persona("Gregorio","Pabon","60","M","Calle 25", "310385","default.png"));
        listado.add(new Persona("Carolina","Soto","70","F","Calle 30", "310386","default.png"));

        recycler = findViewById(R.id.recycler_contactos);

        AdaptadorContacto adaptador = new AdaptadorContacto(listado);
        recycler.setAdapter(adaptador);
        recycler.setLayoutManager( new LinearLayoutManager(getApplicationContext()));
    }
}