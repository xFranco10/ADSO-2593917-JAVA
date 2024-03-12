package com.example.apppokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    List<Pokemon> listado;
    int offset = 0; // Contador de desplazamiento
    Button idBtnAnterior, idBtnSiguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler_pokemons);
        idBtnAnterior = findViewById(R.id.idBtnAnterior);
        idBtnSiguiente = findViewById(R.id.idBtnSiguiente);

        this.listado = new ArrayList<>();

        consumoGetListaPokemons();
        validacionBotones();
    }

    public void consumoGetListaPokemons(){

        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = "https://pokeapi.co/api/v2/pokemon?offset=0&limit=20";

        JsonObjectRequest solicitud =  new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println("El servidor responde OK");
                System.out.println(response.toString());

                extractsDatosPokemon(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor responde con un error:");
                System.out.println(error.getMessage());
            }
        });

        queue.add(solicitud);

    }

    public void extractsDatosPokemon(JSONObject data){
        try {
            //ConsumoJson dependiendo de la api y agrego a lista y la lista al adaptador
            JSONArray array = data.getJSONArray("results");
            for (int i = 0; i < array.length(); i++) {
                System.out.println("Longitud de arreglo: "+array.length());
                JSONObject pokemon = array.getJSONObject(i);
                String numPokemon = "00"+i;
                String name = pokemon.getString("name").toUpperCase();
                String url = pokemon.getString("url");

                listado.add(new Pokemon( numPokemon, name, url));
            }
            AdaptadorPokemon adaptador = new AdaptadorPokemon(listado);
            recycler.setAdapter(adaptador);
            recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnSiguiente(View vista){
        // Limpiamos la lista y el RecyclerView
        listado.clear();
        recycler.getAdapter().notifyDataSetChanged();

        // Aumentamos el offset para obtener los siguientes datos
        offset += 20;

        validacionBotones();
        consumoGetBotonSiguiente();
    }


    public void consumoGetBotonSiguiente(){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = "https://pokeapi.co/api/v2/pokemon?offset="+offset+"&limit=20";

        JsonObjectRequest solicitud =  new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println("El servidor responde OK");
                System.out.println(response.toString());

                extractsDatosPokemon(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor responde con un error:");
                System.out.println(error.getMessage());
            }
        });

        queue.add(solicitud);

    }

    public void btnAnterior(View vista){
        // Limpiamos la lista y el RecyclerView
        listado.clear();
        recycler.getAdapter().notifyDataSetChanged();

        // Aumentamos el offset para obtener los siguientes datos
        offset -= 20;

        validacionBotones();

        consumoGetBotonAtras();
    }

    public void consumoGetBotonAtras(){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = "https://pokeapi.co/api/v2/pokemon?offset="+offset+"&limit=20";

        JsonObjectRequest solicitud =  new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println("El servidor responde OK");
                System.out.println(response.toString());

                extractsDatosPokemon(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor responde con un error:");
                System.out.println(error.getMessage());
            }
        });

        queue.add(solicitud);

    }

    public void validacionBotones(){

        // Condición , si el offset llega al 1302, el botón de siguiente se debe poner disabled
        if (offset >= 1302) {
            idBtnSiguiente.setEnabled(false);
        } else {
            idBtnSiguiente.setEnabled(true);
        }

        //Condicion , si el offset llega a 0, el botón de anterior se debe poner disabled
        if (offset == 0) {
            idBtnAnterior.setEnabled(false);
        } else {
            idBtnAnterior.setEnabled(true);
        }

    }

}