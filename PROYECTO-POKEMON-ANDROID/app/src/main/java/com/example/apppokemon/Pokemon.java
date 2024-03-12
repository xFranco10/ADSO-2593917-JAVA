package com.example.apppokemon;

public class Pokemon {

    String numero_pokemon, nombre_pokemon, url_pokemon;

    public Pokemon(String numero_pokemon, String nombre_pokemon, String url_pokemon) {
        this.numero_pokemon = numero_pokemon;
        this.nombre_pokemon = nombre_pokemon;
        this.url_pokemon = url_pokemon;
    }

    public String getNumero_pokemon() {
        return numero_pokemon;
    }

    public void setNumero_pokemon(String numero_pokemon) {
        this.numero_pokemon = numero_pokemon;
    }

    public String getNombre_pokemon() {
        return nombre_pokemon;
    }

    public void setNombre_pokemon(String nombre_pokemon) {
        this.nombre_pokemon = nombre_pokemon;
    }

    public String getUrl_pokemon() {
        return url_pokemon;
    }

    public void setUrl_pokemon(String url_pokemon) {
        this.url_pokemon = url_pokemon;
    }
}
