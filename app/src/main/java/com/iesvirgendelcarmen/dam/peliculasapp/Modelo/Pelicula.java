package com.iesvirgendelcarmen.dam.peliculasapp.Modelo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

    @SerializedName("id")
    private int id;

    @SerializedName("title")
    private String titulo;

    @SerializedName("poster_path")
    private String portada;

    @SerializedName("overview")
    private String sinopsis;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public static List<Pelicula> mockPeliculas() {
        List<Pelicula> pelis = new ArrayList<Pelicula>();

        Pelicula p1 = new Pelicula();
        p1.setId(1);
        p1.setTitulo("Animales fantásticos: Los crímenes de Grindelwald");
        p1.setPortada("/zs6LFuE4aB1I8crKjAhlPVTHAOS.jpg");
        p1.setSinopsis("");

        pelis.add(p1);

        p1 = new Pelicula();
        p1.setId(2);
        p1.setTitulo("Misión imposible: Fallout");
        p1.setPortada("/aw4FOsWr2FY373nKSxbpNi3fz4F.jpg");
        p1.setSinopsis("");

        pelis.add(p1);

        return pelis;

    }
}
