package com.iesvirgendelcarmen.dam.peliculasapp.Modelo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PeliculasAPI {

    @GET("movie/popular?language=es")
    public Call<PeliculasResponse> getPeliculasPopulares(@Query("api_key") String api_key);

    @GET("/movie/{id}")
    public Call<Pelicula> getPelicula(@Path("id") int id);
}
