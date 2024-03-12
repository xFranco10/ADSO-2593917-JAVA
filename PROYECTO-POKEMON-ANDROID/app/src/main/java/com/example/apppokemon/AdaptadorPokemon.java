package com.example.apppokemon;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class AdaptadorPokemon extends RecyclerView.Adapter< AdaptadorPokemon.ViewHolder >{

    List<Pokemon> listaPokemons;

    public AdaptadorPokemon(List<Pokemon> lista){
        this.listaPokemons = lista;
    }

    @NonNull
    @Override
    public AdaptadorPokemon.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pokemon, parent, false);
        return new ViewHolder(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorPokemon.ViewHolder holder, int position) {

        Pokemon temporal = listaPokemons.get(position);
        holder.cargarDatos(temporal);

    }


    @Override
    public int getItemCount() {
        return listaPokemons.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView etqNumPokemon, etqNombrePokemon;
        ImageView btnVerPokemon;
        Context contexto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            contexto = itemView.getContext();

            etqNumPokemon = itemView.findViewById(R.id.etqNumPokemon);
            etqNombrePokemon = itemView.findViewById(R.id.etqNombrePokemon);

            btnVerPokemon = itemView.findViewById(R.id.btnVerPokemon);
        }

        public void cargarDatos(Pokemon datos){
            etqNumPokemon.setText(datos.getNumero_pokemon());
            etqNombrePokemon.setText(datos.getNombre_pokemon());

            btnVerPokemon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intencion = new Intent(contexto, InterfazDetalles.class);
                    intencion.putExtra("nombres", datos.getNombre_pokemon());
                    intencion.putExtra("url", datos.getUrl_pokemon());
                    contexto.startActivity(intencion);
                }
            });
        }
    }
}
