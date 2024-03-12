package com.example.apppokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class InterfazDetalles extends AppCompatActivity {

    TextView etqNombrePokemon, etqAltura, etqPeso;

    String url_recibo;

    List<ImagenPokemon> listado;

    List<HabilidadesPokemon> listadoHabilidades;

    RecyclerView recycler, recycler_habilidades;

    ImageView loading_pokeball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_detalles);

        etqAltura = findViewById(R.id.etqAltura);
        etqPeso = findViewById(R.id.etqPeso);
        etqNombrePokemon = findViewById(R.id.etqNombrePokemon);
        recycler = findViewById(R.id.recycler_imgs_pokemons);
        recycler_habilidades = findViewById(R.id.recycler_habilidades);


        listado = new ArrayList<>();
        listadoHabilidades = new ArrayList<>();

        loading_pokeball = findViewById(R.id.loading_pokeball);
        Glide.with(this)
                .asGif()
                .load(R.drawable.loading_pokeball)
                .into(loading_pokeball);


        Bundle datos = getIntent().getExtras();
        String nombres = datos.getString("nombres").toUpperCase();
        this.url_recibo = datos.getString("url");

        etqNombrePokemon.setText(nombres);

        consumoGetImagenPokemon();

    }

    public void consumoGetImagenPokemon(){
        // Mostrar el GIF animado antes de hacer la solicitud de red
        loading_pokeball.setVisibility(View.VISIBLE);

        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = url_recibo;

        JsonObjectRequest solicitud =  new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                // Ocultar el GIF animado cuando se recibe la respuesta
                loading_pokeball.setVisibility(View.GONE);

                System.out.println("El servidor responde OK");
                System.out.println(response.toString());

                extractsImages(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                // Ocultar el GIF animado en caso de error
                loading_pokeball.setVisibility(View.GONE);

                System.out.println("El servidor responde con un error:");
                System.out.println(error.getMessage());
            }
        });

        queue.add(solicitud);

    }

    public void extractsImages(JSONObject data){
        try {
            //Consumo E imprimir la altura y el peso
            String height = data.getString("height");
            etqAltura.setText(height);
            String weight = data.getString("weight");
            etqPeso.setText(weight);

            //Consumo para las imagenes y agregarlas a la lista
            JSONObject sprites = data.getJSONObject("sprites");
            JSONObject other = sprites.getJSONObject("other");
            JSONObject showdown = other.getJSONObject("showdown");

            String front_default = showdown.getString("front_default");
            String back_default = showdown.getString("back_default");
            String front_shiny = showdown.getString("front_shiny");
            String back_shiny = showdown.getString("back_shiny");

            listado.add(new ImagenPokemon(front_default));
            listado.add(new ImagenPokemon(back_default));
            listado.add(new ImagenPokemon(front_shiny));
            listado.add(new ImagenPokemon(back_shiny));

            AdaptadorImagenes adaptador = new AdaptadorImagenes(listado);
            recycler.setAdapter(adaptador);
            recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));

            JSONArray abilities = data.getJSONArray("abilities");
            System.out.println("Estos son los abillites: "+abilities);
            for (int i = 0; i < abilities.length(); i++) {
                JSONObject object = abilities.getJSONObject(i);
                System.out.println("Esta es la posicion del objeto que esta recorriendo: "+i);
                JSONObject ability = object.getJSONObject("ability");
                System.out.println("Este es el objeto ability: "+ability);
                String name = ability.getString("name");
                System.out.println("Este es el nombre: "+name);

                listadoHabilidades.add(new HabilidadesPokemon(name));
            }
            AdaptadorHabilidades adaptador_habilidades = new AdaptadorHabilidades(listadoHabilidades);
            recycler_habilidades.setAdapter(adaptador_habilidades);
            recycler_habilidades.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }


}