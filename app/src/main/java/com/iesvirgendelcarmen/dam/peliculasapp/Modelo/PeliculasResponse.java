package com.iesvirgendelcarmen.dam.peliculasapp.Modelo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PeliculasResponse {

    @SerializedName("page")
    private int pagina;

    @SerializedName("total_results")
    private int total_resultados;

    @SerializedName("total_page")
    private int total_paginas;

    @SerializedName("results")
    private List<Pelicula> peliculas;

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public int getTotal_resultados() {
        return total_resultados;
    }

    public void setTotal_resultados(int total_resultados) {
        this.total_resultados = total_resultados;
    }

    public int getTotal_paginas() {
        return total_paginas;
    }

    public void setTotal_paginas(int total_paginas) {
        this.total_paginas = total_paginas;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
}
