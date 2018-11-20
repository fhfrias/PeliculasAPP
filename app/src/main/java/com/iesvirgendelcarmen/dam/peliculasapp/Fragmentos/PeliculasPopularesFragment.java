package com.iesvirgendelcarmen.dam.peliculasapp.Fragmentos;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.iesvirgendelcarmen.dam.peliculasapp.Modelo.Pelicula;
import com.iesvirgendelcarmen.dam.peliculasapp.Modelo.PeliculaAdapter;
import com.iesvirgendelcarmen.dam.peliculasapp.Modelo.PeliculasAPI;
import com.iesvirgendelcarmen.dam.peliculasapp.Modelo.PeliculasResponse;
import com.iesvirgendelcarmen.dam.peliculasapp.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 */
public class PeliculasPopularesFragment extends Fragment {

    private ListView listView;
    private PeliculaAdapter adapter;
    private String apiKey = "ecade04f0950fc78674036e1ed5c4931";

    public PeliculasPopularesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_peliculas_populares, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listView = view.findViewById(R.id.listViewPeliculas);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PeliculasAPI api = retrofit.create(PeliculasAPI.class);
        Call<PeliculasResponse> call = api.getPeliculasPopulares(apiKey);

        call.enqueue(new Callback<PeliculasResponse>() {
            @Override
            public void onResponse(Call<PeliculasResponse> call, Response<PeliculasResponse> response) {
                PeliculasResponse peliculasResponse = response.body();
                List<Pelicula> pelis = peliculasResponse.getPeliculas();
                adapter = new PeliculaAdapter(getContext(), pelis);
                listView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<PeliculasResponse> call, Throwable t) {

            }
        });



    }
}
