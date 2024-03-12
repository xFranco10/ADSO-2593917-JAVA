package com.example.apppokemon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ImageViewTarget;

import java.util.List;

public class AdaptadorImagenes extends RecyclerView.Adapter< AdaptadorImagenes.ViewHolder > {

        List<ImagenPokemon> listaImagenPokemon;

        public AdaptadorImagenes(List<ImagenPokemon> lista){
            this.listaImagenPokemon = lista;
        }

        @NonNull
        @Override
        public AdaptadorImagenes.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_imagenes, parent, false);
            return new ViewHolder(vista);
        }

        @Override
        public void onBindViewHolder(@NonNull AdaptadorImagenes.ViewHolder holder, int position) {

            ImagenPokemon temporal = listaImagenPokemon.get(position);
            holder.cargarDatos(temporal);
        }

        @Override
        public int getItemCount() {
            return listaImagenPokemon.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView imgPokemon;
            Context contexto;
            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                contexto = itemView.getContext();
                imgPokemon = itemView.findViewById(R.id.imgPokemon);
            }

            public void cargarDatos(ImagenPokemon datos){
                String url = datos.getUrl_imagen();

                //Modificar la imagen in the imageview
                if (url.endsWith(".gif")){

                    // Cargar la imagen con Glide
                    Glide.with(contexto)
                            .asGif()
                            .load(datos.getUrl_imagen())
                            .into(new ImageViewTarget<GifDrawable>(imgPokemon) {
                                @Override
                                protected void setResource(@Nullable GifDrawable resource) {
                                    if (resource != null){
                                        imgPokemon.setImageDrawable(resource);
                                        resource.start(); //Inicia la animacion
                                    }else{
                                        System.out.println("resource es nulo");
                                    }
                                }
                            });

                }else{
                    //Si no es un Gif, carga la imagen normalmente

                    // Opciones para el tamaño de la imagen
                    RequestOptions options = new RequestOptions()
                            .override(150, 150); // Especifica el ancho y el alto en píxeles


                    // Cargar la imagen con Glide
                    Glide.with(contexto)
                            .load(datos.getUrl_imagen())
                            .apply(options) // Aplicar opciones de tamaño
                            .into(imgPokemon);

                }




            }
        }
    }
