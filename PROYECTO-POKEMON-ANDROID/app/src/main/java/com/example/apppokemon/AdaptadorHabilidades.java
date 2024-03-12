package com.example.apppokemon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorHabilidades extends RecyclerView.Adapter<AdaptadorHabilidades.ViewHolder> {

    List<HabilidadesPokemon> listaHabilidadesPokemon;

    public AdaptadorHabilidades(List<HabilidadesPokemon> lista){
        this.listaHabilidadesPokemon = lista;
    }
    @NonNull
    @Override
    public AdaptadorHabilidades.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_habilidades, parent, false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHabilidades.ViewHolder holder, int position) {
        HabilidadesPokemon temporal = listaHabilidadesPokemon.get(position);
        holder.cargarDatos(temporal);
    }

    @Override
    public int getItemCount() {
        return listaHabilidadesPokemon.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView etqHabilidades;

        Context contexto;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            contexto = itemView.getContext();

            etqHabilidades = itemView.findViewById(R.id.etqHabilidades);
        }

        public void cargarDatos(HabilidadesPokemon datos){
            etqHabilidades.setText(datos.getHabilidad());
        }
    }
}
